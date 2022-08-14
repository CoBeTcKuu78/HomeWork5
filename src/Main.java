public class Main {
    public static void main(String[] args) {
        /*
        //задание 1 и 2
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        System.out.println(arr[0]+ ", " +arr[1]+", " +arr[2]);

        float [] drobChisla = {-1.57f, 7.654f, 9.986f};
        drobChisla [0] = -1.57f;
        drobChisla [1] = 7.654f;
        drobChisla [2] = 9.986f;
        System.out.println(drobChisla[0]+ ", " +drobChisla[1]+", " +drobChisla[2]);

        int [] array = new int [5];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
                System.out.print(array[i]);
            if (i != array.length - 1){
                System.out.print(", "); */
        //задание 3
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[2] + ", " + array[1] + ", " + array[0]);

        float[] array2 = {-1.57f, 7.654f, 9.986f};
        array2[0] = -1.57f;
        array2[1] = 7.654f;
        array2[2] = 9.986f;
        for (int i = array2.length -1; i >= 0 ; i--) {
            System.out.print(array2[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        //System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);

        boolean[] array3 = {true, false};
        System.out.println();
        for (int i = array3.length-1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i != 0){
               System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 1) {
                array[i]++;
            }
            System.out.print(array[i]);
            if (i != array.length - 1){
                System.out.print(", ");
            }
        }
    }
}
