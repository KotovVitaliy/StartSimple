package Databases

class DBFactory {
    companion object {
        fun get(host: String, login: String, password: String): IDB {
            return MySQL(host, login, password)
        }
    }
}

