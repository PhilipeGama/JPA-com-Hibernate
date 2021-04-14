/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import connection.ConnectionFactory;
import java.util.List;
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
/*
        Salva objetos no BD
        Categoria categoria = new Categoria();
        categoria.setId(5);
        categoria.setDescricao("Comidas 3");
        CategoriaDao dao = new CategoriaDao();
        dao.save(categoria);

        Retorna registros pelo id
        CategoriaDao dao = new CategoriaDao();
        Categoria categoria = dao.find(2);
        System.out.println("ID: " + categoria.getId() + "\nDescrição: " + categoria.getDescricao());
        Retorna todos os registros
        CategoriaDao dao = new CategoriaDao();
        List<Categoria> categorias = dao.findAll();
       
        for (Categoria categoria : dao.findAll()) {
            System.out.println("-------------------------");
            System.out.println("ID: " + categoria.getId() + "\nDescrição: " + categoria.getDescricao());
        }
*/
          
        Categoria categoria = new Categoria();
        categoria.setId(5);
        categoria.setDescricao("Comidas 3");
        CategoriaDao dao = new CategoriaDao();
        dao.save(categoria);
        
        
    }
}
