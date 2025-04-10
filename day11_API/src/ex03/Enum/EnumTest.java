package ex03.Enum;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESEDAY, 
	THURSDAY, FRIDAY, SATURDAY
}

public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void telltLinkedItis() {
		
		switch (day) {
		case MONDAY: System.out.println("MONDAY"); break;
		case WEDNESEDAY: System.out.println("WEDNESEDAY"); break;
		case FRIDAY: System.out.println("FRIDAY yeaaa"); break;
		default: System.out.println("end"); break;
		
		} // switch end
	}
	
	
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.telltLinkedItis();
		
		EnumTest Day2 = new EnumTest(Day.WEDNESEDAY);
		Day2.telltLinkedItis();
		
		EnumTest Day3 = new EnumTest(Day.FRIDAY);
		Day3.telltLinkedItis();
		
		
	}
	
	
}
