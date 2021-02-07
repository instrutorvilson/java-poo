/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2401;

import java.time.LocalDate;
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private LocalDate datanasc;
    
    public int calculaIdade(){
        int idade = 0;
        
        int anoNasc = this.datanasc.getYear();
        int mesNasc = this.datanasc.getMonthValue();
        int diaNasc = this.datanasc.getDayOfMonth();
        
        LocalDate dataHoje = LocalDate.now();
        int anoHoje = dataHoje.getYear();
        int mesHoje = dataHoje.getMonthValue();
        int diaHoje = dataHoje.getDayOfMonth();
        
        idade = anoHoje - anoNasc;
        if(mesHoje < mesNasc)
            idade = idade -1;
        else if (mesHoje == mesNasc){
            if (diaHoje < diaNasc)
                idade = idade - 1;
        }        
        
        return idade;
    }

    public String imc(){
        String status = "Vc está ok";
        //p/h*h
        double indice = (this.peso/(this.altura * this.altura));
        if(indice < 18.5)
           status = "Magreza";
        else if (indice < 25)
            status = "Peso normal";
        else if(indice < 30)
            status = "Sobrepeso";
        else if(indice < 35)
            status = "Obesidade grau I";
        else if(indice < 40)
            status = "Obesidade grau II";
        else if(indice > 40)
            status = "Obesidade grau III";
        System.out.println("indice = " + indice);
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }
    
    
}
