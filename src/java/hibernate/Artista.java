/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author FSEVERI\loreggian3064
 */
@Entity
@Table(name="Artista")
public class Artista {
    @Id
    @Column(name="Id")
    private String id;
    
    @Column(name="NomeArte")
    private String nomea;
    
    //referenziazione many to many evento-artista
    @ManyToMany(mappedBy="art")
    private Set<Utente> eve;
    
    public Artista(){}
    
    public Artista(String id, String nomea){
        this.id = id;
        this.nomea = nomea;
    }
    
    public Artista(String id, String nomea, Set<Utente>eve){
        this.id = id;
        this.nomea = nomea;
        this.eve = eve;
    }
    
    public String getId() {
        return id;
    }

    public Set<Utente> getEve() {
        return eve;
    }

    public String getNomea() {
        return nomea;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public void setEve(Set<Utente> eve) {
        this.eve = eve;
    }
}
