import java.util.Random;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = FillArray(10);
        outArray(arr);
    }
    public static int[] FillArray(int l){
        int[] arr = new int[l];
        Random r = new Random();
        for (int i = 0; i < l; i++) {
            arr[i] = r.nextInt(10);
        }
        return arr;
    }

    private static void outArray(int[] arrE) {
//        for (int i = 0; i < arrE.length; i++) {
//            System.out.println(arrE[i] + " ");
//        }
        for (int e : arrE){
            System.out.print(e + " ");
        }
    }
}

