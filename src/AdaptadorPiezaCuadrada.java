// AdaptadorPiezaCuadrada.java
public class AdaptadorPiezaCuadrada extends PiezaRedonda {
    private PiezaCuadrada pieza;

    public AdaptadorPiezaCuadrada(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }

    @Override
    public double obtenerRadio() {
        // Fórmula para calcular el radio mínimo que encaja en un cuadrado
        return Math.sqrt(Math.pow(pieza.obtenerLado() / 2, 2) * 2);
    }
}


