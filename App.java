public class App {
    public static void main(String[] args) {
        Conta novaConta = new Conta.Builder("joao", (long)123)
                            .contaAdvanced()
                            .saldoInicial(900)
                            .saldoAplicacao(10000)
                            .taxaRemuneracao(0.011)
                            .taxaSaldoNegativo(0.25)  
                            .build();
        System.out.println(novaConta);
    }
}