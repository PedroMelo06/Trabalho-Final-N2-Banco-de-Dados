/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.services;

import ucb.estudo.dao.LogAuditoriaRepositorio;
import ucb.estudo.model.LogAuditoria;
import org.springframework.stereotype.Service;
import java.util.Collections;

@Service
public class AuditoriaService {
    private final LogAuditoriaRepositorio logAuditoriaRepository;

    public AuditoriaService(LogAuditoriaRepositorio logAuditoriaRepository) {
        this.logAuditoriaRepository = logAuditoriaRepository;
    }

    // Loga um evento de sucesso de login
    public void logLoginSucesso(String username, String ip) {
        LogAuditoria log = new LogAuditoria(
            username, 
            "LOGIN_SUCESSO", 
            ip
        );
        logAuditoriaRepository.save(log);
    }

    // Loga um evento de falha de login
    public void logLoginFalha(String usernameTentado, String ip) {
        LogAuditoria log = new LogAuditoria(
            usernameTentado, 
            "LOGIN_FALHA", 
            ip
        );
        log.setDetalhes(Collections.singletonMap("motivo", "Credenciais Inválidas"));
        logAuditoriaRepository.save(log);
    }
    
    // Loga outras operações (Ex: INSERT, UPDATE, DELETE)
    public void logOperacao(String username, String acao, String entidade, String idRegistro, String ip, Object dadosAnterior) {
        // Implementação completa para logar CRUD, usando o construtor completo
        // ... (Fica para a implementação nos Controllers)
    }
}
