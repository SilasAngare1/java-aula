package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString2 {

    public static void main(String[] args) {
        //Ler um e-mail do usuario
        String email = JOptionPane.showInputDialog("Digite o email");

        //Valida se o email é valido (se tem @ e .)
        int posicao = email.indexOf("@");
        int posicao2 = email.indexOf(".");

        if (posicao !=-1 && posicao2 !=-1){
            JOptionPane.showMessageDialog(null, "Email válido");
        } else {

            JOptionPane.showMessageDialog(null, "válido");
        }


        //separar o email do dominio

        String parte1 = email.substring(0,posicao);
        String parte2 = email.substring( posicao +1 , posicao2);

        System.out.println(parte1+" "+  parte2);



    }
}
