package aasignmen2;
import java.util.*;
public class a12dateformat {
	
		
		public static void main(String args[]) {
			 HashMap<String, String> d = new HashMap<String, String>();
			 HashMap<String, String> m = new HashMap<String, String>();
			 HashMap<String, String> y1 = new HashMap<String, String>();
			 HashMap<String, String> y2 = new HashMap<String, String>();
			 
			    d.put("01", "first");
				d.put("02", "second");
				d.put("03", "third");
				d.put("04", "fourth");
				d.put("05", "fifth");
				d.put("06", "sixth");
				d.put("07", "seventh");
				d.put("08", "eighth");
				d.put("09", "nineth");
				d.put("10", "tenth");
				d.put("11", "eleventh");
				d.put("12", "tweleveth");
				d.put("13", "thirteenth");
				d.put("14", "fourteenth");
				d.put("15", "fifteenth");
				d.put("16", "sixteenth");
				d.put("17", "seventeenth");
				d.put("18", "eighteenth");
				d.put("19", "nineteenth");
				d.put("20", "twenty");
				d.put("21", "twentyone");
				d.put("22", "twentytwo");
				d.put("23", "twentythree");
				d.put("24", "twentyfour");
				d.put("25", "twentfive");
				d.put("26", "twentysix");
				d.put("27", "twentysevent");
				d.put("28", "twentyeight");
				d.put("29", "twentynine");
				d.put("30", "thirty");
				d.put("31", "Thirty First");
				
				m.put("01", "Jan");
				m.put("02", "feb");
				m.put("03", "march");
				m.put("04", "april");
				m.put("05", "may");
				m.put("06", "june");
				m.put("07", "july");
				m.put("08", "august");
				m.put("09", "sept");
				m.put("10", "oct");
				m.put("11", "nov");
				m.put("12", "dec");

				y1.put("07", "seven");
				y1.put("08", "eight");
				y1.put("09", "nine");
				y1.put("10", "ten");
				y1.put("11", "eleven");
				y1.put("12", "tweleve");
				y1.put("13", "thirteen");
				y1.put("14", "fourteen");
				y1.put("15", "fifteen");
				y1.put("16", "sixteen");
				y1.put("17", "seventeen");
				y1.put("18", "eighteen");
				y1.put("19", "nineteen");
				y1.put("20", "twenty");
				y1.put("21", "twenty one");
				y1.put("22", "twenty two");

				y2.put("00", "hundred");
				y2.put("10", "ten");
				y2.put("20", "twenty");
				y2.put("30", "thirty");
				y2.put("40", "forty");
				y2.put("50", "fifty");
				y2.put("60", "sixty");
				y2.put("70", "seventy");
				y2.put("80", "eighty");
				y2.put("90", "ninety");
				System.out.println("size: "+d.size());
				Scanner sc=new Scanner(System.in);
				
				String date=sc.nextLine();
				String day=date.substring(0, 2);
				System.out.println(day);
				String month=date.substring(3, 5);
				System.out.println(month);
				String yearleft=date.substring(6, 8);
				System.out.println(yearleft);
				String yearright=date.substring(8, 10);
				int yr=Integer.parseInt(yearright);
				if(yr%10==0){
					System.out.println(d.get(day)+"  "+m.get(month)+"  "+y1.get(yearleft)+"  "+y2.get(yearright));
				}
				else{
					if(yr<=22){
						System.out.println(y1.get(yearright));
						System.out.println(d.get(day)+"  "+m.get(month)+"  "+y1.get(yearleft)+"  "+y1.get(yearright));
					}
					else {
						int r=yr%10;
						yr=yr-r;
						String rr= Integer.toString(r);
						String yrr= Integer.toString(yr);
						System.out.println(d.get(day)+"  "+m.get(month)+"  "+y1.get(yearleft)+"  "+y2.get(yrr)+"  "+y1.get(rr));
					}
					
				}
				
	}

		
}
