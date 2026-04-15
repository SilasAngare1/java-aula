package br.com.fiap.lanhouse.model;

public class Computador {

    private String processador;
    private int id;
    private String placadeVideo;
    private double armazenamento;
    private boolean ssd;
    private int memoriaRam;


    //funcao dessa forma e obrigar a ter os parametros
    //1 regra pra criar construtor no java, tem que ter o nome da classe
    // nao tem return
    public Computador (String processador, int id, double armazenamento,boolean ssd, int memoriaRam,String placadeVideo){
        this.processador = processador;
        this.id = id;
        this.armazenamento = armazenamento;
        this.memoriaRam = memoriaRam;
        this.placadeVideo = placadeVideo;
        this.ssd = ssd;

    }

    public Computador(String processador, int id) {
        this.processador = processador;
        this.id = id;
    }




    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlacadeVideo() {
        return placadeVideo;
    }

    public void setPlacadeVideo(String placadeVideo) {
        this.placadeVideo = placadeVideo;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isSsd() {
        return ssd;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}


