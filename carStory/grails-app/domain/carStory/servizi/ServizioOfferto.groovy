package carStory.servizi

class ServizioOfferto {
	Servizio servizio
	Date dataInizio = new Date()
	Date dataFine
	Boolean valido = true
	
    static constraints = {
		dataFine nullable:true
    }
	
	
}
