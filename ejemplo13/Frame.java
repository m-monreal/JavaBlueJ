package ejemplo13;

/**
 * Write a description of class Frame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Importamos una librería, un package
import javax.swing.*;
//Nuestra clse Frame extiende a JFrame
class Frame extends JFrame {
    //el constuctor
    public Frame(){
        //Este es uno de los métodos que nuestra clase Frame ha
        //heredado de JFrame. Pone un título a la ventana
        setTitle("Hola!!!");
        //Igual que el anterior, pero esta vez le da un tamaño
        setSize(300,200);
    }
}
