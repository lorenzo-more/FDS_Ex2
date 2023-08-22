import javafx.scene.effect.BlurType;

public class Conta {
    private Long numeroConta;
    private String nomeCorrentista;
    private int saldoLivre;
    private int saldoAplicado;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoria;

    public static class Builder {
        private long numero;
        private String nomeCorrentista;
        private int saldoInicial;
        private int saldoAplicado;
        private double taxaRemuneracao;
        private double taxaSaldoNegativo;
        private Categoria categoria;

        public Builder(String nome, Long numeroConta) {
            this.numero = numeroConta;
            this.nomeCorrentista = nome;
            this.saldoInicial = 0;
            this.saldoAplicado = 0;
            this.taxaRemuneracao = 0.01;
            this.taxaSaldoNegativo = 0.2;
            this.categoria = Categoria.NORMAL;
        }

        public Builder saldoInicial(int saldo) {
            this.saldoInicial = saldo;
            return this;
        }

        public Builder saldoAplicacao(int saldoLivre) {
            this.saldoAplicado = saldoLivre;
            return this;
        }

        public Builder taxaRemuneracao(double taxa) {
            this.taxaRemuneracao = taxa;
            return this;
        }

        public Builder taxaSaldoNegativo(double taxa) {
            this.taxaSaldoNegativo = taxa;
            return this;
        }

        public Builder contaAdvanced() {
            this.categoria = Categoria.ADVANCED;
            return this;
        }

        public Builder contaPremium() {
            this.categoria = Categoria.PREMIUM;
            return this;
        }

        public Conta build() {
            return new Conta(this);
        }
    }

    private Conta(Builder b) {
        this.numeroConta = b.numero;
        this.nomeCorrentista = b.nomeCorrentista;
        this.saldoLivre = b.saldoInicial;
        this.saldoAplicado = b.saldoAplicado;
        this.taxaRemuneracao = b.taxaRemuneracao;
        this.taxaSaldoNegativo = b.taxaSaldoNegativo;
        this.categoria = b.categoria;
    }

    @Override
    public String toString() {
    return "Correntista:       " + nomeCorrentista +
         "\nConta:             " + numeroConta +
         "\nSaldo Livre:       " + saldoLivre +
         "\nSaldo Aplicado:    " + saldoAplicado +
         "\nTaxa Remuneracao:  " + taxaRemuneracao +
         "\nTaxa Negativado:   " + taxaSaldoNegativo +
         "\nTipo de Conta:     " + categoria;
}
}