public class Teste {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);
        System.out.println(vetor);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor);
        vetor.remove(0);
        System.out.println(vetor);
        System.out.println(vetor.tamanho());
    }
}