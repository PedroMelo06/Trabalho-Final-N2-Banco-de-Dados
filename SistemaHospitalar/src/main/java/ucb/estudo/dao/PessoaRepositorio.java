/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.dao;

import ucb.estudo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import ucb.estudo.model.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Paciente, String> {

    public Pessoa save(Pessoa pessoa);
    
}
