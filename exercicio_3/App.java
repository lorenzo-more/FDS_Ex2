package exercicio_3;

public class App {
    public static void main(String[] args) {
        Personagem um = Personagem.normal();
        System.out.println(um);
        System.out.println("________________________________");

        Personagem dois = Personagem.poderoso(70);
        System.out.println(dois);
        System.out.println("________________________________");

        Personagem tres = Personagem.soturno(7);
        System.out.println(tres);
        System.out.println("________________________________");
        
        Personagem quatro = Personagem.ajustavel(9, 100, 5);
        System.out.println(quatro);
        System.out.println("________________________________");
    }
}
