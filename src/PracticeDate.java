import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PracticeDate {

	public static void main(String[] args) {
		
		
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
//		System.out.println(c);
		
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
	//	Date date = new Date();
	    String Date1 = df.format(c.getTime());
//	    
 System.out.println(Date1);
//	    
//	    for(int i=0;i<10;i++){
//	    	System.out.println(df.format(c.getTime()));
//	    	
//	    int day =c.get(Calendar.DAY_OF_WEEK); 
//	    
//	    if(day==Calendar.FRIDAY){
//	    	c.add(Calendar.DATE, 3);
//	    	}
//	    else if(day==Calendar.SATURDAY){
//	    	c.add(Calendar.DATE,2);}
//	    	else  {
//	    		c.add(Calendar.DATE,1);
//	    	}
//	    
//	    
//	    
//	    }
//	    
//	    
//	    
//		

	}

}
