/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Factory {

    public static void main(String[] args) {
        Formas formas = new Formas();
        
        Shape shape1=formas.getShape("Circulo");
        shape1.draw();
        
        Shape shape2=formas.getShape("Rectangulo");
        shape2.draw();       
        
        Shape shape3=formas.getShape("Cuadrado");
        shape3.draw();   
        
        Shape shape4=formas.getShape("Rombo");
        shape4.draw(); 
        
        Shape shape5=formas.getShape("Trapecio");
        shape5.draw(); 
    }
}
