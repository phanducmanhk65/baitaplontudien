/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Translate;

/**
 *
 * @author HP
 */
import com.darkprograms.speech.translator.GoogleTranslate;

import javax.swing.*;
import java.io.IOException;
 
public class Translate {
     public static String googleTranslate(String language,String target)
    {
        String meaning="";
        try {
            meaning= GoogleTranslate.translate(language,target);


        }catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Không có kết nối!");
        }
        return meaning;
    }
}
