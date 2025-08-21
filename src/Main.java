import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputStream = new Scanner(System.in);
        System.out.println("Введите, последовательно, три целых числа: ");

        int variable1 = inputStream.nextInt();
        int variable2 = inputStream.nextInt();
        int variable3 = inputStream.nextInt();

        int arithmeticVar = (variable1 + variable2 + variable3)/3;
        System.out.printf("Среднее арифметическое значение: %f%n", arithmeticVar);

        if(arithmeticVar/2 > 3)
            System.out.println("Программа выполнена корректно.");
    }
}