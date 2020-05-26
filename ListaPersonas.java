package udemy.curso.java;

import java.util.ArrayList;

public class ListaPersonas {

    private ArrayList<Persona> listaPersonas = new ArrayList<>();

    public void agregarPersona(Persona persona) {
        if(listaPersonas.isEmpty()){
            listaPersonas.add(persona);
        }else{
            for(int i = 0; i < listaPersonas.size(); i++){
                 if(persona.getId() == listaPersonas.get(i).getId()){
                    System.out.println("El arreglo ya contiene a la persona");
                    break;
                }else{
                    listaPersonas.add(persona);
                    break;
                }
            }
        }
    }

    public void eliminarPersona(Persona persona) {
        if(listaPersonas.isEmpty()){
            System.out.println("El arreglo esta vacio , no se puede eliminar el elemento");
        }else{
            for(int i = 0; i < listaPersonas.size(); i++){
                if(persona.getId() == listaPersonas.get(i).getId()){
                    listaPersonas.remove(persona);
                    break;
                }else{
                    System.out.println("La persona no se encuentra en el arreglo");
                    break;
                }
            }
        }
    }

    public void listarPersonas() {
        for (Persona lista : listaPersonas) {
            System.out.println(lista.toString());
        }
    }

    public void actualizarPersona(int posicion, Persona persona) {
        listaPersonas.set(posicion, persona);
    }

}
