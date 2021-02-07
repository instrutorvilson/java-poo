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
public class Agregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Motor motor = new Motor();
       motor.setCapacidade("300hp");
       motor.setTipoCombustivel("Diesel");
       //System.out.println(motor.toString());
       
       Veiculo veiculo = new Veiculo();
       veiculo.setMarca("Ford");
       veiculo.setModelo("F-14000");
       veiculo.setMotor(motor);
        System.out.println(veiculo.toString());
    }
    
}
