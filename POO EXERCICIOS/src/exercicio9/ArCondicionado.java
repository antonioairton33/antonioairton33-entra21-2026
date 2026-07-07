package exercicio9;

public class ArCondicionado {

    private int temperaturaAtual;

    public ArCondicionado() {
        temperaturaAtual = 24;
    }

    public void aumentarTemperatura() {
        if (temperaturaAtual < 30) {
            temperaturaAtual++;
        } else {
            System.out.println("Temperatura máxima atingida!");
        }
    }

    public void diminuirTemperatura() {
        if (temperaturaAtual > 16) {
            temperaturaAtual--;
        } else {
            System.out.println("Temperatura mínima atingida!");
        }
    }

    public void mostrarTemperatura() {
        System.out.println("Temperatura atual: " + temperaturaAtual + "°C");
    }
}