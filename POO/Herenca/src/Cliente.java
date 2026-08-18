public class Cliente extends Pessoa{
    private String cartao;
    private double limite;

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public String getCartao(){
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }


    public String getLimite(){
        if(limite > 5000) {
            return "limite execido";
        } else {
            return "Dentro do limite";
        }

    }


}
