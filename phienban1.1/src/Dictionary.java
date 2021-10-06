
import java.util.*;
import java.io.*;

public class Dictionary {
 public Vector<Word> list = new Vector<>();
 public static void main(String[] args) throws FileNotFoundException{
  //DictionaryCommandline d = new DictionaryCommandline();
 // d.dictionaryBasic();
 // DictionaryManagement t = new DictionaryManagement();
//t.insertFromFile();
//t.sf();
     // t.dictionaryLookup();
DictionaryCommandline h = new DictionaryCommandline();
h.dictionaryAdvance();
 }
}
