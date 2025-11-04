/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.dao;

import ucb.estudo.model.LogAuditoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogAuditoriaRepositorio extends MongoRepository<LogAuditoria, String> {

    // O MongoRepository fornece automaticamente:
    // .save(LogAuditoria log) -> Salva/Atualiza o log
    // .findAll() -> Busca todos os logs
    // .findById(String id) -> Busca um log pelo ID
    // ... e muitos outros.

    // Você pode adicionar métodos customizados aqui, se necessário.
    // Exemplo: List<LogAuditoria> findByUsuarioUsername(String username);
}