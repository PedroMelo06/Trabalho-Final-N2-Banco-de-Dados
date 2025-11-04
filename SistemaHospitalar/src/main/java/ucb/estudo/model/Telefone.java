/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

public class Telefone {
    private int idTelefone; 
    private String numero;
    private String pessoaCpf; 

    public Telefone() {
    }

    public Telefone(String numero, String pessoaCpf) {
        this.numero = numero;
        this.pessoaCpf = pessoaCpf;
    }

    public Telefone(int idTelefone, String numero, String pessoaCpf) {
        this.idTelefone = idTelefone;
        this.numero = numero;
        this.pessoaCpf = pessoaCpf;
    }

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPessoaCpf() {
        return pessoaCpf;
    }

    public void setPessoaCpf(String pessoaCpf) {
        this.pessoaCpf = pessoaCpf;
    }

}
