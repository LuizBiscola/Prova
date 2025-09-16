public class PessoaFisica extends Pessoa {
    private String cpf;
    private int idade;
    private int peso;
    private char sexo;

    public PessoaFisica(){}

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpf, int idade, int peso, char sexo) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void andar() {
        System.out.println("Andando...");
    }

    public void dormir() {
        System.out.println("Dormindo...");
    }

    public String toString() {
        return (super.toString() + "\nCPF: " + this.cpf + "\nIdade: " + this.idade + "\nPeso: " + this.peso + "\nSexo: " + this.sexo);
    }
}