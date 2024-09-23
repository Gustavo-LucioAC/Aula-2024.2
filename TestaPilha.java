//package Atividade03;
import java.util.Stack;

public class TestaPilha {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30); 

        System.out.println("Tamanho da pilha: " + pilha.size());


        System.out.println("Elementos da pilha (desempilhando):");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }

        pilha.push(40);
        pilha.push(50);

        System.out.println("Topo da pilha: " + pilha.peek());

        int elementoParaVerificar = 40; 
        if (pilha.contains(elementoParaVerificar)) {
            System.out.println("Elemento " + elementoParaVerificar + " existe na pilha.");
        } else {
            System.out.println("Elemento " + elementoParaVerificar + " não existe na pilha."); 
        }

      
        System.out.println("Desempilhando elemento: " + pilha.pop());
        System.out.println("Topo novo: " + pilha.peek());
    }
}

