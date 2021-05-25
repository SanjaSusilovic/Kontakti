# Kontakti

Aplikacija Kontakti se sastoji od dvije klase u modelu: Kontakt i VrstaKontakta. 
Između njih je veza više naprama jedan. 
Svaki kontakt ima samo jednu vrstu kontakta, a vrsta kontakta (npr. poslovni kontakt) ima više kontakata. 
Klasa Kontakt ima svojstva: primarni ključ, datum unosa, vrstu kontakta, ime, prezime i broj. 
Klasa VrstaKontakta ima svojstva: primarni ključ, naziv i napomena. 
Aplikacija je napravljena u MVC arhitekturi. 
U controlleru je napravljena obrada klase Kontakt i VrstaKontakta, tj. CRUD metode (create, read, update, delete). 
Klasa FormaKontakti u view paketu sadrži ComboBox (padajuću listu) za izbor vrste kontakta. 
Aplikacija se koristi na način da se u klasi FormaVrstaKontakta upišu vrste kontakta (npr. poslovni, obitelj, prijatelj, poznanik),
te ih se doda u listu, a kasnije se mogu promijeniti i obrisati (pomoću Buttona Dodaj, Promijeni, Obriši), 
a u klasi FormaKontakti se dodaju ime i prezime kontakta, datum unosa, broj i izabire se vrsta kontakta u padajućoj listi. 
Uneseni podaci se mogu promijeniti i obrisati te ponovno dodavati, i tako se pohranjuju u bazu podataka. 



