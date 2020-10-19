/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythonreader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Júlia Nunes
 */
public class Printer {
    Lexer l = new Lexer();

    public void printcode() throws IOException{
        String [] lexemas = l.getLexema().split("\r\n");
        FileWriter arq = new FileWriter("C:\\Users\\Júlia Nunes\\Documents\\NetBeansProjects\\PythonReader\\src\\pythonreader\\IMC.java");;
        PrintWriter gravarArq = new PrintWriter(arq);
        for (int i=0; i<lexemas.length;i++) {
            gravarArq.println(lexemas[i]);
        }
    
        arq.close();
    }
    
    
}
