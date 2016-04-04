/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nom.pr01_m8_copia_01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ferran
 */
public class NomPr01_m8_copia_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    File f = new File("fitxer.html");
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
        bw.write("<html>");bw.newLine();
        bw.write(" <head>");bw.newLine();
        bw.write(" <title>");bw.newLine();
        bw.write("<h1>DAW2 Esto no es seri</h1>");
        bw.newLine();
        bw.write(" </title>");
        bw.newLine();
        bw.write(" </head>");
        bw.newLine();
        bw.write(" <body>");
        bw.newLine();
        bw.write(" <h1>DAW2 Esto no es serio</h1>");
        bw.newLine();
        bw.write(" </body>");
        bw.newLine();
        bw.write("</html>");
        bw.newLine();
        bw.close();
        }
    }
    
}
