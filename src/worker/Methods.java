package worker;

import java.util.Scanner;

public class Methods {
    static void fillArray(Worker[] workers){
        System.out.println("Введите фамилию, должность и год");
        Scanner sc = new Scanner(System.in);
        try{
            for (int i = 0; i < 5; i++) {
                workers[i] = new Worker(sc.next(), sc.next(), sc.nextInt());
            }
        }
        catch(Exception e){
            System.out.println("Вы ввели не год");
            System.exit(0);}
    }
    static void sortByNames(Worker[] workers){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(workers[j].getName().charAt(0)>workers[j+1].getName().charAt(0)){
                    Worker w = workers[j];
                    workers[j] = workers[j+1];
                    workers[j+1] = w;
                }
            }
        }
    }

    static void goodWorker(Worker[] workers){
        for (Worker a:workers) {
            if((2020 - a.getYear())>20){
                System.out.println("good worker " + a.getName());
            }
        }
    }
}
