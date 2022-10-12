import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();

        double[] numbers1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers1[i]);
        }
        System.out.println();

        int[] distance = new int[7];
        distance[0] = 12;
        distance[1] = 15;
        distance[2] = 10;
        distance[3] = 11;
        distance[4] = 14;
        distance[5] = 5;
        distance[6] = 3;

        for (int i = 0; i < 7; i++) {
            System.out.println(distance[i]);
        }
        System.out.println();
        System.out.println("Задание 2");

        int[] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
            if (i != numbers2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers3 = {1.57, 7.654, 9.986};
        numbers3[0] = 1.57;
        numbers3[1] = 7.654;
        numbers3[2] = 9.986;
        for (int i = 0; i < numbers3.length; i++) {
            System.out.print(numbers3[i]);
            if (i != numbers3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] distance1 = new int[7];
        distance1[0] = 12;
        distance1[1] = 15;
        distance1[2] = 10;
        distance1[3] = 11;
        distance1[4] = 14;
        distance1[5] = 5;
        distance1[6] = 3;

        for (int i = 0; i < distance1.length; i++) {
            System.out.print(distance1[i]);
            if (i != distance1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 3");

        int[] numbers4 = new int[3];
        numbers4[0] = 1;
        numbers4[1] = 2;
        numbers4[2] = 3;

        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers4[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers5 = {1.57, 7.654, 9.986};
        numbers5[0] = 1.57;
        numbers5[1] = 7.654;
        numbers5[2] = 9.986;
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers5[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] distance2 = new int[7];
        distance2[0] = 12;
        distance2[1] = 15;
        distance2[2] = 10;
        distance2[3] = 11;
        distance2[4] = 14;
        distance2[5] = 5;
        distance2[6] = 3;

        for (int i = 6; i >= 0; i--) {
            System.out.print(distance2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        int[] numbers6 = {1, 2, 3};
        for (int i = 0; i < numbers6.length; i++) {
            if (numbers6[i] % 2 == 1) {
                numbers6[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers6));

    }
}