/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import comparator.SortByGender;
import comparator.SortBySalaryASC;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Manager implements Imanager {

    ArrayList<Employee> list = new ArrayList<>();
    String format = "dd/MM/yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(format);

    public Manager() {
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }

    @Override
    public void inputList(int size) {
        for (int i = 0; i < size; i++) {
            try {
                System.out.println("Enter code of employee: ");
                String code = Common.input.readLine();
                System.out.println("Enter name of employee: ");
                String name = Common.input.readLine();
                System.out.println("Enter employee's date of birth: ");
                String dateofbirth = Common.input.readLine();
                Date date = dateFormat.parse(dateofbirth);
                System.out.println("Enter gender of employee: ");
                String gender = Common.input.readLine();
                int numofchild = Common.InputInt("Enter employee's children: ");
                double salary = Common.InputDouble("Enter salary of employee: ");

                Employee employee = new Employee(code, name, gender, numofchild, salary, date);
                list.add(employee);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void showList() {
        for (Employee item : list) {
            System.out.println(item.toString());
        }
    }

    @Override
    public int count() {
        int flag = 0;
        for (Employee item : list) {
            if (item.getGender().equals("Female") && item.getNumofchild() == 0) {
                flag++;
                System.out.println("There are " + flag + " females without allowance.");
            } else {
                System.out.println("There is no females employee without allowance.");
            }
        }
        return 0;
    }

    @Override
    public void showSoCon(int n) {
        System.out.println("List of employee with number of child < " + n);
        for (Employee item : list) {
            if (item.getNumofchild() < n) {
                System.out.println(item.toString());
            }
        }
    }

    @Override
    public void sortBySalary() {
        Collections.sort(list, new SortByGender());
        Collections.sort(list, new SortBySalaryASC());
    }

    @Override
    public void delete(int n) {
        list.removeIf(t -> (t.getGender().equals("Male") && t.getNumofchild() > n));
    }

    @Override
    public void showByName(String name) {
        for (Employee item : list) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void updateSalary() {

        for (Employee item : list) {
            Date EmployeeDate = item.getDateofbirth();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(EmployeeDate);
            Date date = new Date();
            Calendar now = Calendar.getInstance();
            now.setTime(date);
            int dateYear = now.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
            if (dateYear < 30) {
                item.setSalary(item.getSalary() * 1.05);
            } else if (dateYear <= 40) {
                item.setSalary(item.getSalary() * 1.10);
            } else {
                item.setSalary(item.getSalary() * 1.15);
            }
        }
    }

}
