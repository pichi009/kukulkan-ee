/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabenik.kukulkan.repository;

import com.nabenik.kukulkan.model.Pillinada;
import java.util.List;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

/**
 *
 * @author wprosal
 */
@Repository(forEntity=Pillinada.class)
public interface PillinadaInterface extends EntityRepository<Pillinada,Long> {
    
    public List<Pillinada> findByAuthorLike(String author);
    
}


