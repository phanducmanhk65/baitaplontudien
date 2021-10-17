/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcd;

/**
 *
 * @author HP
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;

public class Dictionary1 {
   public Vector<Word1> list = new Vector<>();
   
   public static void main(String[] args) throws IOException {
  
  DictionaryCommandline1 h = new DictionaryCommandline1();
  h.dictionaryAdvance();
  
}
}
