
public class Human {
	
 public String name;
 public int grnPerHour;
 public Human(String humanName, int humanGrnPerHour) 
 {
  Human s;	 
  name = humanName;
  grnPerHour = humanGrnPerHour;
 }
 
 public void walk() 
 {
  System.out.println(name + " walks");
 }
 
 public String goToTheWork(int hoursAmount) 
 {
  return name + " earned " + (grnPerHour * hoursAmount) + " grn home";
 }
}