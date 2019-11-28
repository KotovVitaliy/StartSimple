package TestTypes;

public class TestFactory {
    public static Test getTest(String type) {
        if (type.equals("Unit")) {
            return new UnitTest();
        } else if (type.equals("Module")) {
            return new ModuleTest();
        } else if (type.equals("UI")) {
            return new UITest();
        } else {
            throw new IllegalArgumentException("Cannot get Test with type " + type);
        }
    }
}
