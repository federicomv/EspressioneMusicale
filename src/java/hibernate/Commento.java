/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table; 
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FSEVERI\loreggian3064
 */
@Entity
@Table(name = "Commento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commento.findAll", query = "SELECT c FROM Commento c"),
    @NamedQuery(name = "Commento.findById", query = "SELECT c FROM Commento c WHERE c.id = :id"),
    @NamedQuery(name = "Commento.findByTesto", query = "SELECT c FROM Commento c WHERE c.testo = :testo"),
    @NamedQuery(name = "Commento.findByVoto", query = "SELECT c FROM Commento c WHERE c.voto = :voto")})
public class Commento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false) 
    @Column(name = "Id")
    private String id;
    @Basic(optional = false) 
    @Column(name = "Testo")
    private String testo;
    @Basic(optional = false) 
    @Column(name = "Voto")
    private long voto;
    @JoinColumn(name = "Utente", referencedColumnName = "Nickname")
    @ManyToOne
    private Utente utente;
    @JoinColumn(name = "IdEvento", referencedColumnName = "Id")
    @ManyToOne
    private Evento idEvento;

    public Commento() {
    }

    public Commento(String id) {
        this.id = id;
    }

    public Commento(String id, String testo, long voto) {
        this.id = id;
        this.testo = testo;
        this.voto = voto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public long getVoto() {
        return voto;
    }

    public void setVoto(long voto) {
        this.voto = voto;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Evento getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
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
        if (!(object instanceof Commento)) {
            return false;
        }
        Commento other = (Commento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hibernate.Commento[ id=" + id + " ]";
    }
    
}
