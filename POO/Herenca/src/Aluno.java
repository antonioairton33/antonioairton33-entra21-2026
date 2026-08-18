public class Aluno extends Pessoa{
    private double media;

    public Aluno(){

    }

    public Aluno(String nome, String email, double media){
        super(nome, email);
        // setNome(nome);
        // setEmail(email);
        setMedia(media);
    }


    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        // if(media < 7){
        //     return "Reprovado";
        // } else {
        //     return "Aprovado";
        // }

        return media < 7 ? "Reprovado" : "Aprovado"; //operador ternário
    }

    public void display() {
        // System.out.println("Nome: " + getNome());
        // System.out.println("Email: " + getEmail());
        super.display();
        System.out.println("Media: " + media);
        System.out.println("Status: " + getStatus());
    }
    

//     @Override
//     public void display() {
//         super.display();  
//         System.out.println("Media " + media);
//         if(media < 7){
//             System.out.println("Reprovado");
//         } else {
//             System.out.println("Aprovado");
//         }
//     }
}
