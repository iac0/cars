package carStory.anagrafica
import carStory.officina.*
class Meccanico extends Persona{

	Integer numeroDipendenti
	String codiceOfficina
	
	static hasMany = [dipendenti:Dipendente,clienti:Cliente,officine:Officina]

    static constraints = {
		codiceOfficina unique:true
    }
}
