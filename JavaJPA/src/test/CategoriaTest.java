/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bean.Categoria;

/**
 *
 * @author philipe
 */
public class CategoriaTest {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setDescricao("Bebidas");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
