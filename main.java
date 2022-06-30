import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int stepsTar = 10000;
        int[][] stepsArr = new int[12][30];
        int day = 0, month = 0, steps = 0;
        System.out.println("Welcome to the Step Counter!");
        Scanner scanner = new Scanner(System.in);
        StepTracker ST = new StepTracker();//Вызываем конструктор??? Назовем "ST"
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            // обработка разных случаев
            if (userInput == 1) {
                System.out.println("Enter the new days target: ");
                stepsTar = scanner.nextInt();
                System.out.println("New days target is: " +stepsTar+ " steps per day.");
            }

            if (userInput == 2) {
                System.out.println(" Enter the month");
                month = scanner.nextInt();
                System.out.println(" Enter the day");
                day = scanner.nextInt();
                System.out.println(" How many steps at this day?");
                steps = scanner.nextInt();
                ST.stepsCounter(month, day, steps);
            }

            if (userInput == 3)
                ST.results(stepsTar);
            printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
            userInput = scanner.nextInt(); // повторно2 е считывание данных от пользователя
        }
        System.out.println("the program is completed");
    }

    private static void printMenu () {
        System.out.println("MENU");
        System.out.println("1 - Your goal (default: 10000 steps in a day)");
        System.out.println("2 - Enter the number of steps");
        System.out.println("3 - Your results");
        System.out.println("0 - Exit");
    }

}