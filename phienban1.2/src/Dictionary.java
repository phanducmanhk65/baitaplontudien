
/*import javax.swing.*;
import java.util.*;
import java.io.*;

public class Dictionary {
 public Vector<Word> list = new Vector<>();
 private JPanel panel1;
 private JButton button1;


 public static void main(String[] args) throws IOException {
  //DictionaryCommandline d = new DictionaryCommandline();
 // d.dictionaryBasic();
 // DictionaryManagement t = new DictionaryManagement();
//t.insertFromFile();
//t.sf();
     // t.dictionaryLookup();
DictionaryCommandline h = new DictionaryCommandline();
h.dictionaryAdvance();
DictionaryManagement k = new DictionaryManagement();

 }

 private void createUIComponents() {
  // TODO: place custom component creation code here
 }



}*/
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Dictionary {
 public Vector<Word> list = new Vector<>();
 public static void main(String[] args) throws IOException {
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