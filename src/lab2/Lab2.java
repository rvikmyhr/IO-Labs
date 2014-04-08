/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rvikmyhr
 */
public class Lab2 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Select record number");

        try {
            int searchInput = input.nextInt();

            File data = new File("src" + File.separatorChar + "Lab1.txt");

            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(data));
                String line = br.readLine();

                double recordStart = searchInput * 8 - 7;
                double recordEnd = recordStart + 7;

                int count = 1;               
                
                while (line != null) {
                    if (count >= recordStart && count <= recordEnd) {
                        System.out.println(line);
                    }
                    line = br.readLine();
                    count++;                    
                }
               
            } catch (IOException io) {
                System.out.println("problem");
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("Invalid Input");
        }
    }
}
