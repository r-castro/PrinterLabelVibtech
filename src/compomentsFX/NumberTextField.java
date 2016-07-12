/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compomentsFX;

import java.util.regex.Pattern;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextField;

/**
 *
 * @author Rodrigo
 */
public class NumberTextField extends TextField {
    
    Pattern stringRegex = Pattern.compile("[1-9]|");

    public NumberTextField() {
    }

    @Override
    public void replaceSelection(String replacement) {
        if (stringRegex.matcher(replacement).matches()) {
            super.replaceSelection(replacement);
        }
    }

    @Override
    public void replaceText(int start, int end, String text) {
        if (stringRegex.matcher(text).matches()) {
            super.replaceText(start, end, text);
        }
    }

    @Override
    public void replaceText(IndexRange range, String text) {
        if (stringRegex.matcher(text).matches()) {    
            super.replaceText(range, text);
        }
    }

    @Override
    public void insertText(int index, String text) {
        if (stringRegex.matcher(text).matches()) { 
            super.insertText(index, text); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
   
    
}
