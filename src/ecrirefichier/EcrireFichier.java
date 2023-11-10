/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecrirefichier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Toshiba
 */
public class EcrireFichier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        EcrireFichier t = new EcrireFichier();
    }
    
    public EcrireFichier() throws IOException{
        BufferedWriter output = new BufferedWriter(new FileWriter("Coucou.txt"));
        output.write("Bonjour ILM");
        for(int i=1;i<=10;i++){output.write(""+i);output.newLine(); }
        output.close();

   
    
}
    }
    
    
