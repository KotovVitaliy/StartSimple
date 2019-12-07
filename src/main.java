import Databases.DBFactory;
import Databases.IDB;
import Databases.MySQL;
import TestTypes.ModuleTest;
import TestTypes.Test;
import TestTypes.TestFactory;
import TestTypes.UnitTest;

public class main
{
    public static void main(String[] args) {
        System.out.println("Начало программы");

//        IDB db = new MySQL("host", "login", "password");
        IDB db = DBFactory.Companion.get("host", "login", "password");
        System.out.println(
                db.host()
        );

    }
}