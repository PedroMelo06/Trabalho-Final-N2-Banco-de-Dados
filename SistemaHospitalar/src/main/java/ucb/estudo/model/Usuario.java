/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

public class Usuario {
    private int idUsuario;
    private String username;
    private String senhaHash;
    private String pessoaCpf;
    private int idGrupo;

    public Usuario() {
    }

    public Usuario(String username, String senhaHash, int idGrupo) {
        this.username = username;
        this.senhaHash = senhaHash;
        this.idGrupo = idGrupo;
    }
    
    public Usuario(String username, String senhaHash, String pessoaCpf, int idGrupo) {
        this.username = username;
        this.senhaHash = senhaHash;
        this.pessoaCpf = pessoaCpf;
        this.idGrupo = idGrupo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public String getPessoaCpf() {
        return pessoaCpf;
    }

    public void setPessoaCpf(String pessoaCpf) {
        this.pessoaCpf = pessoaCpf;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }
    
}
