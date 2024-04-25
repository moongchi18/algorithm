import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate ld = LocalDate.of(2016, a, b);
        System.out.println(ld.getDayOfWeek());
        return CustomDayOfWeek.toCustomDayOfWeek(ld.getDayOfWeek());
    }

	enum CustomDayOfWeek{
		SUN("SUNDAY"),
		MON("MONDAY"),
		TUE("TUESDAY"),
		WED("WEDNESDAY"),
		THU("THURSDAY"),
		FRI("FRIDAY"),
		SAT("SATURDAY");
		
		String dayOfWeek;
		CustomDayOfWeek(String dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
		}
		
		public static String toCustomDayOfWeek(DayOfWeek dayOfWeek) {
			String result = "";
			for (CustomDayOfWeek cdow : CustomDayOfWeek.values()) {
				if(cdow.dayOfWeek == dayOfWeek.name()) {
					result = cdow.name();
				} 
			}
			return result;
		}
	}
}