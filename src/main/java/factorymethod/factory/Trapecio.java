/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Trapecio implements Shape{
    
        @Override
        public void draw() {
        
        float B=8;
        float b=6;
        float h=4;  
        float L=5;
            
        float area = ((B+b)/2)*h;
        float peri=B+b+L+L;
        
       System.out.println("\nUn Trapecio");
       System.out.println("El area es: "+area);
       System.out.println("El perimetro es: "+peri);
       
    }
    
}
