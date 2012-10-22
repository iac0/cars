import carStory.utenza.*


class BootStrap {
	def springSecurityService
    def init = { servletContext ->
		
		def adminRole=Ruolo.findByAuthority("Admin")
		if(!adminRole){
			adminRole = new Ruolo(authority: 'Admin').save(flush: true)
			new Ruolo(authority: 'Cliente').save(flush: true)
			new Ruolo(authority: 'Meccanico').save(flush: true)
			new Ruolo(authority: 'Dipendente').save(flush: true)
			//String password = springSecurityService.encodePassword('admin')
			def testUser = new User(username: 'admin', enabled: true, password: "admin")
			testUser.save(flush: true)
			UserRuolo.create testUser,adminRole,true
		}
    }
    def destroy = {
    }
}
