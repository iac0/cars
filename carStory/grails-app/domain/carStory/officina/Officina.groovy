package carStory.officina

import carStory.anagrafica.Dipendente;
import carStory.servizi.ServizioOfferto;

class Officina {
	String nome
	String stato = "Italia"
	String citta
	String via
	String cap
	
	static hasMany = [servizi:ServizioOfferto, operai:Dipendente]
    static constraints = {
    }
}
