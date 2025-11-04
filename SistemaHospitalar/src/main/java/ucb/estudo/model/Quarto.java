/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.model;

public class Quarto {
    private int idQuarto;
    private int capacidade;

    public Quarto() {
    }

    public Quarto(int capacidade) {
        this.capacidade = capacidade;
    }

    public Quarto(int idQuarto, int capacidade) {
        this.idQuarto = idQuarto;
        this.capacidade = capacidade;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
