
package classes;


public class Fornecedor {
    
    private int id;
    private String nome;
    private String cnpj_cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String cnpj_cpf, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj_cpf = cnpj_cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj_cpf() {
        return cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
   @Override
   public String toString(){
       return this.nome;
   }
    
    
           
}
