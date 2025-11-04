/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

public class Prescricao {
    private int idDiagnosticoMedicamento;
    private String dosagem;
    private String frequencia;
    private String duracao;
    private int diagnosticoId;
    private int medicamentoId;

    public Prescricao() {
    }

    public Prescricao(String dosagem, String frequencia, String duracao, int diagnosticoId, int medicamentoId) {
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.duracao = duracao;
        this.diagnosticoId = diagnosticoId;
        this.medicamentoId = medicamentoId;
    }
    
    public Prescricao(int idDiagnosticoMedicamento, String dosagem, String frequencia, String duracao, int diagnosticoId, int medicamentoId) {
        this.idDiagnosticoMedicamento = idDiagnosticoMedicamento;
        this.dosagem = dosagem;
        this.frequencia = frequencia;
        this.duracao = duracao;
        this.diagnosticoId = diagnosticoId;
        this.medicamentoId = medicamentoId;
    }

    public int getIdDiagnosticoMedicamento() {
        return idDiagnosticoMedicamento;
    }

    public void setIdDiagnosticoMedicamento(int idDiagnosticoMedicamento) {
        this.idDiagnosticoMedicamento = idDiagnosticoMedicamento;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getDiagnosticoId() {
        return diagnosticoId;
    }

    public void setDiagnosticoId(int diagnosticoId) {
        this.diagnosticoId = diagnosticoId;
    }

    public int getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(int medicamentoId) {
        this.medicamentoId = medicamentoId;
    }
    
}
