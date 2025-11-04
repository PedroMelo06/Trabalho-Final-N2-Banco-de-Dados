/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

public class Acompanhante {
    private String idAcompanhante;
    private String nome;
    private String parentesco;
    private String telefone;
    private String cpfPaciente;
    
    public Acompanhante() {
    }

    public Acompanhante(String nome) {
        this();
        this.nome = nome;
    }

    public Acompanhante(String nome, String parentesco) {
        this(nome);
        this.parentesco = parentesco;
    }

    public Acompanhante(String nome, String parentesco, String telefone) {
        this(nome, parentesco);
        this.telefone = telefone;
    }

    public Acompanhante(String nome, String parentesco, String telefone, String cpfPaciente) {
        this(nome, parentesco, telefone);
        this.cpfPaciente = cpfPaciente;
    }

    public String getIdAcompanhante() {
        return idAcompanhante;
    }

    public void setIdAcompanhante(String idAcompanhante) {
        this.idAcompanhante = idAcompanhante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
}
