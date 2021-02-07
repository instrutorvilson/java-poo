/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolacomposicao;

/**
 *
 * @author vilson.moro
 */
public class EscolaComposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(10, "Joazinho","joazinho@gmail.com","98521-8956");
       // System.out.println(pessoa.toString());
        
        Aluno aluno = new Aluno(123, 70, 100, pessoa);
        System.out.println(aluno.toString());
    }
    
}
