/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType; 
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FSEVERI\loreggian3064
 */
@Entity
@Table(name = "Evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e"),
    @NamedQuery(name = "Evento.findById", query = "SELECT e FROM Evento e WHERE e.id = :id"),
    @NamedQuery(name = "Evento.findByData", query = "SELECT e FROM Evento e WHERE e.data = :data"),
    @NamedQuery(name = "Evento.findByLuogo", query = "SELECT e FROM Evento e WHERE e.luogo = :luogo"),
    @NamedQuery(name = "Evento.findByTitolo", query = "SELECT e FROM Evento e WHERE e.titolo = :titolo")})
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Basic(optional = false)
    @Column(name = "Data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "Luogo")
    private String luogo;
    @Basic(optional = false)
    @Column(name = "Titolo")
    private String titolo;
    @JoinTable(name = "Evento_Artista", joinColumns = {
        @JoinColumn(name = "IdEvento", referencedColumnName = "Id")}, inverseJoinColumns = {
        @JoinColumn(name = "IdArtista", referencedColumnName = "Id")})
    @ManyToMany
    private Collection<Artista> artistaCollection;
    @OneToMany(mappedBy = "idEvento")
    private Collection<Commento> commentoCollection;
    @JoinColumn(name = "Categoria", referencedColumnName = "Id")
    @ManyToOne
    private Categoria categoria;
    @JoinColumn(name = "Utente", referencedColumnName = "Nickname")
    @ManyToOne
    private Utente utente;

    public Evento() {
    }

    public Evento(String id) {
        this.id = id;
    }

    public Evento(String id, Date data, String luogo, String titolo) {
        this.id = id;
        this.data = data;
        this.luogo = luogo;
        this.titolo = titolo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @XmlTransient
    public Collection<Artista> getArtistaCollection() {
        return artistaCollection;
    }

    public void setArtistaCollection(Collection<Artista> artistaCollection) {
        this.artistaCollection = artistaCollection;
    }

    @XmlTransient
    public Collection<Commento> getCommentoCollection() {
        return commentoCollection;
    }

    public void setCommentoCollection(Collection<Commento> commentoCollection) {
        this.commentoCollection = commentoCollection;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hibernate.Evento[ id=" + id + " ]";
    }
    
}
