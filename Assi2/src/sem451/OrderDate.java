package sem451;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
 
public class OrderDate {
 Scanner input =new Scanner(System.in);
 
 private LocalDate l = null ;
	
	public void DATE() {

	   try {l=LocalDate.parse(input.next());}
	  
	   catch(DateTimeParseException e) {
			System.out.println("Error,Wtite The Date From Year To Day Like This : (2023-09-18) ");
			l=LocalDate.parse(input.next());
			}
         }
	public LocalDate getDate() {
		return l;
	}
	public void setDate(LocalDate l) {
		this.l = l;
	}
  }
