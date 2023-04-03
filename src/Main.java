import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(int[] arr){
        System.out.println("Задача 1");

        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.\n");
    }
    public static void task2(int[] arr){
        System.out.println("Задача 2");

        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.\n");
    }
    public static void task3(int[] arr){
        System.out.println("Задача 3");

        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        double avgSum =(double)sum/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgSum + " рублей.\n");
    }
    public static void task4(){
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}