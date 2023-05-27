/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Cuadrado implements Shape{
    
        @Override
        public void draw() {
            
        float L=2;  
        
        float area = L*L;
        float peri=L*L*L*L;
        
       System.out.println("\nUn Cuadrado");
       System.out.println("El area es: "+area);
       System.out.println("El perimetro es: "+peri);
       
    }
    
}
