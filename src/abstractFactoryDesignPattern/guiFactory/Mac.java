package abstractFactoryDesignPattern.guiFactory;

import abstractFactoryDesignPattern.button.IButton;
import abstractFactoryDesignPattern.button.MacButton;
import abstractFactoryDesignPattern.textBox.ITextBox;
import abstractFactoryDesignPattern.textBox.MacTextBox;

public class Mac implements OperatingSystem{
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
