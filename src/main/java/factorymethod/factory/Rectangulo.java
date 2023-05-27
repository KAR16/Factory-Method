/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Rectangulo implements Shape{

    public void draw() {
       System.out.println("\nUn Rectangulo");
       
       float altura=6;
       float base=8;
       
        float peri = 2*(altura+base);
        float area = base*altura;
        
       System.out.println("El area es: "+area);
       System.out.println("El perimetro es: "+peri);
    }
    
    
}