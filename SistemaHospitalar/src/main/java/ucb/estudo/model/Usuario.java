/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;
    
    @Column(unique = true, nullable = false)
    private String username;
    
    @Column(name = "senha_hash", nullable = false)
    private String senhaHash;
    
    @Column(name = "pessoa_CPF", unique = true)
    private String pessoaCpf;
    
    @ManyToOne(fetch = FetchType.EAGER) 
    @JoinColumn(name = "id_grupo") 
    private GrupoUsuarios grupo;
    
    public Usuario() {
    }

    public Usuario(String username, String senhaHash, int idGrupo) {
        this.username = username;
        this.senhaHash = senhaHash;
        this.grupo = grupo;
    }
    
    public Usuario(String username, String senhaHash, String pessoaCpf, int idGrupo) {
        this.username = username;
        this.senhaHash = senhaHash;
        this.pessoaCpf = pessoaCpf;
        this.grupo = grupo;
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

    public GrupoUsuarios getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoUsuarios grupo) {
        this.grupo = grupo;
    }
   
}
