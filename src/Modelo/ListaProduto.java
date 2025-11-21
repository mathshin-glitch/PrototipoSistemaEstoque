/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mello
 */
public class ListaProduto {

    private static ArrayList<Produto> Listaprodutos = new ArrayList();

    public static void adicionarProduto(Produto p){
        Listaprodutos.add(p);
    }
    
    public static void removerProduto(int index){
        Listaprodutos.remove(index);
    }
    
    public static ArrayList<Produto> getProduto(){
        return Listaprodutos;
    }
    
}
