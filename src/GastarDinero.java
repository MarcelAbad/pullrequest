public class GastarDinero {
    public static void gastarDinero(){
        int gastar = 100;
        Personaje.dinero = Personaje.dinero - gastar;
        System.out.println("HAS GASTADO DINERO " + gastar + "$");
    }
}
