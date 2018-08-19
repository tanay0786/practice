//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.DayOfWeek;
//import java.util.Calendar;
//import java.util.Date;
//
//public class DatePractice {
//
//	public static void main(String[] args) {
//		
//		
//		DateFormat dateformat = new SimpleDateFormat("MM dd yyyy"); //For priniting current date
//		Date date = new Date();
//		String date1 = dateformat.format(date);
//		System.out.println(date);
//		
//		Calendar c = Calendar.getInstance();   // For printing dates from monday to friday 
//		//System.out.println(c);
//		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//		DateFormat df = new SimpleDateFormat("MM dd yyyy");
//		for(int i=0;i<=4;i++){
//			System.out.println(df.format(c.getTime()));
//			c.add(Calendar.DATE, 1);
//		}
//		//for printing weekdays 
//		Calendar c = Calendar.getInstance(); 
//		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
//		for(int i=0;i<=10;i++){
//			System.out.println(df.format(c.getTime()));
//			int dayofweek = c.get(Calendar.DAY_OF_WEEK);
//		    if(dayofweek ==Calendar.FRIDAY){
//		    	c.add(Calendar.DATE, 3);
//		    }else if(dayofweek==Calendar.SATURDAY){
//		    	c.add(Calendar.DATE, 2);
//		    }else {
//		    	c.add(Calendar.DATE, 1);
//		    }
//			
//			
//	}
//		Calendar c = Calendar.getInstance();
//		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
//		Date date = new Date();
//		System.out.println(df.format(date));
//		
//		
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.DAY_OF_YEAR));
//		
//		
//
//	}
//
//}
