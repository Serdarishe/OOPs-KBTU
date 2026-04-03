package Problem1;

public class PPProblem1 {
    private int count;
    private double max;
    private double sum;

    public PPProblem1() {
        this.count = 0;
        this.max = 0;
        this.sum = 0;
    }

    public void insert(int num) {
        sum += num;
        count++;
        max = Math.max(max, num);
    }

    public double getAvg() {
        return sum / count;
    }

    public double getMax() {
        return max;
    }
}