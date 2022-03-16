/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> list = new ArrayList<>();
        Imanager m = new Manager();
        int option = 0;
        do {
            System.out.println("1. Enter list: ");
            System.out.println("2. Show list: ");
            System.out.println("3. Count the number of females without allowance: ");
            System.out.println("4. Show employee with number of children < n");
            System.out.println("5. Arranging salary of male employee ASC in list:");
            System.out.println("6. Remove male employees with number of children > n: ");
            System.out.println("7. Show employee by name: ");
            System.out.println("8. Update salary: ");
            System.out.println("0. Exit. ");
            System.out.println("=======================================================");
            option = Common.InputInt("Enter option: ");
            switch (option) {
                case 1:
                    int size = Common.InputInt("Enter size: "); 
                    while(size < 0) {
                        size = Common.InputInt("Size must be > 0. Enter size again:");
                    }
                    m.inputList(size);
                    break;
                case 2:
                    m.showList();
                    break;
                case 3:
                    m.count();
                    break;
                case 4:
                    int n = Common.InputInt("Enter n: ");
                    while(n < 0) {
                        n = Common.InputInt("n must be > 0. Enter n again: ");
                    }
                    m.showSoCon(n);
                    break;
                case 5:
                    m.sortBySalary();
                    System.out.println("List after sort by salary: ");
                    m.showList();
                    break;
                case 6:
                    int N = Common.InputInt("Enter n: ");
                    while(N < 0) {
                        N = Common.InputInt("N must be > 0. Enter N again: ");
                    }
                    m.delete(N);
                    break;
                case 7:
                    System.out.println("Enter name to show: ");
                    String name = Common.input.readLine();
                    m.showByName(name);
                    break;
                case 8:
                    m.updateSalary();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Enter again. ");
                    break;

            }
        } while (option != 0);
    }

}
