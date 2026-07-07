package exercicio10;

public class Main {

    public static void main(String[] args) {

        Celular celular = new Celular();

        celular.cadastrar("Samsung Galaxy A55", 80);

        celular.mostrarBateria();

        celular.usar(30);
        celular.mostrarBateria();

        celular.usar(60);
        celular.mostrarBateria();

        celular.carregar();
        celular.mostrarBateria();
    }
}