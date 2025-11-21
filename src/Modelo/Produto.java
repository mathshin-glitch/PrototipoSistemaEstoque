
package Modelo;


public class Produto {
    
    private String nome;
    private String descricao;
    private int quantidade;
    private String fornecedor;

    public Produto() {
    }

    public Produto(String nome, String descricao, int quantidade, String fornecedor) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
  
}
