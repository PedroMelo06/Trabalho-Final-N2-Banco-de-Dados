/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

public class Email {
    private String remetente;
    private String destinatario;
    private String assunto;
    private String mensagem;
    
    public Email() {
    }

    public Email(String destinatario) {
        this();
        this.destinatario = destinatario;
    }

    public Email(String destinatario, String assunto) {
        this(destinatario);
        this.assunto = assunto;
    }

    public Email(String destinatario, String assunto, String mensagem) {
        this(destinatario, assunto);
        this.mensagem = mensagem;
    }

    public Email(String remetente, String destinatario, String assunto, String mensagem) {
        this(destinatario, assunto, mensagem);
        this.remetente = remetente;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
