/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mello
 */
public class ListaProduto {

    private static List<Produto> Listaprodutos = new ArrayList<>();
    
    public static void AdiconarProduto(Produto p){
        Listaprodutos.add(p);
    }
    
    public static void removerProduto(int index){
        Listaprodutos.remove(index);
    }
    
    public static List<Produto> getProduto(){
        return Listaprodutos;
    }
}
