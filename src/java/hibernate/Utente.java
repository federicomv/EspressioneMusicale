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
@Table(name="Utente")
public class Utente {
    @Id
    @Column(name="Nickname")
    private String nick;
    
    @Column(name="Nome")
    private String nom;
    
    @Column(name="Cognome")
    private String cog;
    
    @Column(name="Email")
    private String email;
    
    //referenziazione chiave esterna utente-evento
    @OneToMany(mappedBy = "eutente")
    private Set<Evento> eve;
    
    //referenziazione chiave esterna utente-commento
    @OneToMany(mappedBy = "cutente")
    private Set<Commento> com;
    
    //referenziazione many to many utente-categoria
    @ManyToMany 
    @JoinTable(
        name = "utente_categoria",
        joinColumns = {@JoinColumn(name="Nickname")},
        inverseJoinColumns={@JoinColumn(name="Id")}
    )
    private Set<Categoria> cat;
    
    public Utente(){}
    
    public Utente(String nick, String nom, String cog, String email){
        this.nick = nick;
        this.nom = nom;
        this.cog = cog;
        this.email = email;
    }
    
    public Utente(String nick, String nom, String cog, String email, Set<Evento>eve, Set<Commento> com, Set<Categoria> cat){
        this.nick = nick;
        this.nom = nom;
        this.cog = cog;
        this.email = email;
        this.eve = eve;
        this.com = com;
        this.cat = cat;
    }
    
    public String getNick() {
        return nick;
    }

    public String getNom() {
        return nom;
    }

    public String getCog() {
        return cog;
    }

    public String getEmail() {
        return email;
    }

    public Set<Evento> getEve() {
        return eve;
    }

    public Set<Commento> getCom() {
        return com;
    }

    public Set<Categoria> getCat() {
        return cat;
    }

    public void setCat(Set<Categoria> cat) {
        this.cat = cat;
    }

    public void setEve(Set<Evento> eve) {
        this.eve = eve;
    }

    public void setCom(Set<Commento> com) {
        this.com = com;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCog(String cog) {
        this.cog = cog;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}//Utente
