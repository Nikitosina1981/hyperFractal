import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame
{
    private JFrame item;

    public TextEditor() throws HeadlessException
    {
        item = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

}
