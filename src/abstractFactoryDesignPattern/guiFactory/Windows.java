package abstractFactoryDesignPattern.guiFactory;

import abstractFactoryDesignPattern.button.IButton;
import abstractFactoryDesignPattern.button.WindowsButton;
import abstractFactoryDesignPattern.textBox.ITextBox;
import abstractFactoryDesignPattern.textBox.WindowsTextBox;

public class Windows implements OperatingSystem{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}
