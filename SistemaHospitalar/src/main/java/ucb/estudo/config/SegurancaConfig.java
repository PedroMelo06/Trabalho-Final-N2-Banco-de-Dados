/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.config;

import ucb.estudo.services.CustomUserDetailsService;
import ucb.estudo.services.AuditoriaService; // Novo serviço para logar no MongoDB
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {
    private final CustomUserDetailsService userDetailsService;
    private final AuditoriaService auditoriaService;

    public SegurancaConfig(CustomUserDetailsService userDetailsService, AuditoriaService auditoriaService) {
        this.userDetailsService = userDetailsService;
        this.auditoriaService = auditoriaService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**", "/api/pessoa/registro").permitAll()
                
                .requestMatchers("/api/admin/**").hasRole("ADMINISTRADOR") // Apenas Admin
                .requestMatchers("/api/medico/**", "/api/diagnostico/**", "/api/prescricao/**").hasAnyRole("ADMINISTRADOR", "MEDICO")
                .requestMatchers("/api/paciente/**", "/api/consulta/**").hasAnyRole("ADMINISTRADOR", "MEDICO", "RECEPCAO")
                
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginProcessingUrl("/api/auth/login") 
                .successHandler(authenticationSuccessHandler()) 
                .failureHandler(authenticationFailureHandler()) 
                .permitAll()
            )
            .userDetailsService(userDetailsService); 

        return http.build();
    }
    
    @Bean
    public AuthenticationSuccessHandler authenticationSuccessHandler() {
        return (request, response, authentication) -> {
            auditoriaService.logLoginSucesso(authentication.getName(), getClientIp(request));
            
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().write("Login bem-sucedido. Usuário: " + authentication.getName());
            response.getWriter().flush();
        };
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return (request, response, exception) -> {
            String usernameTentado = request.getParameter("username"); 
            auditoriaService.logLoginFalha(usernameTentado, getClientIp(request));

            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Falha na autenticação: Credenciais inválidas.");
            response.getWriter().flush();
        };
    }

    private String getClientIp(HttpServletRequest request) {
        return request.getHeader("X-Forwarded-For") != null ? 
               request.getHeader("X-Forwarded-For") : 
               request.getRemoteAddr();
    }
}
