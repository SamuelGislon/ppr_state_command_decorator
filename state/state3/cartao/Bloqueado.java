package state3.cartao;

public class Bloqueado extends CartaoEstado {
    private Cartao cartao;

    public Bloqueado (Cartao cartao){
        this.cartao = cartao;
    }

    @Override
    public void entrarPin(String pin) throws Exception {
        throw new Exception("Seu cartão foi bloqueado, ligue para a agência!");
    }

    @Override
    public void fazerPagamento() throws Exception {
        throw new Exception("N\u00E3o podes fazer o pagamento.");
    }
    @Override
    public String toString(){
        return "Cartão Bloqueado";
    }
}
