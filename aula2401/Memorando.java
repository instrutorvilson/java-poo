/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2401;

public class Memorando {

     private String assunto;
     private String destinatario;
     private String signatario;   

    Memorando() {
        //  
    }

    Memorando(String assunto) {
        this.assunto = assunto;
    }

    Memorando(String assunto, String destinatario) {
        this.assunto = assunto;
        this.destinatario = destinatario;
    }

    Memorando(String assunto, String destinatario, String signatario) {
        this(assunto, destinatario);
        this.signatario = signatario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Memorando{assunto=").append(assunto);
        sb.append(", destinatario=").append(destinatario);
        sb.append(", signatario=").append(signatario);
        sb.append('}');
        return sb.toString();
    }
    
    

    void listar() {
        System.out.println(assunto);
        System.out.println(destinatario);
        System.out.println(signatario);
        System.out.println("");
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getSignatario() {
        return signatario;
    }

    public void setSignatario(String signatario) {
        this.signatario = signatario;
    }
}
