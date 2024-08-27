package hus.oop.lab5.date;

import java.time.Year;
import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;
    final public static String[] MONTHS = {"Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "Jul", "Aug",
            "Sep", "Oct", "Nov", "Dec"};
    final public static String[] DAYS = {"Sunday", "Monday",
            "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    final public static int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }

    public boolean isValidDay(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (this.isLeapYear(year)) {
            if (day > 29 || day < 1) {
                return false;
            }
        } else {
            if (day > DAYS_IN_MONTHS[month - 1] || day < 1) {
                return false;
            }
        }
        return true;
    }

    public String getDayOfWeek(int year, int month, int day) {
        int JND =
                day + 1
                        + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5)
                        + (365 * (year + 4800 - ((14 - month) / 12)))
                        + ((year + 4800 - ((14 - month) / 12)) / 4)
                        - ((year + 4800 - ((14 - month) / 12)) / 100)
                        + ((year + 4800 - ((14 - month) / 12)) / 400)
                        - 32045;

        return DAYS[JND % 7];
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Invalid year!");
            return;
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid day!");
            return;
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate nextDay() {
        if (isLeapYear(year) && month == 2) {
            if (day < 29) {
                this.day++;
            } else {
                this.day = 1;
                this.month++;
            }
        } else {
            if (day < DAYS_IN_MONTHS[month - 1]) {
                this.day++;
            } else {
                if (month < 12) {
                    this.month++;
                    this.day = 1;
                } else {
                    this.month = 1;
                    this.day = 1;
                    this.year++;
                }
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            if (isLeapYear(year) && month == 1) {
                this.month++;
                this.day = 29;
            } else {
                if (DAYS_IN_MONTHS[month - 1] < DAYS_IN_MONTHS[month]) {
                    this.month++;
                } else {
                    this.month++;
                    if (day == DAYS_IN_MONTHS[month - 2]) {
                        this.day = DAYS_IN_MONTHS[month - 1];
                    }
                }
            }
        } else {
            this.year++;
            this.month = 1;
        }
        return this;
    }

    public MyDate nextYear() {
        if (year > 9999) {
            System.out.println("Year out of range!");
            return null;
        }
        if (isLeapYear(year) && month == 2 && day == 29) {
            this.day = 28;
        }
        this.year++;
        return this;
    }

    public MyDate previousDay() {
        if (isLeapYear(year) && month == 3) {
            if (day > 1) {
                this.day--;
            } else {
                this.day = 29;
                this.month--;
            }
        } else {
            if (day > 1) {
                this.day--;
            } else {
                if (month > 1) {
                    this.month--;
                    this.day = DAYS_IN_MONTHS[month - 1];
                } else {
                    this.year--;
                    this.month = 12;
                    this.day = DAYS_IN_MONTHS[month - 1];
                }
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            if (isLeapYear(year) && month == 3) {
                this.month--;
                this.day = 29;
            } else {
                if (DAYS_IN_MONTHS[month - 1] < DAYS_IN_MONTHS[month - 2]) {
                    this.month--;
                } else {
                    this.month--;
                    if (day > DAYS_IN_MONTHS[month - 1]) {
                        this.day = DAYS_IN_MONTHS[month - 1];
                    }
                }
            }
        } else {
            this.year--;
            this.month = 12;
        }
        return this;
    }

    public MyDate previousYear() {
        if (year < 1) {
            System.out.println("Year out of range!");
            return null;
        }
        if (isLeapYear(year) && month == 2 && day == 29) {
            this.day = 28;
        }
        this.year--;
        return this;
    }

    @Override
    public String toString() {
        return this.getDayOfWeek(year, month, day) + " " + day + " " + MONTHS[month - 1] + " " + year;
    }
}
