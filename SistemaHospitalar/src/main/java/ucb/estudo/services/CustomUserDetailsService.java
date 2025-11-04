/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.services;

import ucb.estudo.model.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import java.util.Collections;
import ucb.estudo.dao.UsuarioRepositorio;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UsuarioRepositorio usuarioRepository;

    public CustomUserDetailsService(UsuarioRepositorio usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado: " + username));

        String roleName = "ROLE_" + usuario.getGrupo().getNomeGrupo().toUpperCase();
        
        return new org.springframework.security.core.userdetails.User(
            usuario.getUsername(), 
            usuario.getSenhaHash(), 
            Collections.singletonList(new SimpleGrantedAuthority(roleName)) 
        );
    }
}
