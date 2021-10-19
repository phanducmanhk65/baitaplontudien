
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Dictionary {
 public Vector<Word> list = new Vector<>();
 public static void main(String[] args) throws IOException {

  DictionaryCommandline h = new DictionaryCommandline();
  h.dictionaryAdvance();
 }
}
