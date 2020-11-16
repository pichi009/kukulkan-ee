/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabenik.kukulkan.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author wprosal
 */
@Entity
@Table(name="pillinada")

public class Pillinada implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="pillinada_id")
    private Long pillinadaId;
    
    @Column(name="author")
    private String author;
    
    @Column(name="description")
    private String description;

    public Long getPillinadaId() {
        return pillinadaId;
    }

    public void setPillinadaId(Long pillinadaId) {
        this.pillinadaId = pillinadaId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String autor) {
        this.author = autor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
