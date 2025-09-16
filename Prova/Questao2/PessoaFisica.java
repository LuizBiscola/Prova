public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;

    public PessoaFisica(){}

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public PessoaFisica(String telefone, String endereco, String nome, String cpf) {
        super(telefone, endereco);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return ("Nome: " + this.nome + "\nCPF: " + this.cpf + super.toString());
    }
}