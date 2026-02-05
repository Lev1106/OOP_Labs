package practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public String toUniversal() {
        String h, m, s;
        if (hour < 10) h = "0";
        else h = "";
        h += hour;
        if (minute < 10) m = "0";
        else m = "";
        m += minute;
        if (second < 10) s = "0";
        else s = "";
        s += second;
        return h + ":" + m + ":" + s;
    }
    public String toStandard() {
        String h, m, s, ampm;
        int hour = this.hour % 12;
        if (hour == 0) hour = 12;
        if (hour < 10) h = "0";
        else h = "";
        h += hour;
        if (minute < 10) m = "0";
        else m = "";
        m += minute;
        if (second < 10) s = "0";
        else s = "";
        s += second;
        if (this.hour < 12) ampm = "AM";
        else ampm = "PM";
        return h + ":" + m + ":" + s + " " + ampm;
    }
    public void add(Time time) {
        this.second += time.second;
        this.minute += time.minute;
        this.hour += time.hour;
        if (this.second >= 60) {
            this.minute++;
            this.second -= 60;
        }
        if (this.minute >= 60) {
            this.hour++;
            this.minute -= 60;
        }
        if (this.hour >= 24) this.hour %= 24;
    }
}
