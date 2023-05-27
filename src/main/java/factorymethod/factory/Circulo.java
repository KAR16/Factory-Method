/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Circulo implements Shape{

    @Override
    public void draw() {
        int radio=3;
        float pin=(float) 3.14;
        float area = pin*9;
        float peri=2*pin*radio;
        
       System.out.println("\nUn circulo");
       System.out.println("El area es: "+area);
       System.out.println("El perimetro es: "+peri);
       
    }
    
}