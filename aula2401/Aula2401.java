/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2401;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/**
 *
 * @author vilson.moro
 */
public class Aula2401 {

    public static void main(String[] args) {
      Pedido p = new Pedido("Feijão",10,10,10,0);
      System.out.println(String.format("%.2f", p.getTotal()));
      
      Pedido p1 = new Pedido("Arroz",10,10,0,10);
      System.out.println(String.format("%.2f", p1.getTotal()));
    }

    void excecoes(){
        try{
        Pessoa obj = null;
            obj.getNome();
        }
        catch(NullPointerException ex){
            System.out.println("O objeto pessoa não foi instanciado utilize new");
        }
            
        try {
            int x = 10;
            int y = 0;
            System.out.println(x / y);
            
        }
        catch(ArithmeticException ex){
            
        }
        System.out.println("Continuando.. ");
    }
    void testeIdadeImc() {
        Pessoa obj = new Pessoa();
        obj.setNome("José");
        obj.setPeso(73);
        obj.setAltura(1.77);

        LocalDate dt = LocalDate.of(2000, Month.JANUARY, 24);
        obj.setDatanasc(dt);
        System.out.println(obj.imc());
        System.out.println("idade: " + obj.calculaIdade());
    }

    static void datas() {
        /*  Calendar c = Calendar.getInstance();
       c.set(2021, 0, 24);
       System.out.println(c.getTime());
         */

        LocalDate dt = LocalDate.of(2000, Month.JULY, 04);
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getMonth());
        System.out.println(dt.getYear());

        LocalDate dt1 = LocalDate.now();
        System.out.println(dt1.getDayOfMonth());
        System.out.println(dt1.getMonth());
        System.out.println(dt1.getYear());

        /* System.out.println(dt);
       System.out.println(dt.getYear());*/
    }

    public static void memorando() {
        Memorando obj2 = new Memorando("Hora do lanche", "Pessoal da cozinha", "Nois");
        System.out.println(obj2.toString());

        Memorando obj3 = new Memorando("Gratificação de natal");
        obj3.setDestinatario("Financeiro");
        obj3.listar();
    }
}
