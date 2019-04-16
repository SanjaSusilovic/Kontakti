/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti;
import ffos.kontakti.pomocno.HibernateUtil;
import ffos.kontakti.controller.ObradaKontakt;
import ffos.kontakti.controller.ObradaVrstaKontakta;
import ffos.kontakti.model.Kontakt;
import ffos.kontakti.model.VrstaKontakta;
import ffos.kontakti.view.Izbornik;

/**
 *
 * @author tjakopec
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // HibernateUtil.getSession();
     /*
ObradaVrstaKontakta ovk = new ObradaVrstaKontakta();
VrstaKontakta vk = new VrstaKontakta();
vk.setNaziv("poslovni");
ovk.dodaj(vk);
       
Kontakt k = new Kontakt();
k.setDatumUnosa("1.5.2012.");
k.setIme("Danijel");
k.setPrezime("Danči");
k.setBroj(123456789);
k.setVrstaKontakta(vk);

      
ObradaKontakt ok = new ObradaKontakt();
ok.dodaj(k);
*/
     new Izbornik().setVisible(true);  
    }
    
}
