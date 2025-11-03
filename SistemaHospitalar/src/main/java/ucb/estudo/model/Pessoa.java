/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

import java.time.LocalDate;

public class Pessoa {
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    public Pessoa() {
    }
    
    public Pessoa(String nome) {
        this(); 
        this.nome = nome;
    }
    
    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }
    
    public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
        this(nome, cpf);
        this.dataNascimento = dataNascimento;
    }
    
    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String telefone, String email) {
        this(nome, cpf, dataNascimento);
        this.telefone = telefone;
        this.email = email;
    }

    public Pessoa(String nome, String cpf, LocalDate dataNascimento, String telefone, String email, Endereco endereco) {
        this(nome, cpf, dataNascimento, telefone, email);
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
