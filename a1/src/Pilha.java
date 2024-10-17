class Pilha {
    No topo;       

    
    public Pilha() {
        this.topo = null; // Inicializa a pilha como vazia
    }

    public void push(int valor) {
        No novoNo = new No(valor); // Cria um novo nó
        novoNo.proximo = topo;     // O próximo do novo nó é o antigo topo
        topo = novoNo;             // Atualiza o topo para o novo nó
    }

    public int pop() {
        if (topo == null) {
            throw new IllegalStateException("A pilha está vazia."); // Verifica se a pilha está vazia
        }

        int valor = topo.valor; // Armazena o valor do nó que será removido
        topo = topo.proximo;    // Atualiza o topo para o próximo nó

        return valor;            // Retorna o valor removido
    }
}

