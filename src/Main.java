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
        numbers1[0] = 1.57;
        numbers1[1] = 7.654;
        numbers1[2] = 9.986;
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

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers2[i]+ ", ");
        }
        System.out.println();

        double[] numbers3 = {1.57, 7.654, 9.986};
        numbers3[0] = 1.57;
        numbers3[1] = 7.654;
        numbers3[2] = 9.986;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers3[i]+ ", ");
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

        for (int i = 0; i < 7; i++) {
            System.out.print(distance1[i]+ ", ");
        }

    }
}