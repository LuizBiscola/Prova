public class PessoaJuridica extends Agencia {
    private String nome;
    private String cnpj;

    public PessoaJuridica(int numero, String nomeAgencia, String nome, String cnpj) {
        super(numero, nomeAgencia);
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

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "agencia=" + super.toString() +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}