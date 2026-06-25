// public class Main {

//     public static void main(String[] args) {
//         Pessoa p = new Pessoa(); //instrancia objeto
//         p.nome = "Ana";
//         p.email = "ana@gmail.com";
//         p.display();
//        // System.out.println(p.nome + " " + p.email);

//         Pessoa p2 = new Pessoa(); //instrancia objeto
//         p2.nome = "João";
//         p2.email = "joao@gmail.com";
//         p2.display();
//         //System.out.println(p2.nome + " " + p2.email);
//     }
// }

    
class Pessoa{
    String nome;
    String email;

    void display(){
        System.out.println(this.nome + " " + this.email);
    }

} 
