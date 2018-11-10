/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.FlowLayout;
import java.awt.List;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JList;
/**
 *
 * @author Nando
 */
public class Botao extends JFrame {
    private JButton Gerar = new JButton("Gerar"); 
    private JButton Visualizar = new JButton("Visualizar");
    private List Lista = new List(12);

    private ButtonHandler handler;

    public Botao(){
        super("Criando botões");
        setLayout(new FlowLayout());
        handler=new ButtonHandler(Gerar, Visualizar,Lista);
        
        Gerar.addActionListener(handler);
        add(Gerar);

        Visualizar.addActionListener(handler);
        add(Visualizar);
        
        add(Lista);
    }
}
