package carStory.anagrafica

import carStory.utenza.User

class Persona {
	static sessualita = [m:'Uomo',f:"Donna"]
	String nome
	String cognome
	Integer eta 
	String sesso = sessualita.m
	String stato
	String citta
	String via
	String cap
	User utenza
    static constraints = {
    }
}
