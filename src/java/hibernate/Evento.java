/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author FSEVERI\loreggian3064
 */
@Entity
@Table(name="Evento")
public class Evento {
    @Id
    @Column(name="Id")
    private String id;
    
    @Column(name="Data")
    private Date data;
    
    @Column(name="Luogo")
    private String luogo;
    
    @Column(name="Titolo")
    private String titolo;
    
    @Column(name="Categoria")
    private String categoria;
    
    @Column(name="Utente")
    private String eutente;
    
    //referenziazione chiave esterna evento-commento
    @OneToMany(mappedBy="idevento")
    private Set<Commento> comm;
    
    //referenziazione chiave esterna evento-utente
    @ManyToOne
    @JoinColumn(name="Utente")
    private Utente ut;
    
    //referenziazione many to many evento-artista
    @ManyToMany 
    @JoinTable(
        name = "evento_artista",
        joinColumns = {@JoinColumn(name="IdEvento")},
        inverseJoinColumns={@JoinColumn(name="IdArtista")}
    )
    private Set<Categoria> art;
    
    public Evento(){}
    
    public Evento(String id, Date data, String luogo, String titolo, String categoria, String eutente){
        this.id = id; 
        this.data = data;
        this.luogo = luogo;
        this.titolo = titolo;
        this.categoria=categoria;
        this.eutente = eutente;
    }

    public String getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getUtente() {
        return eutente;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setUtente(String eutente) {
        this.eutente = eutente;
    }
    
    
}
