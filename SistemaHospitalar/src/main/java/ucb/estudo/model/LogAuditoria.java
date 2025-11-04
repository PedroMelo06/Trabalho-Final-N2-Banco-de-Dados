/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ucb.estudo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.Map;

@Document(collection = "logs_auditoria")

public class LogAuditoria {
    @Id
    private String id; 
    private Date timestamp = new Date();
    private String usuarioUsername;
    private String tipoAcao;
    private String entidadeAfetada; 
    private String registroId; 
    private String ipOrigem; 
    private Map<String, Object> detalhes;
    
    public LogAuditoria() {
    }

    public LogAuditoria(String usuarioUsername, String tipoAcao, String entidadeAfetada, String registroId, String ipOrigem, Map<String, Object> detalhes) {
        this.usuarioUsername = usuarioUsername;
        this.tipoAcao = tipoAcao;
        this.entidadeAfetada = entidadeAfetada;
        this.registroId = registroId;
        this.ipOrigem = ipOrigem;
        this.detalhes = detalhes;
    }

    public LogAuditoria(String usuarioUsername, String tipoAcao, String ipOrigem) {
        this.usuarioUsername = usuarioUsername;
        this.tipoAcao = tipoAcao;
        this.ipOrigem = ipOrigem;
    }
   
    public String getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getUsuarioUsername() {
        return usuarioUsername;
    }

    public void setUsuarioUsername(String usuarioUsername) {
        this.usuarioUsername = usuarioUsername;
    }

    public String getTipoAcao() {
        return tipoAcao;
    }

    public void setTipoAcao(String tipoAcao) {
        this.tipoAcao = tipoAcao;
    }

    public String getEntidadeAfetada() {
        return entidadeAfetada;
    }

    public void setEntidadeAfetada(String entidadeAfetada) {
        this.entidadeAfetada = entidadeAfetada;
    }

    public String getRegistroId() {
        return registroId;
    }

    public void setRegistroId(String registroId) {
        this.registroId = registroId;
    }

    public String getIpOrigem() {
        return ipOrigem;
    }

    public void setIpOrigem(String ipOrigem) {
        this.ipOrigem = ipOrigem;
    }

    public Map<String, Object> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Map<String, Object> detalhes) {
        this.detalhes = detalhes;
    }
    
}
