package Databases

class MySQL(host: String, user: String, password: String): DB(host, user, password) {
    override fun connect() {
        // описан способ подключения для MySQL

    }

    override fun interruptConnection() {

    }

    override fun select(fields: HashMap<String, String>) {

    }

    override fun host(): String {
        this.ololo()
        this.host = "MySQL: " + this.host
        return this.host
    }

    fun ololo(): String {
        return "ololo"
    }
}