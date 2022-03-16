/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Employee {

    private String code;
    private String name;
    private String gender;
    private int numofchild;
    private double salary;
    private Date dateofbirth;
    private final double allowance1 = 1000000.0;
    private final double allowance2 = 1500000.0;

    public Employee() {
    }

    public Employee(String code, String name, String gender, int numofchild,
            double salary, Date dateofbirth) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.numofchild = numofchild;
        this.salary = salary;
        this.dateofbirth = dateofbirth;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumofchild() {
        return numofchild;
    }

    public void setNumofchild(int numofchild) {
        this.numofchild = numofchild;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void CalculateIncome() {
        double income = 0;
        if (this.getNumofchild() <= 0) {
            income = this.salary;
        } else if (this.getNumofchild() <= 2) {
            income = this.salary + allowance1;
        } else {
            income = this.salary + allowance2;
        }
    }

    @Override
    public String toString() {
        String format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);       
        String str = dateFormat.format(this.dateofbirth);
        return code + "\t" + name + "\t" + gender + "\t" + numofchild + "\t" + salary + "\t" + str + "\t";
    }

}
