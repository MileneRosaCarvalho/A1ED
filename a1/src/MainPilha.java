public class MainPilha {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();
        
        pilha.push(777);
        pilha.push(91);
        pilha.push(55);
        
        System.out.println("Valor removido: " + pilha.pop()); // Saída: 55
        System.out.println("Valor removido: " + pilha.pop()); // Saída: 91
        
        pilha.push(4);
        
        System.out.println("Valor removido: " + pilha.pop()); // Saída: 4
        System.out.println("Valor removido: " + pilha.pop()); // Saída: 777
        System.out.println("Valor removido: " + pilha.pop()); // Pilha vazia
    }
}
