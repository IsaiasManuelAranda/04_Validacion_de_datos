/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

public class DataValidation {
    public int String2Int(String value){
        int result = 0;
        try{
            Integer.parseInt(value);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Sólo se aceptan números enteros");
            result = 0;
        }
        return result;
    }
    public float String2Float(String value){
        float result =0f;
        try{
            Float.parseFloat(value);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Sólo se aceptan números enteros");
        }
        return result;
    }
    public double String2Double(String value){
        double result = 0;
        try{
            Double.parseDouble(value);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Sólo se aceptan números enteros");
        }
        return result;
    }
}
