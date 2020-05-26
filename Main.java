
package udemy.curso.java;

public class Main {

    public static void main(String[] args) {
        
        ListaPersonas lista = new ListaPersonas();
        Persona persona1 = new Persona(1,"Carlos","Ortiz",32);
        Persona persona2 = new Persona(2,"Walter","Tejeda",33);
        Persona persona3 = new Persona(3,"Claudio","Sandoval",33);
        Persona persona4 = new Persona(4,"Prueba","Prueba",20);
        
        
        //Validando los metodos.
        lista.listarPersonas();
        lista.eliminarPersona(persona1);
        System.out.println("");
        
        //Lógica normal.
        lista.agregarPersona(persona1);
        lista.agregarPersona(persona2);
        lista.agregarPersona(persona3);

        lista.listarPersonas();
        System.out.println("");
        
        //Validando el ultimo metodo
        lista.eliminarPersona(persona4);
        System.out.println("");
        
        lista.listarPersonas();
        System.out.println("");
        
        
        
        
        
    }
    
}
