/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Common {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static int InputInt(String message) {
        int m;
        while (true) {
            try {
                System.out.println(message);
                m = Integer.parseInt(input.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Loi nhap so nguyen");
            }
        }
        return m;
    }

    //ham nhap 1 so thuc double
    public static double InputDouble(String message) {
        double m;
        while (true) {
            try {
                System.out.println(message);
                m = Double.parseDouble(input.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Loi nhap so thuc");
            }
        }
        return m;
    }

    public static Date InputDate(String message, String pattern) {
        Date m;
        SimpleDateFormat s = new SimpleDateFormat(pattern);

        while (true) {
            try {
                System.out.println(message);
                m = s.parse(input.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Loi nhap date.");
            }
        }
        return m;
    }


    

}
