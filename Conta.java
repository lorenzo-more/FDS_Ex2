public class Conta {
    private Long numero;
    private String nomeCorrentista;
    private int saldoLivre;
    private int saldoAplicacao;
    private double taxaRemuneracao;
    private double taxaSaldoNegativo;
    private Categoria categoria;

    private Conta(Builder builder){
        this.numero = builder.numero;
        this.nomeCorrentista = builder.nomeCorrentista;
        this.saldoLivre = builder.saldoLivre;
        this.saldoAplicacao = builder.saldoAplicacao;
        this.taxaRemuneracao = builder.taxaRemuneracao;
        this.taxaSaldoNegativo = builder.taxaSaldoNegativo;
        this.categoria = builder.categoria;
    }

    public static class Builder {
        private Long numero = 1L;
        private String nomeCorrentista = "Fulano Comuna filho do cão";
        private int saldoLivre = 0;
        private int saldoAplicacao = 0;
        private double taxaRemuneracao = 0.0;
        private double taxaSaldoNegativo = 0.0;
        private Categoria categoria = Categoria.NORMAL;

        public Builder(Long numero, String nomeCorrentista) {
            this.numero = numero;
            this.nomeCorrentista = nomeCorrentista;
        }

        public Builder saldoLivre(int saldoLivre) {
            this.saldoLivre = saldoLivre;
            return this;
        }

        public Builder saldoAplicacao(int saldoAplicacao) {
            this.saldoAplicacao = saldoAplicacao;
            return this;
        }

        public Builder taxaRemuneracao(double taxaRemuneracao) {
            this.taxaRemuneracao = taxaRemuneracao;
            return this;
        }

        public Builder taxaSaldoNegativo(double taxaSaldoNegativo) {
            this.taxaSaldoNegativo = taxaSaldoNegativo;
            return this;
        }

        public Builder categoria(Categoria categoria) {
            this.categoria = categoria;
            return this;
        }

        public Conta build() {
            return new Conta(this);
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", nomeCorrentista='" + nomeCorrentista + '\'' +
                ", saldoLivre=" + saldoLivre +
                ", saldoAplicacao=" + saldoAplicacao +
                ", taxaRemuneracao=" + taxaRemuneracao +
                ", taxaSaldoNegativo=" + taxaSaldoNegativo +
                ", categoria=" + categoria +
                '}';
    }
}
