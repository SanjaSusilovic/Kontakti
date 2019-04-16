/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.kontakti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

/**
 *
 * @author Sanja
 */
@Entity
@Table
public class Kontakt {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String datumUnosa;
    
    @ManyToOne
    private VrstaKontakta vrstaKontakta;
    
    private String ime;
    
    private String prezime;
    
    private int broj; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDatumUnosa() {
        return datumUnosa;
    }

    public void setDatumUnosa(String datumUnosa) {
        this.datumUnosa = datumUnosa;
    }

    public VrstaKontakta getVrstaKontakta() {
        return vrstaKontakta;
    }

    public void setVrstaKontakta(VrstaKontakta vrstaKontakta) {
        this.vrstaKontakta = vrstaKontakta;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + broj + " " + vrstaKontakta + " " + datumUnosa; 
    }
    
    
    
}
