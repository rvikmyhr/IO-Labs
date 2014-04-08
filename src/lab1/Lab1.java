/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author rvikmyhr
 */
public class Lab1 {

    public static void main(String[] args) throws IOException {

        boolean append = true;

        File data = new File("src" + File.separatorChar + "Lab1.txt");

        PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
        write.println("Sara");
        write.println("White");
        write.println("789 Apple Ave");
        write.println("San Angelo");
        write.println("TX");
        write.println("642-555-555");
        write.println("swhite@email.com");
        write.close();
        
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(data));
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
                }  
            
// Get second record            
//            int count = 1;
//            while (line != null) {
//                if (count >= 9 && count <= 16) {
//                    System.out.println(line);
//                }
//                line = br.readLine();
//                count++;
//            }

        } catch (IOException io) {
            System.out.println("problem");
        } finally {
            try {
                br.close();
            } catch (Exception e) {

            }
        }
    }
}
