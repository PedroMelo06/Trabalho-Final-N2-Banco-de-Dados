package ucb.estudo.model;

public class Endereco {
    private String rua;
    private String cidade;
    private int numero;

    public Endereco(String rua, String cidade, int numero) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
    }
    
    public String enderecoCompleto() {
        return "Rua: " + rua + ", Numero: " + numero + ", Cidade: " + cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
