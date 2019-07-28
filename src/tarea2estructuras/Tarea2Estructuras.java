
package tarea2estructuras;


public class Tarea2Estructuras {
    
   public static ListaCircularSimple lista = new ListaCircularSimple();
   
    public static void main(String[] args) {
        
        lista.insertarBolsa(2,"Que onda");
        lista.insertarBolsa(3,"Estructuras");
        lista.insertarBolsa(98987,"Fredy Ramirez");
        lista.insertarBolsa(1354,"hola que tal");
        lista.insertarBolsa(43524,"Celular");
        
        
        lista.mostrarBolsas();
        lista.contarBolsa(1354,"hola que tal");
        lista.contarBolsa(3,"Estructuras");
        
        
        
    }
    
}
