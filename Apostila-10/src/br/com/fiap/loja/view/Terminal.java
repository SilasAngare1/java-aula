package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Eletronico;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {

        Eletronico eletronico = new Eletronico(1000, "computador", true );

        Scanner leitor = new Scanner(System.in);




        System.out.println("informe o cupom");

        String cupom = leitor.nextLine();

        double precoFinal1 = eletronico.calcularDesconto(cupom);


        System.out.println(precoFinal1);
    }
}
