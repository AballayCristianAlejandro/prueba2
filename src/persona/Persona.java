
package persona;
import java.util.Scanner;

public class Persona {
    private String Nombre ;
    private String Domicilio;
    private int edad;
    private int dni;
    Scanner entrada = new Scanner(System.in);

    public Persona (){
    }
    
    public void pedirDatos (){
         System.out.println("Ingrese en este orden los sioguintes dato Nombre Domicilio, edad y dni");          Nombre = entrada.next();
        Domicilio = entrada.next();
        edad = entrada.nextInt();
        dni = entrada.nextInt();
    
        
    }
    public void andar(){
      
        System.out.println("Andar como Persona");
    }
    public void correr(){
    
        System.out.println("Correr como persona");
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Domicilio
     */
    public String getDomicilio() {
        return Domicilio;
    }

    /**
     * @param Domicilio the Domicilio to set
     */
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}