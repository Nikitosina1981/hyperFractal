import java.awt.*;

public class Start
{
    public static void main(String[] args)
    {
        TextEditor textEditor = new TextEditor();
        DrawingPane drawingPane = new DrawingPane();
        textEditor.add(drawingPane);
        Graphics graphics = textEditor.getGraphics();
        drawingPane.paint(graphics);
    }
}
