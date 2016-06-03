package hibernate;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author FSEVERI\loreggian3064
 */
public class ManageDatabase{
    
        Session sessione = HibernateUtil.getSessionFactory().openSession();
    //eventi
    public Evento getEvento(String id){
        //query
        Evento q = (Evento) sessione.createQuery("FROM Evento WHERE Id=" + id).list().get(0);
        return q;
    }
    
    public ArrayList<Evento> getEventi(){ 
        Transaction tx = sessione.beginTransaction();
    
        //query
        ArrayList<Evento> q = (ArrayList)sessione.createQuery("FROM Evento").list();
        tx.commit();
        return q;
    }
    public void salvaEvento(Evento e){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        
        sessione.getTransaction().begin();
        //query
        sessione.save(e);
        sessione.getTransaction().commit();
    }
    //artisti
    public List<Artista> getArtista(String id){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
          sessione.getTransaction().begin();
        //query
        List q = sessione.createQuery("FROM Artista WHERE Id=" + id).list();
        sessione.getTransaction().commit();
        return q;
    }
    public List<Artista> getArtisti(){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
          sessione.getTransaction().begin();
        //query
        List q = sessione.createQuery("FROM Artista").list();
        sessione.getTransaction().commit();
        return q;
    }
    public void salvaArtisti(Artista a){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
          sessione.getTransaction().begin();
        //query
        sessione.save(a);
        sessione.getTransaction().commit();
    }
    //commenti
    public List<Commento> getCommento(String id){
        //query
        List q = sessione.createQuery("FROM Commento WHERE Id=" + id).list();
        return q;
    }
    public List<Commento> getCommenti(String id){
        //query
        List q = sessione.createQuery("FROM Commento WHERE IdEvento=" + id).list();
        return q;
    }
    public void salvaCommento(Commento c){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
          sessione.getTransaction().begin();
        //query
        sessione.save(c);
        sessione.getTransaction().commit();
    }
}
