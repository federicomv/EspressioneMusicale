/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.List;
import org.hibernate.*;

/**
 *
 * @author FSEVERI\loreggian3064
 */
public class ManageDatabase {
    //eventi
    public List<Evento> getEvento(String id){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        List q = sessione.createQuery("SELECT * FROM Eventi WHERE Id=" + id).list();
        sessione.getTransaction().commit();
        return q;
    }
    public List<Evento> getEventi(){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        List q = sessione.createQuery("SELECT * FROM Eventi").list();
        sessione.getTransaction().commit();
        return q;
    }
    public void salvaEvento(Evento e){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        sessione.save(e);
        sessione.getTransaction().commit();
    }
    //artisti
    public List<Evento> getArtista(String id){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        List q = sessione.createQuery("SELECT * FROM Artisti WHERE Id=" + id).list();
        sessione.getTransaction().commit();
        return q;
    }
    public List<Evento> getArtisti(){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        List q = sessione.createQuery("SELECT * FROM Artisti").list();
        sessione.getTransaction().commit();
        return q;
    }
    public void salvaArtisti(Artista a){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        sessione.save(a);
        sessione.getTransaction().commit();
    }
    //commenti
    public List<Evento> getCommento(String id){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        List q = sessione.createQuery("SELECT * FROM Commenti WHERE Id=" + id).list();
        sessione.getTransaction().commit();
        return q;
    }
    public List<Evento> getCommenti(){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        List q = sessione.createQuery("SELECT * FROM Commenti").list();
        sessione.getTransaction().commit();
        return q;
    }
    public void salvaCommento(Commento c){
        Session sessione = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = sessione.beginTransaction();
        //query
        sessione.save(c);
        sessione.getTransaction().commit();
    }
}
