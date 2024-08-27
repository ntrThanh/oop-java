package hus.oop.lab5.time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        try {
            if (hour >= 0 &&  hour <= 23 &&
                    minute >= 0 && minute <= 59 &&
                    second >= 0 && second <= 59) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public void setTime(int hour, int minute, int second) {
        try {
            if (hour >= 0 &&  hour <= 23 &&
                    minute >= 0 && minute <= 59 &&
                    second >= 0 && second <= 59) {
                this.hour = hour;
                this.minute = minute;
                this.second = second;
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Invalid hour, minute, or second!");
        }
    }

    public String toString() {
        return hour + " : " + minute + " : " + second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        try {
            this.hour = hour;
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        try {
            this.minute = minute;
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        try {
            this.second = second;
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Invalid second!");
        }
    }

    public MyTime nextSecond() {
        if (second < 59) {
            this.second++;
        } else {
            if (minute < 59) {
                this.minute++;
                this.second = 0;
            } else {
                if (hour < 23) {
                    this.hour++;
                    this.minute = 0;
                    this.second = 0;
                } else {
                    this.hour = 0;
                    this.minute = 0;
                    this.second = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute < 59) {
            this.minute++;
        } else {
            if (hour < 23) {
                this.hour++;
                this.minute = 0;
            } else {
                this.hour = 0;
                this.minute = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour < 23) {
            this.hour++;
        } else {
            this.hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second > 0) {
            this.second--;
        } else {
            if (minute > 0) {
                this.minute--;
                this.second = 59;
            } else {
                if (hour > 0) {
                    this.hour--;
                    this.second = 59;
                    this.minute = 59;
                } else {
                    this.hour = 23;
                    this.second = 59;
                    this.minute = 59;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute > 0) {
            this.minute--;
        } else {
            if (hour > 0) {
                this.hour--;
                this.minute = 59;
            } else {
                this.hour = 23;
                this.minute = 59;
            }
        }
        return this;
    }
}
