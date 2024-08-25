public class Teste {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor(5);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        System.out.println(vetor);

        System.out.println();
        System.out.println("1)");
        vetor.adiciona("ELEMENTO AO FINAL");
        System.out.println(vetor);

        System.out.println();
        System.out.println("2)");
        System.out.println(vetor.tamanho());

        System.out.println();
        System.out.println("3)");
        System.out.println(vetor.toString());

        System.out.println();
        System.out.println("4)");
        System.out.println(vetor.busca(1));

        System.out.println();
        System.out.println("5)");
        System.out.println(vetor.busca("elemento 2"));

        System.out.println();
        System.out.println("6)");
        vetor.adiciona(2, "ELEMENTO EM QUALQUER POSICAO");
        System.out.println(vetor);

        System.out.println();
        System.out.println("7)");
        vetor.aumentaCapacidade();

        System.out.println();
        System.out.println("8)");
        vetor.remove(1);
        System.out.println(vetor);
        
    }
}
