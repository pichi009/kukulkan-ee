/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabenik.kukulkan.repository;

import com.nabenik.kukulkan.model.Pillinada;
import com.nabenik.kukulkan.repository.*;
import java.util.List;
import java.util.Optional;
import javax.persistence.metamodel.SingularAttribute;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wprosal
 */
public class PillinadaInterfaceTest {
    
    public PillinadaInterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
    public void createTest() {
         Pillinada pillinada = null;
         pillinada.setAuthor("Willy");
         pillinada.setDescription("Prueba");
         PillinadaInterface instance = new PillinadaInterfaceImpl();                
         instance.save(pillinada);        
                
    }
    
    
    
    @Test
    public void testFindByAuthorLike() {
        System.out.println("Willy");
        String author = "";
        PillinadaInterface instance = new PillinadaInterfaceImpl();
        List<Pillinada> expResult = null;
        List<Pillinada> result = instance.findByAuthorLike(author);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    public class PillinadaInterfaceImpl implements PillinadaInterface {

        public List<Pillinada> findByAuthorLike(String author) {
            return null;
        }

        @Override
        public Pillinada findBy(Long arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Optional<Pillinada> findOptionalBy(Long arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Pillinada> findAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Pillinada> findAll(int arg0, int arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Pillinada> findBy(Pillinada arg0, SingularAttribute<Pillinada, ?>... arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Pillinada> findBy(Pillinada arg0, int arg1, int arg2, SingularAttribute<Pillinada, ?>... arg3) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Pillinada> findByLike(Pillinada arg0, SingularAttribute<Pillinada, ?>... arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public List<Pillinada> findByLike(Pillinada arg0, int arg1, int arg2, SingularAttribute<Pillinada, ?>... arg3) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Pillinada save(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Pillinada saveAndFlush(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Pillinada saveAndFlushAndRefresh(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void remove(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void removeAndFlush(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void attachAndRemove(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void refresh(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void flush() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Long getPrimaryKey(Pillinada arg0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Long count() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Long count(Pillinada arg0, SingularAttribute<Pillinada, ?>... arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Long countLike(Pillinada arg0, SingularAttribute<Pillinada, ?>... arg1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
