package Databases

abstract class DB(var host: String, var user: String, var password: String): IDB {
    fun getConnectString(): String {
        return "connect " + host + "as host " + user + ":" + password
    }
}