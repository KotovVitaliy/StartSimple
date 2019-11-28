import TestTypes.ModuleTest;
import TestTypes.Test;
import TestTypes.TestFactory;
import TestTypes.UnitTest;

public class main
{
    public static void main(String[] args) {
        System.out.println("Начало программы");

        Test test = TestFactory.getTest();
        test.showParams();
    }
}