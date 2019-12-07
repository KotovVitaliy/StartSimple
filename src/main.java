import Databases.*;
import TestTypes.ModuleTest;
import TestTypes.Test;
import TestTypes.TestFactory;
import TestTypes.UnitTest;

import java.lang.reflect.Array;
import java.util.*;

public class main
{
    public static void main(String[] args) {

        System.out.println("Начало программы");

        IDB db = DBFactory.Companion.get("host", "login", "password");
        System.out.println(
                db.host()
        );
    }

    public static void a() {
        MySQL m = new MySQL("host", "login", "password");
        m.ololo();
    }
}