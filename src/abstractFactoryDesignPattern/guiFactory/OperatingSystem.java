package abstractFactoryDesignPattern.guiFactory;

import abstractFactoryDesignPattern.button.IButton;
import abstractFactoryDesignPattern.textBox.ITextBox;

public interface OperatingSystem {
    IButton createButton();
    ITextBox createTextBox();
}
