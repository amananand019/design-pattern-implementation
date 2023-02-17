package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.button.IButton;
import abstractFactoryDesignPattern.guiFactory.GUIFactory;
import abstractFactoryDesignPattern.guiFactory.OperatingSystem;
import abstractFactoryDesignPattern.textBox.ITextBox;

public class Client {
    public static void main(String[] args) {
        GUIFactory factory = new GUIFactory();
        OperatingSystem mac = factory.getOperatingSystem("MAC");
        IButton macBtn = mac.createButton();
        ITextBox macTB = mac.createTextBox();

        macBtn.press();
        macTB.showText();

        OperatingSystem windows = factory.getOperatingSystem("WINDOWS");
        IButton windowsBtn = windows.createButton();
        ITextBox windowsTB = windows.createTextBox();

        windowsBtn.press();
        windowsTB.showText();
    }
}
