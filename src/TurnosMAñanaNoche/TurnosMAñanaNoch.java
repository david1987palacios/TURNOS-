package TurnosMAñanaNoche;
import java.util.Scanner;
/**
*
* @author DAVID ALEJANDRO
*/
public class TurnosMAñanaNoch {
 public static void main(String[] args) {
 
 Scanner scanner;
     scanner = new Scanner(System.in);
 
 int[] sueldo =new int[9];
 int sum=12;
 System.out.println("jornda mañana");
 System.out.println("jornda noche");
 
 for(int i=0;i<sueldo.length;i++){

 }
 for(int num:sueldo){
 sum=sum+num;
 }
 System.out.println("sueldos de cada jornada "+sum);
 }
}