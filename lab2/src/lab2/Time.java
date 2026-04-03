package lab2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int displayHour = hour % 12;
        if (displayHour == 0) {
            displayHour = 12;
        }
        String amPm = (hour >= 12) ? "PM" : "AM";
        return String.format("%02d:%02d:%02d %s", displayHour, minute, second, amPm);
    }

    public void add(Time other) {
        this.second += other.second;
        this.minute += other.minute + this.second / 60;
        this.hour += other.hour + this.minute / 60;

        this.second %= 60;
        this.minute %= 60;
        this.hour %= 24;
    }

    @Override
    public String toString() {
        return toUniversal();
    }
}
