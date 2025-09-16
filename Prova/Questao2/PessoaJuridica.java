public class PessoaJuridica extends Pessoa {
    private String nome;
    private String cnpj;

    public PessoaJuridica(){}

    public PessoaJuridica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }
    
    public PessoaJuridica(String telefone, String endereco, String nome, String cnpj) {
        super(telefone, endereco);
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        return ("Nome: " + this.nome + "\nCNPJ: " + this.cnpj + super.toString());
    }
}