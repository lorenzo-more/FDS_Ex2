public class App {
    public static void main(String[] args) {
        Conta novaConta = new Conta.Builder(Long.valueOf(123), "Alberto")
                .comCategoriaInicialDe(Categoria.NORMAL)
                .comSaldoDeAplicacaoInicialDe(12)
                .comSaldoLivreInicialDe(15)
                .comTaxaDeRemuneracaoDe(2)
                .comTaxaDeSaldoNegativoDe(100)
                .build();

        System.out.println(novaConta.toString());
    }
}