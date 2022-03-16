/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author admin
 */
public interface Imanager {
    public void inputList(int size);
    public void showList();
    public int count();
    public void showSoCon(int n);
    public void sortBySalary();
    public void delete(int n);
    public void showByName(String name);
    public void updateSalary();
}
