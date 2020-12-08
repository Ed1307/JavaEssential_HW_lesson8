package worker;

public class Main {
    public static void main(String[] args) {
    Worker[] workers = new Worker[5];

    Methods.fillArray(workers);

    Methods.sortByNames(workers);

    for (Worker a:workers) {
            System.out.println(a.getName());
        }

    Methods.goodWorker(workers);
}}
