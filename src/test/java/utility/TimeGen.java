package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.reporters.jq.Main;

public class TimeGen {
public String getTime() {
DateTimeFormatter df =DateTimeFormatter.ofPattern("dd MM mm");
LocalDateTime now = LocalDateTime.now();
String timeValue = df.format(now);
String value = timeValue.replace(" ","");
return value;
}
public static void main(String[] args) {
	TimeGen g = new TimeGen();
	String time = g.getTime();
	System.out.println(time);
	
}
}
