package ucb.estudo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "grupos_usuarios")
public class GrupoUsuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grupo")
    private String idGrupo;
    
    @Column(name = "nome_grupo", unique = true, nullable = false)
    private String nomeGrupo;
    
    private String descricao;

    public GrupoUsuarios() {
    }

    public GrupoUsuarios(String idGrupo, String nomeGrupo) {
        this.idGrupo = idGrupo;
        this.nomeGrupo = nomeGrupo;
    }

    public String getIdGrupo() {
        return idGrupo; 
    }
    
    public void setIdGrupo(String idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo; 
    }
    
    public void setNomeGrupo(String nomeGrupo) { 
        this.nomeGrupo = nomeGrupo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
