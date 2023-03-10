package abstractFactoryDesignPattern.guiFactory;

public class GUIFactory {
    public OperatingSystem getOperatingSystem(String os){
        return switch (os){
            case "WINDOWS" -> new Windows();
            default -> new Mac();
        };
    }
}
