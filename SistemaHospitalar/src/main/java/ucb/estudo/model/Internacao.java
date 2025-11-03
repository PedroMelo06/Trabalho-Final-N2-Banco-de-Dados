package ucb.estudo.model;

import java.time.LocalDate;

public class Internacao {
    
    private String idInternacao;
    private String idQuarto;
    private String idPaciente;
    private String idDiagnostico;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    public Internacao() {
    }

    public Internacao(String idInternacao, String idQuarto, String idPaciente, String idDiagnostico,
                      LocalDate dataEntrada, LocalDate dataSaida) {
        this.idInternacao = idInternacao;
        this.idQuarto = idQuarto;
        this.idPaciente = idPaciente;
        this.idDiagnostico = idDiagnostico;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getIdInternacao() {
        return idInternacao;
    }
    
    public void setIdInternacao(String idInternacao) {
        this.idInternacao = idInternacao;
    }

    public String getIdQuarto() {
        return idQuarto;
    }
    
    public void setIdQuarto(String idQuarto) {
        this.idQuarto = idQuarto;
    }

    public String getIdPaciente() {
        return idPaciente;
    }
    
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdDiagnostico() {
        return idDiagnostico;
    }
    
    public void setIdDiagnostico(String idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }
    
    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }
    
    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }
    
}
