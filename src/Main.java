// Main.java
public class Main {
    public static void main(String[] args) {
        // Creamos un agujero redondo de radio 5
        AgujeroRedondo agujero = new AgujeroRedondo(5);

        // Creamos una pieza redonda de radio 5
        PiezaRedonda piezaRedonda = new PiezaRedonda(5);

        // Probamos si la pieza redonda encaja en el agujero redondo
        if (agujero.encaja(piezaRedonda)) {
            System.out.println("La pieza redonda encaja en el agujero redondo.");
        } else {
            System.out.println("La pieza redonda no encaja en el agujero redondo.");
        }

        // Creamos una pieza cuadrada de lado 4
        PiezaCuadrada piezaCuadrada = new PiezaCuadrada(4);

        // Creamos un adaptador para la pieza cuadrada
        AdaptadorPiezaCuadrada adaptador = new AdaptadorPiezaCuadrada(piezaCuadrada);

        // Probamos si el adaptador de la pieza cuadrada encaja en el agujero redondo
        if (agujero.encaja(adaptador)) {
            System.out.println("La pieza cuadrada encaja en el agujero redondo.");
        } else {
            System.out.println("La pieza cuadrada no encaja en el agujero redondo.");
        }
    }
}
