public class PessoaFisica extends Agencia {
    private String nome;
    private String cpf;

    public PessoaFisica(int numero, String nomeAgencia, String nome, String cpf) {
        super(numero, nomeAgencia);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "agencia=" + super.toString() +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}