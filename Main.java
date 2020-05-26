
package udemy.curso.java;

public class Main {

    public static void main(String[] args) {
             
        Persona persona1 = new Persona(1,"Carlos","Ortiz",32);
        Persona persona2 = new Persona(2,"Walter","Tejeda",33);
        Persona persona3 = new Persona(3,"Claudio","Sandoval",33);
        Persona persona4 = new Persona(4,"Prueba","Prueba",20);
        
        ListaPersonas lista = new ListaPersonas();
        lista.eliminarPersona(persona1);
        lista.agregarPersona(persona1);
        lista.agregarPersona(persona2);
        lista.agregarPersona(persona3);

        lista.listarPersonas();
        System.out.println("");
        
        lista.eliminarPersona(persona4);
        System.out.println("");
        
        lista.listarPersonas();
        System.out.println("");
        
        
        
        
        
    }
    
}
