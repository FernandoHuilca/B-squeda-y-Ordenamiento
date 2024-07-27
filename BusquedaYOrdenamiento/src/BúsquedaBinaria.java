public class BúsquedaBinaria {

    public int buscarElementoEnArreglo(int[] arreglo, int datoABuscar) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Verificar si el dato a buscar está en el medio
            if (arreglo[medio] == datoABuscar) {
                return medio;
            }

            // Si el dato a buscar es mayor, ignorar la mitad izquierda
            if (arreglo[medio] < datoABuscar) {
                inicio = medio + 1;
            }
            // Si el dato a buscar es menor, ignorar la mitad derecha
            else {
                fin = medio - 1;
            }
        }

        // Retorna -1 si el elemento no se encuentra en el arreglo
        return -1;
    }

}
