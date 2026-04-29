package br.com.fiap.apostila08ex.view;

import javax.swing.*;
import java.util.Locale;

public class TesteString3 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite uma palavra");


        System.out.println(nome.toUpperCase());

        String nome1 = nome.replaceAll("[aeiou]", "*");

        System.out.println(nome1);




    }




}
