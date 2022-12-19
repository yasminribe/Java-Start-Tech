package piscina;

public class Piscina {
    private double largura;
   private double comprimento;
    private double profundidade;

    public Piscina(double largura, double comprimento, double profundidade) {
        this.setLargura(largura);
        this.setComprimento(comprimento);
        this.setProfundidade(profundidade);

    }
    public double CalcularVolume(){
        return largura * comprimento * profundidade;
    }
    public String toString() {
        return String.format("Medidas da Piscina: %.1f, %.1f, %.1f.", getLargura(), getComprimento(), getProfundidade());
    }
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
}

