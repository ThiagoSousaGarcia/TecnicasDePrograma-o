/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static lab8.RandomGaussian.gerarRandomGaussian;
import static lab8.RandomGaussian.Sort;
/**
 *
 * @author Nando
 */
public class ButtonHandler implements ActionListener {
    private JButton Gerar, Visualizar;
    private List Lista;
	
	public ButtonHandler(JButton Gerar, JButton Visualizar, List Lista){
            this.Gerar = Gerar;
            this.Visualizar = Visualizar;
            this.Lista = Lista;
        }

	public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == Gerar) {
                JOptionPane.showMessageDialog(null, "Numeros gerados atraves de RandomGaussian!");
                try {
                    gerarRandomGaussian();
                    
                } catch (IOException ex) {
                    Logger.getLogger(ButtonHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if(evento.getSource() == Visualizar) {
                File arquivo = new File ("C:\\Users\\Nando\\Documents\\saidaRandowGaussian.txt");
                Lista.removeAll();
                try {
                    ArrayList<String> mostrar = Sort(arquivo);
                    for(int i=0; i < mostrar.size(); i++){
                        Lista.add(mostrar.get(i));
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ButtonHandler.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                JOptionPane.showMessageDialog(null, "O botão Visualizar foi clicado");  
            }
	}
}
