class Recipiente {
    private int quantidade;
    private int capacidade;
    private Substancia conteudo;

    public Recipiente(int capacidade, Substancia conteudo) {
        this.capacidade = capacidade;
        this.conteudo = conteudo;
        this.quantidade = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public Substancia getSubstancia() {
        return conteudo;
    }

    public void setSubstancia(Substancia conteudo) {
        this.conteudo = conteudo;
    }

    public void adicionar(int qtd) {
        if (qtd <= 0) return;
        {
            if (quantidade + qtd > capacidade) {
                quantidade = capacidade;
            } 
            else 
            {
                quantidade += qtd;
            }
        }
    }

    public void remover(int qtd) {
        if (qtd <= 0) return;
        {
            if (quantidade - qtd < 0) 
            {
                quantidade = 0;
            } 
            else 
            {
                quantidade -= qtd;
            }
        }
    }

    public String toString() {
        return "Recipiente {quantidade=" + quantidade + ", capacidade=" + capacidade + ", substancia=" + conteudo.toString() + "}";
    }
}