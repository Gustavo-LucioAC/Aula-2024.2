public class ArrayListaTest {

    public static void main(String[] args) {

        ArrayLista vetor = new ArrayLista(5);

        vetor.adiciona(new Contato("Teste01", "11111", "TESTE01@TESTE.COM"));
        vetor.adiciona(new Contato("Teste02", "22222", "TESTE02@TESTE.COM"));
        vetor.adiciona(new Contato("Teste03", "33333", "TESTE03@TESTE.COM"));

        System.out.println(vetor);

        System.out.println();
        System.out.println("1) Adicionar novo contato");
        vetor.adiciona(new Contato("Teste04", "44444", "TESTE04@TESTE.COM"));
        System.out.println(vetor);

        System.out.println();
        System.out.println("2) Verificar quantidade de contatos");
        System.out.println(vetor.tamanho());

        System.out.println();
        System.out.println("3) Imprimir todos os contatos");
        System.out.println(vetor.toString());

        System.out.println();
        System.out.println("4) Obter contato de uma posição específica (posição 1)");
        System.out.println(vetor.busca(1));

        System.out.println();
        System.out.println("5) Verificar se o contato 'Teste02' existe");
        System.out.println(vetor.busca(new Contato("Teste02", "22222", "TESTE02@TESTE.COM")));

        System.out.println();
        System.out.println("6) Adicionar contato na posição 2");
        vetor.adiciona(2, new Contato("Teste05", "55555", "TESTE05@TESTE.COM"));
        System.out.println(vetor);

        System.out.println();
        System.out.println("7) Duplicar tamanho do vetor");
        System.out.println("Capacidade aumentada!");

        System.out.println();
        System.out.println("8) Remover contato da posição 1");
        vetor.remove(1);
        System.out.println(vetor);

        System.out.println();
        System.out.println("9) Pesquisar contato por nome 'Teste03'");
        Contato contatoNome = vetor.buscaPorNome("Teste02");
        System.out.println(contatoNome);

        System.out.println();
        System.out.println("10) Pesquisar contato por e-mail 'TESTE02@TESTE.COM'");
        Contato contatoEmail = vetor.buscaPorEmail("TESTE02@TESTE.COM");
        System.out.println(contatoEmail);

        System.out.println();
        System.out.println("11) Pesquisar contato por telefone '55555'");
        Contato contatoTelefone = vetor.buscaPorTelefone("55555");
        System.out.println(contatoTelefone);

        System.out.println();
        System.out.println("12) Ordenar os contatos por nome");
        vetor.ordenaPorNome();
        System.out.println(vetor.toString());

        System.out.println();
        System.out.println("13) Ordenar os contatos por e-mail");
        vetor.ordenaPorEmail();
        System.out.println(vetor.toString());

        System.out.println();
        System.out.println("14) Ordenar os contatos por telefone");
        vetor.ordenaPorTelefone();
        System.out.println(vetor.toString());
    }
}
