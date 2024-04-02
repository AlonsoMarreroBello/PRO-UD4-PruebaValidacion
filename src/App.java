import net.salesianos.ejercicio1.Calculadora;
import net.salesianos.ejercicio2.electrodomesticos.Microondas;
import net.salesianos.ejercicio2.electrodomesticos.Nevera;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(Calculadora.sumarElevadosN(3));
        System.out.println(Calculadora.sumarElevadosN(6));
        System.out.println(Calculadora.sumarElevadosN(73));

        float[] listaNumeros1 = {10,4,6,1,7};
        float[] listaNumeros2 = {4,7,9,2,3,7,8};
        System.out.println(Calculadora.calcularMediaNotas(listaNumeros1));
        System.out.println(Calculadora.calcularMediaNotas(listaNumeros2));

        Nevera nevera = new Nevera("Balay", "hunterton reklinghousen", 87.4f, 56, false, 8);
        Microondas microondas = new Microondas("Logitech", "utf8", 14, 7, false, true);
        System.out.println(nevera.toString());
        System.out.println(microondas.toString());
        nevera.encender();
        microondas.encender();
        System.out.println(nevera.toString());
        System.out.println(microondas.toString());
    }
}
