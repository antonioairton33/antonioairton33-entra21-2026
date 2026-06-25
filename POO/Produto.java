class Produto {
    String descricao;
    double preco;
    int estoque;
    String unidadeMedida;

    public double concedeAcrescimo(double taxa){
        return this.preco + this.preco * (taxa / 100);
    }

    public double concederDesconto(double taxa){
        return this.preco - this.preco * (taxa / 100);
    }

    public void display() {
        System.out.println("Descricão...: " + this.descricao);
        System.out.println("Preço.......: " + this.preco);
        System.out.println("Estoque.....: " + this.estoque);
        System.out.println("Unidade med.....: " + this.unidadeMedida);
        
    }

}