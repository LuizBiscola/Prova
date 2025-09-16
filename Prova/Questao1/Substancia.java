class Substancia {
    private String nome;
    private boolean inflamavel;

    public Substancia(String nome, boolean inflamavel) {
        this.nome = nome;
        this.inflamavel = inflamavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isInflamavel() {
        return inflamavel;
    }

    public void setInflamavel(boolean inflamavel) {
        this.inflamavel = inflamavel;
    }

    
    public String toString() {
        return "Substancia {" + nome + ", inflamavel=" + inflamavel + "}";
    }
}