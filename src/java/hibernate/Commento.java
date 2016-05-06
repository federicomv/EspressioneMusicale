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
@Table(name="Commento")
public class Commento {
    @Id
    @Column(name="Id")
    private String id;
    
    @Column(name="Testo")
    private String testo;
    
    @Column(name="Voto")
    private int voto;
    
    @Column(name="Utente")
    private String cutente;
    
    @Column(name="IdEvento")
    private String idevento;
    
    //referenziazione many to many utente-categoria
    @ManyToMany(mappedBy="cat")
    private Set<Utente> ute;
    
    //referenziazione chiave esterna commento-utente
    @ManyToOne
    @JoinColumn(name="Utente")
    private Utente ut;
    
}
