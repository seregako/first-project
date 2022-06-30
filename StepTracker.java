import java.util.Scanner;
public class StepTracker {

        int[][] stepsArr;
    StepTracker(){
            stepsArr = new int[12][30];
        }
        Converter Con = new Converter();
        int  [] [] stepsCounter(int month, int day, int steps){//введение и хранение количества шагов. Стлбцы - месяца, строки -  дни
            stepsArr [month-1][day-1] = steps;
            System.out.println("Data recorded");
            return stepsArr;
        }
        void results (int stepsTar){ //Метод для вывода результатов
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the month");
            int month = sc.nextInt()-1;
            int averSteps = 0, maxDay = 0,stepsSum =0, maxSteps =0;
            double distance = 0;
            //Среднее количество шагов. Наболее результативный день. Сумма шагов. Максимальное количество шагов за день.
            for (int i= 0; i<30;i++){
                stepsSum +=stepsArr[month] [i];
            }
            averSteps = stepsSum/30;
            for (int j =0; j<30;j++){
                if (stepsArr[month] [j] >maxSteps){
                    maxSteps = stepsArr[month] [j];
                    maxDay = j+1;
                }
                distance = stepsSum*0.00075;
            }
            System.out.println("sum of steps in month "+ (month +1) + " is "+ stepsSum);
            System.out.println("average steps per day "+averSteps);
            System.out.println("your record is "+maxSteps +"was at day # "+maxDay);
            System.out.println("The best series :");
            bestSeries(month,stepsTar);
            Con.converter(stepsSum);
        }

        void bestSeries (int month, int stepsTar){//int month
            int record = 0, record1 =0;
            for (int i =0;i<10;i++) {
                if (stepsArr[month][i] >= stepsTar)
                    record++;
                else if ((stepsArr[month][i] < stepsTar)) {
                    { if (record1 < record)
                        record1 = record;
                    }
                    record  = 0;
                }
            }
            if (record1 > record)
                System.out.println(record1+ " days");
            else System.out.println(record+" days");
        }
    }

