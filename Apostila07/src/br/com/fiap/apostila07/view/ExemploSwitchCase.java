package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploSwitchCase {

    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Digite o numero 1");
        String numero2 = JOptionPane.showInputDialog("Digite o numero 2");

        Double numero = Double.parseDouble(numero1);
        Double segundoNumero = Double.parseDouble(numero2);

        String operacao = JOptionPane.showInputDialog("Digite a operacao");
        int operacao1 = Integer.parseInt(operacao);


        switch (operacao1) {

            case 1:{
                double resultado = numero + segundoNumero;
                System.out.println(resultado);
            }

            case 2: {
                double resultado2 = numero - segundoNumero;
                System.out.println(resultado2);
            }

            case 3:{
                double resultado3 = (double) numero / segundoNumero;
                System.out.println("resultado" +resultado3);}


            case 4:{
                double resultado4 = numero * segundoNumero;
                System.out.println(resultado4);
            }

            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida");

        }





    }//main
}//class
