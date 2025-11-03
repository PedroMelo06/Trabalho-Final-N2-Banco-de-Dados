/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.estudo.view;

import java.time.LocalDate;
import ucb.estudo.model.Endereco;
import ucb.estudo.model.Pessoa;

public class SistemaHospitalar {

    public static void main(String[] args) {
        
        //TESTANDO CLASSE ENDERECO
        Endereco enderecoJoao = new Endereco("Rua das Palmeiras", "Campinas", 45);

        Pessoa joao = new Pessoa(
            "Joao Silva",
            "123.456.789-00",
            LocalDate.of(1990, 5, 15),
            "99999-8888",
            "joao@email.com",
            enderecoJoao 
        );

        System.out.println("Nome: " + joao.getNome());
        System.out.println("Rua: " + joao.getEndereco().getRua());
        System.out.println("Endereco Completo: " + joao.getEndereco().enderecoCompleto());
    }
    
}

