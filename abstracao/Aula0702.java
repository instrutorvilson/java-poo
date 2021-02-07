/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0702;

/**
 *
 * @author vilson.moro
 */
public class Aula0702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /* Pessoa pessoa = new Pessoa();
      pessoa.setId(10);
      pessoa.setNome("Joazinho");
      pessoa.setEmail("joazinho@gmail.com");
      pessoa.setFone("98852-4578");
      System.out.println(pessoa.toString());
      */
   //  Pessoa p = new Pessoa(10, "Mariazinha",
    //         "mariazinha@gmail.com", "7070-7060");
    // System.out.println(p.toString());
     
    
     /*Aluno aluno = new Aluno();
       aluno.setId(10);
       aluno.setNome("José da Silva");
       aluno.setMatricula(123);
       aluno.setEmail("jose@gmail.com");
       aluno.setFone("98854-7896");
       aluno.setMedia(-1);
       aluno.setFrequencia(70);
        System.out.println(aluno.toString());
      */
      Aluno a = new Aluno(123, 6.9f, 100, 
                10, 
                "Mariazinha",
                "mariazinha@gmail.com", 
                "7070-7060");
        System.out.println(a.toString());
        System.out.println(a.getSituacao());
        a.create();
    }
    
}
