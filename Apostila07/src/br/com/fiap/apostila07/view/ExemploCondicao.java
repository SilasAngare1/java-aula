package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicao {


    public static void main(String[] args) {

        String mediaFinal = JOptionPane.showInputDialog("Digite a media final");

        double nota = Double.parseDouble(mediaFinal);

        if (nota > 6 ){
            JOptionPane.showMessageDialog(null, "Aluno Aprovado");
        }else if (nota >=4 && nota <=5.9){
            JOptionPane.showMessageDialog(null, "Aluno de Exame ");
        } else {
            JOptionPane.showMessageDialog(null, "Retido");
        }

    }//main


}//class
