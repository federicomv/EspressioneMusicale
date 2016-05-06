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
@Table(name="Categoria")
public class Categoria {
    @Id
    @Column(name="Id")
    private String id;
    
    @Column(name="Nome")
    private String nome;
    
    //referenziazione many to many utente-categoria
    @ManyToMany(mappedBy="cat")
    private Set<Utente> ute;
    
    public Categoria(){}
    
    public Categoria(String id, String nome){
        this.id = id;
        this.nome = nome;
    }
    
    public Categoria(String id, String nome, Set<Utente> ute){
        this.id = id;
        this.nome = nome;
        this.ute = ute;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
