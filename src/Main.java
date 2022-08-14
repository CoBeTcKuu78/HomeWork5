public class Main {
    public static void main(String[] args) {
        //задание 1 и 2
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        //int [] arr = {1, 2, 3};
        System.out.println(arr[0]+ ", " +arr[1]+", " +arr[2]);

        float [] drobChisla = {-1.57f, 7.654f, 9.986f};
        drobChisla [0] = -1.57f;
        drobChisla [1] = 7.654f;
        drobChisla [2] = 9.986f;
        System.out.println(drobChisla[0]+ ", " +drobChisla[1]+", " +drobChisla[2]);

        int [] array = new int [10];
        int arrSise = array.length;
        for (int i=0; i<10; i++)
        System.out.print(i+ ", ");


    }
}