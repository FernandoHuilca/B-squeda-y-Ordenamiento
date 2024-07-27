public class OrdenamientoPorSelección {
    public void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arreglo[min_idx];
            arreglo[min_idx] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
