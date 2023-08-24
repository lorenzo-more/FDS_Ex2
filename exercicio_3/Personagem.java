package exercicio_3;

public class Personagem {
    int visibilidade;
    int poder;
    int vidas;

    private Personagem(int umaVisibilidade, int umPoder, int nVidas) {
        this.visibilidade = umaVisibilidade;
        this.poder = umPoder;
        this.vidas = nVidas;
    }

    public static Personagem normal() {
        return new Personagem(10, 50, 3);
    }

    public static Personagem poderoso(int umPoder) {
        if (umPoder > 100 || umPoder < 0) return null;
        return new Personagem(10, umPoder, 3);
    }

    public static Personagem soturno(int umaVisibilidade) {
        if (umaVisibilidade > 10 || umaVisibilidade < 0) return null;
        return new Personagem(umaVisibilidade, 50, 3);
    }

    public static Personagem ajustavel(int umaVisibilidade, int umPoder, int nVidas) {
        if (umaVisibilidade > 10 || umaVisibilidade < 0) return null;
        if (umPoder > 100 || umPoder < 0) return null;
        if (nVidas > 5 || nVidas < 0) return null;
        return new Personagem(umaVisibilidade, umPoder, nVidas);
    }

    @Override
    public String toString() {
        return "Visibilidade: " + this.visibilidade + 
             "\nPoder:        " + this.poder +
             "\nVidas:        " + this.vidas + "\n";
    }
}
