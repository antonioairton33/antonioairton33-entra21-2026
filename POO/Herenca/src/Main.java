public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno();
        al1.setNome("Ana");
        al1.setEmail("ana@gmail.com");
        al1.setMedia(6.0);
        // System.out.println(al1.getNome());
        // System.out.println(al1.getEmail());
        // System.out.println(al1.getStatus());
        al1.display();

        Cliente cl1 = new Cliente();
        cl1.setLimite(3000.0);
        System.out.println(cl1.getLimite());

        Aluno al2 = new Aluno("Maria", "maria@gmail.com", 7.0);
        al2.display();
    }
}
