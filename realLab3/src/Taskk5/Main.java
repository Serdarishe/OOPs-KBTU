package Taskk5;

public class Main {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate("Twix", 50),
                new Chocolate("Mars", 40),
                new Chocolate("Snickers", 60)
        };

        Sort.bubbleSort(chocolates);
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Time[] times = {
                new Time(10, 30, 5),
                new Time(9, 15, 0),
                new Time(10, 10, 10)
        };

        Sort.selectionSort(times);
        for (Time t : times) {
            System.out.println(t);
        }
    }
}