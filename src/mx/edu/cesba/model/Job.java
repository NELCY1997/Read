/*
 Nombre: Nelcy Aline Guerrero Rodrigez
Matricula:2022310
 */
package mx.edu.cesba.model;


public class Job {
    
    public int id;
    public String title ;
    public double minSalary;
    public double maxSalary;
    
    public void getDetails() { //METODO
       
        System.out.println("id:" +id);
        System.out.println("Title:" +title);
        System.out.println("Min Salary:" +minSalary);
        System.out.println("Max Salary:" +maxSalary);
       
       
}
    
}
