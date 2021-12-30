public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS =
            {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS =
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 & year % 100 != 0) {
            return true;
        }
        else return year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        boolean yearValidator = false, monthValidator = false;
        if (year >= 1 & year <= 9999) {
            yearValidator = true;
        }
        if (yearValidator) {
            if (month >= 1 & month <= 12) {
                monthValidator = true;
            }
            if (monthValidator) {
                if (month == 2) {
                    if (day >= 1 & day <= 28) {
                        return true;
                    }
                    else if (day == 29) {
                        return isLeapYear(year);
                    }
                }
                else return day >= 1 & day <= DAYS_IN_MONTHS[month - 1];
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int totalDays = day;
        for (int yearCounter = 1; yearCounter <= year; yearCounter++) {
            int maxMonth = (yearCounter < year ? 12 : month - 1);
            for (int monthCounter = 1; monthCounter <= maxMonth; monthCounter++) {
                if (monthCounter != 2) {
                    totalDays += DAYS_IN_MONTHS[monthCounter];
                }
                else {
                    if (isLeapYear(year)) {
                        totalDays += 29;
                    }
                    else {
                        totalDays += 28;
                    }
                }
            }
        }
        return totalDays % 7;
    }

    public MyDate(int year, int month, int day) {
        this.setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year >= 1 & year <= 9999) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 & month <= 12) {
            this.month = month;
        }
        else {
            throw new IllegalArgumentException("Invalid month");
        }
    }

    public void setDay(int day) {
        if (day >= 1 & day <= 12) {
            this.day = day;
        }
        else {
            throw new IllegalArgumentException("Invalid day");
        }
    }

    @Override
    public String toString() {
        String weekDay = DAYS[getDayOfWeek(this.year, this.month, this.day) - 1];
        String monthString = MONTHS[this.month - 1];
        return String.format("%s %d %s %d", weekDay, this.day, monthString, this.year);
    }

    public MyDate nextDay() {
        if (this.day < DAYS_IN_MONTHS[this.month - 1]) {
            return new MyDate(this.year, this.month, this.day + 1);
        } else {
            if (this.month != 12) {
                return new MyDate(this.year, this.month + 1, 1);
            } else {
                return new MyDate(this.year + 1, 1, 1);
            }
        }
    }

    public MyDate nextMonth() {
        if (this.month == 12) {
            return new MyDate(this.year + 1, 1, this.day);
        } else if ((DAYS_IN_MONTHS[this.month - 1] < DAYS_IN_MONTHS[this.month]) &
                (DAYS_IN_MONTHS[this.month - 1] == this.day)) {
            return new MyDate(this.year, this.month + 1, DAYS_IN_MONTHS[this.month]);
        } else {
            return new MyDate(this.year, this.month + 1, this.day);
        }
    }

    public MyDate nextYear() {
        if (this.year == 9999) {
            throw new IllegalStateException("Not possible to perform this method");
        } else {
            if (isLeapYear(this.year) & this.month == 2) {
                return new MyDate(this.year + 1, this.month, 28);
            } else {
                return new MyDate(this.year + 1, this.month, this.day);
            }
        }
    }

    public MyDate previousDay() {
        if (this.day != 1) {
            return new MyDate(this.year, this.month, this.day - 1);
        } else {
            if (this.month != 1) {
                return new MyDate(this.year, this.month - 1, DAYS_IN_MONTHS[this.month - 2]);
            } else {
                return new MyDate(this.year - 1, 12, 31);
            }
        }
    }

    public MyDate previousMonth() {
        if (this.month == 1) {
            return new MyDate(this.year - 1, 12, this.day);
        } else if ((DAYS_IN_MONTHS[this.month - 2] < DAYS_IN_MONTHS[this.month - 1]) &
                (DAYS_IN_MONTHS[this.month - 1] == this.day)) {
            return new MyDate(this.year, this.month - 1, DAYS_IN_MONTHS[this.month - 2]);
        } else {
            return new MyDate(this.year, this.month - 1, this.day);
        }
    }

    public MyDate previousYear() {
        if (isLeapYear(this.year) & this.month == 2) {
            return new MyDate(this.year - 1, this.month, 28);
        } else {
            return new MyDate(this.year - 1, this.month, this.day);
        }
    }
}
