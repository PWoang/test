/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import assignment.Employee;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class SortBySalaryASC implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() < o2.getSalary()){
            return -1;
        }
        if (o1.getSalary() == o2.getSalary()) {
            return 0;
        }
        return 1;
    }

}
