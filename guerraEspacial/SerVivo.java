package guerraEspacial;


/**
 * Abstract class SerVivo - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */

/**
 * Esta clase está formada por una variable protegida de tipo
 *boolean llamada edad, con un método que devuelve su valor.
 *Representa a un SerVivo y es abstracta, al igual que el
 *concepto de ser vivo es abstracto: en el mundo hay plantas,
 *animales, personas... que son seres vivos, pero no “seres
 *vivos” de modo independiente
 */

public abstract class SerVivo{
    
    protected boolean vivo = true;
    
    public boolean isVivo(){
        return vivo;
    } 
}