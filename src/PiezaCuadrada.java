public class PiezaCuadrada {
    private double lado;

    public PiezaCuadrada(double lado) {
        this.lado = lado;
    }

    public double obtenerLado() {
        return lado;
    }

    public double obtenerArea() {
        return Math.pow(this.lado, 2);
    }
}

