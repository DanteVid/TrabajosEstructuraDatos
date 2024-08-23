package terceraClase;

public class Ej1 {

    //Complejidad temporal:
    public void printFirstElement(int[] arr) { // O(1) (Declara una variable en los atributos)
        if (arr.length > 0) { //(O(1)
            System.out.println(arr[0]); //O(1)
        }
    }

    // O(1)*O(1)*O(1)=O(1) -> O(1)

    //Complejidad espacial:
    public void printFirstElement2(int[] arr) { //O(n) Está usando un arreglo
        if (arr.length > 0) { //O(1)
            System.out.println(arr[0]);//O(1)
        }
    }

    // O(n)*O(1)*O(1)=O(n) -> O(n)
}
