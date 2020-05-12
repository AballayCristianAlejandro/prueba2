
package persona;

public class Mian {
    public static void main (String [] args){

      Persona persona = new Persona();
      Persona deportista = new Deportista ();
      
      persona.andar();
      persona.correr();
      
      deportista.andar();
      deportista.correr();
   
    }
}
