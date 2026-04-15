package excercicio;

public class Lancha {

    private String modelo;
    private int qunatidadeDeLugares;
    private double Comprimento;
    private int anoFabricacao;
    private Cor cor;
    private int quantidadedemotores;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQunatidadeDeLugares() {
        return qunatidadeDeLugares;
    }

    public void setQunatidadeDeLugares(int qunatidadeDeLugares) {
        this.qunatidadeDeLugares = qunatidadeDeLugares;
    }

    public double getComprimento() {
        return Comprimento;
    }

    public void setComprimento(double comprimento) {
        Comprimento = comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQuantidadedemotores() {
        return quantidadedemotores;
    }

    public void setQuantidadedemotores(int quantidadedemotores) {
        this.quantidadedemotores = quantidadedemotores;
    }

}
