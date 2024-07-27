public class OrdenamientoPorMergeSort {
    public void ordenar(int[] arreglo) {
        mergeSort(arreglo, 0, arreglo.length - 1);
    }

    private void mergeSort(int[] arreglo, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arreglo, left, mid);
            mergeSort(arreglo, mid + 1, right);
            merge(arreglo, left, mid, right);
        }
    }

    private void merge(int[] arreglo, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arreglo, left, L, 0, n1);
        System.arraycopy(arreglo, mid + 1, R, 0, n2);
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arreglo[k] = L[i];
                i++;
            } else {
                arreglo[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arreglo[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arreglo[k] = R[j];
            j++;
            k++;
        }
    }
}
