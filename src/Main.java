import java.util.Arrays;

import static jdk.nashorn.internal.objects.NativeArray.reverse;
import static jdk.nashorn.internal.objects.NativeArray.some;

public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        //   task3();
        //   task4();
    }

    public static void task1() {
        System.out.println("Задачи 1-4");
        int[] firstMassiv = new int[3];
        firstMassiv[0] = 1;
        firstMassiv[1] = 2;
        firstMassiv[2] = 3;
        System.out.println(Arrays.toString(firstMassiv));
        double[] secondMassiv = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondMassiv));
        int[] threeMassiv = new int[]{4, 5, 6};
        System.out.println(Arrays.toString(threeMassiv));

        int[] reverse = new int[firstMassiv.length];
        int count = 0;
        for (int i = 1; i <= firstMassiv.length; i++) {
            reverse[count++] = firstMassiv[firstMassiv.length - i];
        }
        System.out.println(Arrays.toString(reverse));

        double[] reverse2 = new double[secondMassiv.length];
        double count2 = 0;
        for (double i = 1; i <= secondMassiv.length; i++) {
            reverse2[(int) count2++] = secondMassiv[(int) (firstMassiv.length - i)];
        }
        System.out.println(Arrays.toString(reverse2));

        int[] reverse3 = new int[threeMassiv.length];
        int count3 = 0;
        for (int i = 1; i <= threeMassiv.length; i++) {
            reverse3[count3++] = threeMassiv[threeMassiv.length - i];
        }
        System.out.println(Arrays.toString(reverse3));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 1;
            }
        System.out.println(Arrays.toString(arr));
    }
}





        
