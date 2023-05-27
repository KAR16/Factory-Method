/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Rombo implements Shape{
    
      @Override
        public void draw() {
        
        float d=4;
        float D=8;
        float L=5;
            
        float area = (D*d)/2;
        float peri = L+L+L+L+L;

        System.out.println("\nUn Rombo");
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + peri);

    }
    
}
