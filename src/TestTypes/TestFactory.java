package TestTypes;

public class TestFactory {
    public static Test getTest() {
        String type = System.getenv("type");

        if (type == null) {
            throw new IllegalArgumentException("Type is not set as environment variable.");
        }

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
