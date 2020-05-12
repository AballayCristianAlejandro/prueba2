
package persona;


public class Deportista extends Persona {
   private int resistecia;
    
   public Deportista(){
   }
   @Override
   public void andar(){
       System.out.println("Andar como depostista");
   } 
   @Override
   public void correr (){
       System.out.println("Correr como deportista");
   }

    /**
     * @return the resistecia
     */
    public int getResistecia() {
        return resistecia;
    }

    /**
     * @param resistecia the resistecia to set
     */
    public void setResistecia(int resistecia) {
        this.resistecia = resistecia;
    }
   }

