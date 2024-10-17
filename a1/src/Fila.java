class Fila {
    No primeiro;    // Referência para o primeiro nó
    No ultimo;      // Referência para o último nó

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void insert(int valor) {
        No novoNo = new No(valor); 

        if (ultimo != null) { // Se a fila não está vazia
            ultimo.proximo = novoNo; // O último nó aponta para o novo nó
        }
        ultimo = novoNo; 

        if (primeiro == null) { // Se a fila estava vazia
            primeiro = novoNo; // O primeiro nó é o novo nó
        }
    }

    public int remove() {
        if (primeiro == null) {
            throw new IllegalStateException("A fila está vazia."); // Verifica se a fila está vazia
        }

        int valor = primeiro.valor; // Armazena o valor do nó a ser removido
        primeiro = primeiro.proximo; // Atualiza o primeiro nó

        if (primeiro == null) { // Se a fila ficou vazia
            ultimo = null; // Atualiza o último nó para null
        }

        return valor; 
    }
}

