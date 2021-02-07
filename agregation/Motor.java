/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregation;

/**
 *
 * @author vilson.moro
 */
public class Motor {
    private String tipoCombustivel;
    private String capacidade;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipoCombustivel=" + tipoCombustivel + ", capacidade=" + capacidade + '}';
    }
    
    
}
