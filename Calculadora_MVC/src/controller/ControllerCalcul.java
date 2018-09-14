
package controller;
import model.ModelCalcu;
import view.ViewCalcu;
import extras.DataValidation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerCalcul implements ActionListener{
    private final ModelCalcu model;
    private final ViewCalcu view;
    DataValidation dataValidator = new DataValidation();

    public ControllerCalcul(ModelCalcu model, ViewCalcu view) {
        this.view = view;
        this.model = model;
        
        
        view.jb_suma.addActionListener(this);
        view.jb_resta.addActionListener(this);
        view.jb_modulo.addActionListener(this);
        view.jb_division.addActionListener(this);
        view.jb_multiplicacion.addActionListener(this);
        initComponents();
        
    }
    
    @Override
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == view.jb_suma)
            sumaOpe(); 
        else if(e.getSource() == view.jb_resta)
            restaOpe();
        else if(e.getSource() == view.jb_division)
            divisionOpe();
        else if(e.getSource() == view.jb_modulo)
            moduloOpe();
        else if(e.getSource() == view.jb_multiplicacion)
            multiplicacionOpe();
        
        
    }
    public void sumaOpe(){
        model.setNum1(dataValidator.String2Float(view.jtf_num1.getText()));
        model.setNum2(dataValidator.String2Float(view.jtf_num2.getText()));
        model.getResult();
        float res = model.suma();
        JOptionPane.showMessageDialog(null,"La suma es :" + res);
    }
    public void restaOpe(){
        model.setNum1(dataValidator.String2Float(view.jtf_num1.getText()));
        model.setNum2(dataValidator.String2Float(view.jtf_num2.getText()));
        model.getResult();
        float res = model.resta();
        JOptionPane.showMessageDialog(null,"La resta es :" + res);
    }
    public void divisionOpe(){
        model.setNum1(dataValidator.String2Float(view.jtf_num1.getText()));
        model.setNum2(dataValidator.String2Float(view.jtf_num2.getText()));
        model.getResult();
        float res = model.division();
        JOptionPane.showMessageDialog(null,"La división es :" + res);
    }
    public void multiplicacionOpe(){
        model.setNum1(dataValidator.String2Float(view.jtf_num1.getText()));
        model.setNum2(dataValidator.String2Float(view.jtf_num2.getText()));
        model.getResult();
        float res = model.multiplicacion();
        JOptionPane.showMessageDialog(null,"La multiplicación es :" + res);
    }
    public void moduloOpe(){
        model.setNum1(dataValidator.String2Float(view.jtf_num1.getText()));
        model.setNum2(dataValidator.String2Float(view.jtf_num2.getText()));
        model.getResult();
        float res = model.modulo();
        JOptionPane.showMessageDialog(null,"El módulo es :" + res);
    }
    public void initComponents(){
        
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
