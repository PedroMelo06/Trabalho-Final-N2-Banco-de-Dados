package ucb.estudo.model;

public class GrupoUsuario {
    
    private String idGrupo;
    private String nomeGrupo;

    public GrupoUsuario() {
    }

    public GrupoUsuario(String idGrupo, String nomeGrupo) {
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

}
