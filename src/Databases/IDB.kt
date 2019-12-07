package Databases

interface IDB {
    fun connect()
    fun interruptConnection()
    fun select(fields: HashMap<String, String>)
    fun host() : String
}