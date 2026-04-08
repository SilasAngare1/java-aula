package br.com.fiap.garagem.model;

public class Carro {
    private String placa;
    private int numeroVaga;
    private boolean preferencial;
    private char setor;
    private String horaEntrada;
    private String horaSaida;
    private double valor;

    public double calcularValorPagar() {
        int tempo = calcularTempoEstadia();

        return tempo *15;

    }

    private int calcularTempoEstadia(){

        return 0;
    }



    ///Metodos Getters e Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public int getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(int numeroVaga){

        this.numeroVaga = numeroVaga;
    }

    public boolean getpreferencial(){
        return preferencial;
    }

    public void setPreferencial(boolean preferencial){

        this.preferencial = preferencial;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(String horaEntrada){

        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }
    public String gethoraSaida(){
        return horaSaida;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }

    public char getSetor() {
        return setor;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

}
