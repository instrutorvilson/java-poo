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
public class Aula07022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo  veiculo = new Veiculo();
        veiculo.setMarca("Ford");
        veiculo.setModelo("Ford ka");
        
        Veiculo.Motor motor = veiculo.new Motor();
        motor.setTipoCombustivel("Gasolina");
        motor.setCapacidade("300hp");
        
        System.out.println(veiculo.toString());
        System.out.println(motor.toString());
    }
    
}
