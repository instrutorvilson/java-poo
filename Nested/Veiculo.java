/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0702.pkg2;

/**
 *
 * @author vilson.moro
 */
public class Veiculo {
  private String marca;
  private String modelo;
  
    class Motor{
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

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }

     
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
}
