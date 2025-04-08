public class Quadrado extends Figura {
    private Double lado;

    // setter
    public void setLado(Double lado) {
        this.lado = lado;
    }

    // getter
    public Double getLado() {
        return this.lado;
    }
    // construtor
    public Quadrado(Double lado, Double posicao) {
        this.lado = lado;
        setPosicao(posicao);
    }
    // construtor
    public Quadrado(Double lado) {
        this.lado = lado;
    }
    public double calcularAreaQuadrado() {
        // formula lado * lado
        return this.getLado()*this.getLado(); 
    }
}
