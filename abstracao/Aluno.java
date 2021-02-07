/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0702;

import java.util.List;

/**
 *
 * @author vilson.moro
 */
public class Aluno extends Pessoa {
   private int matricula;
   private float media;
   private float frequencia;
   
   
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
       /* if(media >= 0 & media <= 10)
          this.media = media;
        else
            System.out.println("Média inválida");  */
       if(media < 0 || media > 10)
         System.out.println("Media inválida");
       else
         this.media = media; 
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        if(frequencia < 0 || frequencia > 100)
          System.out.println("Frequencia inválida");
        else
          this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return super.toString()+ "Aluno{" + "matricula=" + matricula + ", media=" + media + ", frequencia=" + frequencia + '}';
    }

    public Aluno(int matricula, float media, float frequencia) {
        this.matricula = matricula;
        this.media = media;
        this.frequencia = frequencia;
    }

    public Aluno(int matricula, float media, float frequencia, int id, String nome, String email, String fone) {
        super(id, nome, email, fone);
        this.matricula = matricula;
        this.setMedia(media);
        this.setFrequencia(frequencia);
    }
    
    public String getSituacao(){
        String msg = "Aprovado";
          if(media < 7 || frequencia < 75)
             msg = "Reprovado";
        return msg;
    }

    @Override
    public boolean create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa retrieve(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pessoa> retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
