public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(){}

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void contratarFuncionario() {
        System.out.println("Contratando funcionário...");
    }

    public String toString() {
        return (super.toString() + "\nCNPJ: " + this.cnpj);
    }
}