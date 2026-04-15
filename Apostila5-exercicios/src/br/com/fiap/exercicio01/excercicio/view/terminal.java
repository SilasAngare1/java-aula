package br.com.fiap.exercicio01.excercicio.view;

import br.com.fiap.exercicio01.excercicio.model.Data;

import java.util.Scanner;

public class terminal {

    public static void main(String[] args) {

        Data data = new Data();

        data.setDia(21);
        data.setMes(05);
        data.setAno(2004);

        System.out.println(data.dataFormatada());
        System.out.println("Mes:"+ data.getNomeMes());
    }
}
