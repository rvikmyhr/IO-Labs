/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rvikmyhr
 */
public class Lab3 {

    public static void main(String[] args) throws IOException {

            File data = new File("src" + File.separatorChar + "Lab1.txt");

            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader(data));
                String line = br.readLine();

                int count = 1;

                while (line != null) {
                    if (count == 12) {
                        System.out.println(line);
                        break;
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

        }
    }

