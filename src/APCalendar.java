public class APCalendar {
    public static int numberOfLeapYears(int year1, int year2){
        int numLeapYear = 0;
        for(int i = year1; i<year2; i++){
            if(isLeapYear(i)){
                numLeapYear++;
            }
        }
        return numLeapYear;
    }
    public static int dayOfWeek(int month, int day, int year){
        int firstDay = firstDayOfYear(year);
        int totalDays = dayOfYear(month,day,year) - 1;
        while(totalDays > 6)
            totalDays-= 7;

        int dayWeek = firstDay+totalDays;
        if(dayWeek>6)
            return dayWeek-7;
        else
            return dayWeek;
    }
}
