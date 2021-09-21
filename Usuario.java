/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;

/**
 *
 * @author Celeste
 */

public class Usuario {
    
  //Atributos
    String nombre;
    int identificacion;
    String email;
    int edad;
    String area;
    boolean jefe;
    double Nomina;
    double Sueldo;
    
    public  Usuario (String nombre, int identificacion,String email, int edad, String area, boolean jefe)
    {
        //inicializarlos
        this.nombre= nombre;
        this.identificacion=identificacion;
        this.email=email;
        this.edad=edad;
        this.area=area;
        this.jefe=jefe;
              
    }
    public void info()
    {
 
        if(jefe==true)
        {
            if("desarrollo".equals(this.area))
            {
                Nomina=7000000;
            }
            else 
            {
                Nomina=6500000;
            }
        }
        else
        {
            if("desarrollo".equals(this.area))
            {
                Nomina=4500000;
            }
            else
            {
                Nomina=3500000;
            }
        }
         if (Nomina>3634104)
         {
              Sueldo = Nomina-(Nomina*(0.08+0.01));
         }
        else
         {
            Sueldo = Nomina-(Nomina*0.08); 
         }
        
        System.out.println("[Usuario]:");
        System.out.println("Nombre: "+nombre);
        System.out.println("Identificacion: "+identificacion);
        System.out.println("Email: "+email);
        System.out.println("Edad: "+edad);
       System.out.println("Area: "+area);
        System.out.println("Salario: "+Sueldo);
    
    }
   
}


