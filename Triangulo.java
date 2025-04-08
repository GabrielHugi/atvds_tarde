public class Triangulo extends Figura {
    /*
     * 
     *           o
     *          o o
     *  lado x o   o lado z
     *        o     o
     *       ooooooooo
     *         lado y
     */
    private Double ladox, ladoy, ladoz;

    // setter
    public void setLados(Double ladox, Double ladoy, Double ladoz) {
        this.ladox = ladox;
        this.ladoy = ladoy;
        this.ladoz = ladoz;
    }

    // getter
    public Double[] getLados() {
        Double[] response = new Double[3];
        response[0] = this.ladox;
        response[1] = this.ladoy;
        response[2] = this.ladoz;
        return response;

    }
    // construtor
    public Triangulo(Double ladox, Double ladoy, Double ladoz, Double altura, Double posicao) {
        this.ladox = ladox;
        this.ladoy = ladoy;
        this.ladoz = ladoz;
        setAltura(altura);
        setPosicao(posicao);
    }
    // construtor
    public Triangulo(Double ladoy, Double altura) {
        this.ladoy = ladoy;
        setAltura(altura);
    }
    public double calcularAreaTriangle() {
        //formula base * altura / 2
        return (this.getAltura() * this.getLados()[1])/2.0;
    }
}
