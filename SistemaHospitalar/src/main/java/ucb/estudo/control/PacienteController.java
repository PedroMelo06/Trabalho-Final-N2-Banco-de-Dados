/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.control;

import ucb.estudo.model.Pessoa;
import ucb.estudo.model.Paciente;
import ucb.estudo.services.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Paciente> cadastrarPaciente(
        @RequestBody PacientePessoaRequest request, // Objeto de requisição combinando Pessoa e Paciente
        Authentication authentication, 
        HttpServletRequest httpServletRequest
    ) {
        // 1. Obtém informações de auditoria
        String username = authentication.getName(); // Usuário logado
        String ip = httpServletRequest.getRemoteAddr();

        try {
            // 2. Chama o serviço para salvar (MySQL) e auditar (MongoDB)
            Paciente novoPaciente = pacienteService.cadastrarNovo(
                request.getPessoa(), 
                request.getPaciente(), 
                username, 
                ip
            );
            
            return ResponseEntity.ok(novoPaciente);
            
        } catch (Exception e) {
            // Logar o erro no console/sistema de monitoramento de erros
            return ResponseEntity.badRequest().build();
        }
    }
    
    // ... Outros endpoints (GET, PUT, DELETE)
}

// Classe auxiliar para receber os dados combinados do JSON de entrada
class PacientePessoaRequest {
    private Pessoa pessoa;
    private Paciente paciente;
    
    // Getters e Setters
    public Pessoa getPessoa() { return pessoa; }
    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
}
