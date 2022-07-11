import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Введите текст для разворота:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Введите количество повторений:\n" +
                "1. 1000\n" +
                "2. 10 000\n" +
                "3. 100 000");
        Integer number = scanner.nextInt();
        Integer iteration = -1;
        switch (number){
            case 1: iteration = 1000;
                break;
            case 2: iteration = 10000;
                break;
            case 3: iteration = 100000;
                break;
            default:
                System.out.println("Введите номер из представленного списка");
                return;
        }
        StringBuilder textByReversed = new StringBuilder();

        long start = System.currentTimeMillis();
        for (int i = 0; i <= iteration; i++) {
            textByReversed = textReverse(text);
        }
        long end = System.currentTimeMillis();
        System.out.println(text);
        System.out.println(textByReversed);
        System.out.println("Время работы при " +iteration+ " повторениях: " + (end-start) + " миллисекунд");
    }

    private static StringBuilder textReverse(String text){
        StringBuilder textByReversed = new StringBuilder();
        String[] letters = text.split("");
        for (int i = letters.length - 1; i>=0; i--){
            textByReversed.append(letters[i]);
        }
        return textByReversed;
    }
}
