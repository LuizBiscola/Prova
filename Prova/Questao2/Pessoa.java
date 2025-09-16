public class Pessoa {
    private String telefone;
    private String endereco;

    public Pessoa{}()

    public Pessoa(String telefone, String endereco){
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return ("\ntelefone: " + this.telefone + "\nendereco: " + this.endereco);
    }
}