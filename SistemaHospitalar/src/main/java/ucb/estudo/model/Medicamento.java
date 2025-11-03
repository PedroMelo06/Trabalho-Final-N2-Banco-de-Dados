package ucb.estudo.model;

import java.time.LocalDate;

public class Medicamento {
    
    private String idMedicamento;
    private String nome;
    private LocalDate validade;

    public Medicamento() {
    }

    public Medicamento(String idMedicamento, String nome, LocalDate validade) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.validade = validade;
    }

    public String getIdMedicamento() {
        return idMedicamento;
    }
    
    public void setIdMedicamento(String idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getValidade() {
        return validade;
    }
    
    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

}
