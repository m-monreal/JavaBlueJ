package ejemplo13;

/**
 * Write a description of class Ejemplo13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;

//Esta es la clase auxiliar, tiene el main de la aplicación
public class Ejemplo13{
    public static void main (String[] args) {
        //Creamos un objeto de tipo Frame
        JFrame frame = new Frame();
        //invoco sobre este objeto uno de los métodos que ha heredado
        //de JFrame: show. Los frames por defecto son “invisibles”,
        //este método los hace visibles.
        frame.show();
    }
} 