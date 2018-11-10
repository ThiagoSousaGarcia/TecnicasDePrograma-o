/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Random;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nando
 */
public final class RandomGaussian {
    public static void main(String... aArgs) throws IOException{
        Botao botoes = new Botao();	  
        botoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botoes.setLayout(new FlowLayout());
        botoes.setSize(1024,728);
        
        botoes.setVisible(true);
    }
    public static void gerarRandomGaussian() throws IOException{
        File arquivo = new File ("C:\\Users\\Nando\\Documents\\saidaRandowGaussian.txt");
        FileWriter out = new FileWriter(arquivo);
        PrintWriter gravar = new PrintWriter(out);

        RandomGaussian gaussian = new RandomGaussian();
        double MEAN = 100.0f; 
        double 
        VARIANCE = 5.0f;
        for (int idx = 1; idx <= 10; ++idx){
            gravar.println(gaussian.getGaussian(MEAN, VARIANCE));
            //log("Generated : " + gaussian.getGaussian(MEAN, VARIANCE));
        }
        out.close();
        //lerRandomGaussian(arquivo);
        Sort(arquivo);
    }
    public static void lerRandomGaussian(File arquivo) throws IOException{
        if(arquivo.exists()){
            FileReader in = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(in);
            while(leitor.ready()){
                System.out.println(leitor.readLine());
            }
            in.close();
        }
        
    }
    public static ArrayList<String> Sort(File arquivo) throws IOException{
        ArrayList<String> order = new ArrayList<>();
        if(arquivo.exists()){
            FileReader in = new FileReader(arquivo);
            BufferedReader leitor = new BufferedReader(in);
     
            while(leitor.ready()){
                order.add(leitor.readLine());
            }
            in.close();
            Collections.sort(order);
            //Arrays.sort(order);
            FileWriter out = new FileWriter(arquivo);
            PrintWriter gravar = new PrintWriter(out);
            
            for(int i=0; i < order.size(); i++){
                gravar.println(order.get(i));
                System.out.println(order.get(i)); // comentar quando acabar
            }
            out.close();
        }
        return order;
    }
    private Random fRandom = new Random();
        private double getGaussian(double aMean, double aVariance){
        return 
        aMean + fRandom.nextGaussian() * aVariance;
    }
    private static void log(Object aMsg){
    System.out.println(String.valueOf(aMsg));
    }
}
