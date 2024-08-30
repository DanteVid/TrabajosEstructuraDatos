package terceraClase;

import java.util.Arrays;

public class Optimizacion {

    public static boolean hasDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicateOptimizado(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {5,412,6,78,56,2342,2,6};
        if(hasDuplicate(a)){
            System.out.println("Hay un duplicado");
        }else {
            System.out.println("No hay duplicado");
        }

        int[] b = {5,412,78,56,78,2342,2,6,7};
        if(hasDuplicateOptimizado(b)){
            System.out.println("Hay un duplicado");
        }else {
            System.out.println("No hay duplicado");
        }
    }
}
