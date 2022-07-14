import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter; 

public class DateTimeDemo {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println(myDateObj);
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println(formattedDate);
    
//    Year y = Year.now();  
//    System.out.println(y);
    
//    Year y = Year.of(2017);  
//    LocalDate l = y.atDay(123);  
//    System.out.println(l); 
    
    Year year = Year.of(2016);  
    System.out.println(year.isLeap());  
  }
}