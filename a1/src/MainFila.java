public class MainFila {
    public static void main(String[] args) {
          
        Fila fila = new Fila();
        
        fila.insert(24);
        fila.insert(28);
        fila.insert(45);

        System.out.println("Valor removido: " + fila.remove()); // Saída: 24
        System.out.println("Valor removido: " + fila.remove()); // Saída: 28
        
        fila.insert(81);
        
        System.out.println("Valor removido: " + fila.remove()); // Saída: 45
        System.out.println("Valor removido: " + fila.remove()); // Saída: 81
        System.out.println("Valor removido: " + fila.remove()); //Fila vazia

    }
}

