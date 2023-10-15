package Practice22.Task3;

import java.io.IOException;

public class TextDocument implements IDocument
{
    public TextDocument() {
        try {
            Process rs = Runtime.getRuntime().exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
