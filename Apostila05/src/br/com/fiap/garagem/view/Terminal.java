package br.com.fiap.garagem.view;

import br.com.fiap.garagem.model.Carro;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto carro
        Carro onix = new Carro();
        onix.setPlaca("ABC1234");
        onix.setHoraSaida("10:00");
        onix.setHoraEntrada("08:00");
        onix.setNumeroVaga(21);
        onix.setSetor('A');
        onix.setPreferencial(true);
        onix.setValor(15);

        /// exibir dados Carro

        System.out.println("Placa:" + onix.getPlaca());
        System.out.println("Hora Entrada:" + onix.getHoraEntrada());
        System.out.println("Hora saida:" + onix.gethoraSaida());
        System.out.println("Valor:" + onix.getValor());
        System.out.println("Preferencial:" +onix.getpreferencial());
        System.out.println("Vaga:" + onix.getNumeroVaga());
        System.out.println("Setor:" +onix.getSetor());

    }
}
