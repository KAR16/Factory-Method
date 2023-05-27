/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod.factory;

/**
 *
 * @author mirey
 */
public class Formas {
    
        public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circulo")){
            return new Circulo();
            
        }else if(shapeType.equalsIgnoreCase("Rectangulo")){
            return new Rectangulo();
        }else if(shapeType.equalsIgnoreCase("Cuadrado")){
            return new Cuadrado();
            
        }else if(shapeType.equalsIgnoreCase("Rombo")){
            return new Rombo();
        }else if(shapeType.equalsIgnoreCase("Trapecio")){
            return new Trapecio();
        }
                
                
                
        return null;
}  
}
