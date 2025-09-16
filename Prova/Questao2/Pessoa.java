public class Pessoa {
    private String nome;

    public Pessoa(){}

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void pagarImposto() {
        System.out.println("Pagando imposto...");
    }

    public String toString() {
        return ("\nNome: " + this.nome);
    }
}