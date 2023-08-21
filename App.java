public class App {
    public static void main(String[] args) {
        Conta conta = new Conta.Builder(1L, "Fulano Comuna filho do cão")
                .saldoLivre(1000)
                .saldoAplicacao(1000)
                .taxaRemuneracao(0.1)
                .taxaSaldoNegativo(0.1)
                .categoria(Categoria.PREMIUM)
                .build();

        System.out.println(conta);
    }
}