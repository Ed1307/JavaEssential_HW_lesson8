package worker;

public class Worker {
    private String name;
    private String position;
    private int year;

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
}
