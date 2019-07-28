package tarea2estructuras;

public class ListaCircularSimple {

    Bolsa primero;
    Bolsa ultimo;
    int contador = 0;
    int contador2 = 0;
    int resultado = 0;

    public ListaCircularSimple() {
        primero = null;
        ultimo = null;
    }
//METODO VACIO
    public boolean esVacia() {
        boolean condicion = false;
        if (ultimo == null) {
            condicion = true;
        } else {
            condicion = false;
        }

        return condicion;
    }
    //METODO INSERTAR
    public void insertarBolsa(int info, String info2) {
        Bolsa nuevo = new Bolsa();
        nuevo.info = info;
        nuevo.info2 = info2;

        if (esVacia()) {
            primero = nuevo;
            primero.siguiente = primero;
            ultimo = nuevo;
            contador++;

        } else {
            ultimo.siguiente = nuevo;

            nuevo.siguiente = primero;
            ultimo = nuevo;
            contador++;
        }
    }
//METODO CONTAR
    public void contarBolsa(int info, String info2) {
        Bolsa aux;
        Bolsa aux2;
        aux = primero;
        aux2 = ultimo;

        do {
            contador2++;

            try {

                if (info != aux.info && !aux.info2.equals(info2)) {
                    aux = aux.siguiente;
                    if (aux == aux2) {
                        contador = 0;
                        contador2 = 0;
                        System.out.println("-----------------------------");
                        System.out.println("Datos no Encontrados");
                        System.out.println("-----------------------------");
                        break;
                    }
                }
                if (aux.info == info && !aux.info2.equals(info2)) {
                    System.out.println("-----------------------------");
                    System.out.println("El segundo dato es incorrecto");
                    System.out.println("-----------------------------");
                    contador = 0;
                    contador2 = 0;
                    break;

                } else if (info != aux.info && info2.equals(aux.info2)) {
                    System.out.println("-----------------------------");
                    System.out.println("El primer dato es incorrecto");
                    System.out.println("-----------------------------");
                    contador = 0;
                    contador2 = 0;
                    break;
                }

            } catch (Exception e) {
                System.out.println("Datos no validos");
            }

        } while (info != aux.info && !info2.equals(aux.info2));

        resultado = contador - contador2;
        /*System.out.println("contador 1   "+ contador);
        System.out.println("contador 2   "+contador2);*/
        System.out.println("-----------------------------");
        System.out.println("El resultado del metodo Contar es   " + resultado);
        System.out.println("-----------------------------");
        
        contador2=0;
        resultado=0;

    }
//METODO MOSTRAR
    public void mostrarBolsas() {
        Bolsa actual = new Bolsa();
        actual = primero;
        do {

            System.out.println(actual.info + "  ---  " + actual.info2 + "  ---   ");
            actual = actual.siguiente;
        } while (actual != primero);
    }

}
