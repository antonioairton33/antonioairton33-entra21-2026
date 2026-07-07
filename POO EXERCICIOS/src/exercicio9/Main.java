package exercicio9;

public class Main {

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();

        ar.mostrarTemperatura();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.mostrarTemperatura();

        ar.diminuirTemperatura();
        ar.mostrarTemperatura();
    }
}