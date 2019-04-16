/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti.controller;
import ffos.kontakti.model.Kontakt;
import ffos.kontakti.model.VrstaKontakta;
import java.util.List;
import org.hibernate.Query;
/**
 *
 * @author Sanja
 */
public class ObradaKontakt extends Obrada{
    public ObradaKontakt(){
        super(); 
    } 
    
    //C
    public Kontakt dodaj(Kontakt p){
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
        
        return p;
    }
    //R
    public List<Kontakt> getKontakti(){
       Query q = session.createQuery("From Kontakt ");
        return q.list();
    }
    //U
    public void promjeni(Kontakt p){    
        session.beginTransaction();
        session.saveOrUpdate(p);
        session.getTransaction().commit();
    }
    //D
    public void obrisi(Kontakt p){ 
        session.beginTransaction();
        session.delete(p);
        session.getTransaction().commit();
    }
}
