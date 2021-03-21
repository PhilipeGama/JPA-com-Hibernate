/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.bean.Categoria;
import model.bean.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author philipe
 */
public class ProdutoTest {

    public static void main(String[] args) {
 

        ProdutoDao dao = new ProdutoDao();

        Produto produto = new Produto();
  
        
        produto.setId(2);
        produto.setDescricao("Miojo");
        produto.setQtd(10);
        produto.setValor(4.50);
        
        Categoria categoria = new Categoria();
        categoria.setId(3);
        
        produto.setCategoria(categoria);
        
        dao.save(produto);

    

    }

}
