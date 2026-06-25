import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    //     List<Pessoa> pessoas = new ArrayList();
        
    //     Pessoa p1 = new Pessoa(); //instrancia objeto
    //     p1.nome = "Ana";
    //     p1.email = "ana@gmail.com";
    //     p1.display();
    //    // System.out.println(p.nome + " " + p.email);

    //     Pessoa p2 = new Pessoa(); //instrancia objeto
    //     p2.nome = "João";
    //     p2.email = "joao@gmail.com";
    //     p2.display();
    //     //System.out.println(p2.nome + " " + p2.email);

    //     Pessoa p3 = new Pessoa(); //instrancia objeto
    //     p3.nome = "Pedro";
    //     p3.email = "pedro@gmail.com";
    //     p3.display();

        Produto p = new Produto();
        p.descricao = "milho";
        p.preco = 100.0;
        p.estoque = 25;
        p.unidadeMedida = "KG";
        p.display();

        System.out.println(p.concedeAcrescimo(5));
        System.out.println(p.concederDesconto(10));
    }
}