package classes;

public class Fonecedor_Produto {
    
    private int id;
    private int id_fornecedor;
    private int id_produto;

    public Fonecedor_Produto() {
    }

    public Fonecedor_Produto(int id, int id_fornecedor, int id_produto) {
        this.id = id;
        this.id_fornecedor = id_fornecedor;
        this.id_produto = id_produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
    
    
}
