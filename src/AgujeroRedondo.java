
public class AgujeroRedondo {
    private double radio;

    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }

    public double obtenerRadio() {
        return radio;
    }

    public boolean encaja(PiezaRedonda pieza) {
        return this.obtenerRadio() >= pieza.obtenerRadio();
    }
}
