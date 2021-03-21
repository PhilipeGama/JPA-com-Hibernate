/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import connection.ConnectionFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bean.Categoria;
import model.dao.CategoriaDao;

/**
 *
 * @author philipe
 */
public class CategoriaTest {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setDescricao("Bedibas 2");

        
        CategoriaDao dao = new CategoriaDao();
        
        dao.save(categoria);
        
        categoria.getId();
        categoria.getDescricao();
        
    }
}
