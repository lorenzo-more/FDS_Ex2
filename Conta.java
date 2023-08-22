public class Conta {

    private Long numeroDaConta;
    private String nomeCorrentista;
    private int saldoLivreInicial;
    private int saldoAplicacaoInicial;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoriaInicial;

    public static class Builder {
        private Long numeroDaConta = Long.valueOf(0);
        private String nomeCorrentista = "NomeInicial";
        private int saldoLivreInicial = 0;
        private int saldoAplicacaoInicial = 0;
        private double taxaRemuneracao = 0;
        private double taxaSaldoNegativo = 0;
        private Categoria categoriaInicial = Categoria.NORMAL;

        public Builder(Long numConta, String nomeCorrentista) {
            this.numeroDaConta = Long.valueOf(numConta);
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder comSaldoLivreInicialDe(int saldoLivreInicial) {
            this.saldoLivreInicial = saldoLivreInicial;
            return this;
        }

        public Builder comSaldoDeAplicacaoInicialDe(int saldoAplicacaoInicial) {
            this.saldoAplicacaoInicial = saldoAplicacaoInicial;
            return this;
        }

        public Builder comTaxaDeRemuneracaoDe(double taxaRemuneracao) {
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public Builder comTaxaDeSaldoNegativoDe(double taxaSaldoNegativo) {
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }

        public Builder comCategoriaInicialDe(Categoria categoria) {
            this.categoriaInicial = categoria;
            return this;
        }

        public Conta build() {
            return new Conta(this);
        }
    }

    private Conta(Builder builder) {
        this.numeroDaConta = builder.numeroDaConta;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivreInicial = builder.saldoLivreInicial;
        this.saldoAplicacaoInicial = builder.saldoAplicacaoInicial;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoriaInicial = builder.categoriaInicial;
    }

    @Override
    public String toString() {
        return "Conta [numeroDaConta=" + numeroDaConta + ", nomeCorrentista=" + nomeCorrentista
                + ", saldoLivreInicial=" + saldoLivreInicial + ", saldoAplicacaoInicial=" + saldoAplicacaoInicial
                + ", taxaRemuneracao=" + taxaRemuneracao + ", taxaSaldoNegativo=" + taxaSaldoNegativo
                + ", categoriaInicial=" + categoriaInicial + "]";
    }

}
