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
public class SortByGender implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        
        if(o1.getGender().equals("Female") && o2.getGender().equals("Male")) {
            return -1;
        } else if(o1.getGender().equals("Female") && o2.getGender().equals("Female")
                && o1.getGender().equals("Male") && o2.getGender().equals("Male")) {
            return 0;
        }
        return 0;
    }
    
}
