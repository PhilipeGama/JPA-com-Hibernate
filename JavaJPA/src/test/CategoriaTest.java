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
//        Categoria categoria = new Categoria();
//        categoria.setId(5);
//        categoria.setDescricao("Comidas 3");
//
        CategoriaDao dao = new CategoriaDao();
//
//        dao.save(categoria);
//
        Categoria categoria = dao.find(2);
        System.out.println("ID: " + categoria.getId() + "\nDescrição: " + categoria.getDescricao());

    }
}
