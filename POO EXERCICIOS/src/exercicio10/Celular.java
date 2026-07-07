package exercicio10;

public class Celular {

    private String modelo;
    private int bateria;

    public void cadastrar(String modelo, int bateria) {
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void carregar() {
        bateria = 100;
    }

    public void usar(int percentual) {
        bateria -= percentual;

        if (bateria < 0) {
            bateria = 0;
        }
    }

    public void mostrarBateria() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }
}