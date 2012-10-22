package carStory.utenza

import org.apache.commons.lang.builder.HashCodeBuilder

class UserRuolo implements Serializable {

	User user
	Ruolo ruolo

	boolean equals(other) {
		if (!(other instanceof UserRuolo)) {
			return false
		}

		other.user?.id == user?.id &&
			other.ruolo?.id == ruolo?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (user) builder.append(user.id)
		if (ruolo) builder.append(ruolo.id)
		builder.toHashCode()
	}

	static UserRuolo get(long userId, long ruoloId) {
		find 'from UserRuolo where user.id=:userId and ruolo.id=:ruoloId',
			[userId: userId, ruoloId: ruoloId]
	}

	static UserRuolo create(User user, Ruolo ruolo, boolean flush = false) {
		new UserRuolo(user: user, ruolo: ruolo).save(flush: flush, insert: true)
	}

	static boolean remove(User user, Ruolo ruolo, boolean flush = false) {
		UserRuolo instance = UserRuolo.findByUserAndRuolo(user, ruolo)
		if (!instance) {
			return false
		}

		instance.delete(flush: flush)
		true
	}

	static void removeAll(User user) {
		executeUpdate 'DELETE FROM UserRuolo WHERE user=:user', [user: user]
	}

	static void removeAll(Ruolo ruolo) {
		executeUpdate 'DELETE FROM UserRuolo WHERE ruolo=:ruolo', [ruolo: ruolo]
	}

	static mapping = {
		id composite: ['ruolo', 'user']
		version false
	}
}
