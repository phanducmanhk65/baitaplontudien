/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.HashMap;
/**
 *
 * @author Asus
 */
public class Dictionary {
    public Vector<Word1> list = new Vector<>();
    //public static HashMap<String, String> list = new HashMap<>();
 public static void main(String[] args) throws IOException {
    DictionaryCommandline h = new DictionaryCommandline();
    h.dictionaryAdvance();
 }
}
