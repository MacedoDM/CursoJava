package CalendarioPOO;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        Data d = new Data();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //Date date1 = sdf.parse("24-08-2022");
        //Date date2 = sdf.parse("10-10-2022");
        
        System.out.println("Insira aqui a primeira data:");
        System.out.print("Formato yyyy-MM-dd: ");
        d.setData1(s.next());
        System.out.println("Insira aqui a segunda data:");
        System.out.print("Formato yyyy-MM-dd: ");
        d.setData2(s.next());
        
        Date d1 = sdf.parse(d.getData1());
        Date d2 = sdf.parse(d.getData2());
        
        //System.out.println(d1);
        //System.out.println(d2);
        
        int result = d1.compareTo(d2);
        System.out.println("Result: " + result);
        
        if (result == 0) {
            System.out.println("Date1 is equal to Date2");
        } else if (result > 0) {
            System.out.println("Date1 is after Date2");
        } else if (result < 0) {
            System.out.println("Date1 is before Date2");
        }
        
         System.out.println("the day of the week is: " + d1.getDay());
         
         if(d1.getDay() == 0)
         {
             System.out.println("The day of the week is sunday!");
         } else if (d1.getDay() == 1)
         {
             System.out.println("The day of the week is monday!");
         } else if (d1.getDay() == 2)
         {
             System.out.println("The day of the week is tuesday!");
         } else if (d1.getDay() == 3)
         {
             System.out.println("The day of the week is wednesday!");
         } else if (d1.getDay() == 4)
         {
             System.out.println("The day of the week is thursday!");
         } else if (d1.getDay() == 5)
         {
             System.out.println("The day of the week is friday!");
         } else if (d1.getDay() == 6)
         {
             System.out.println("The day of the week is saturday!");
         }
         
         System.out.println("The month of the date is: " + d1.getMonth());
         
         if(d1.getMonth() == 0)
         {
             System.out.println("The month of the date is January");
         } else if (d1.getMonth() == 1)
         {
             System.out.println("The month of the date is February");
         } else if (d1.getMonth() == 2)
         {
             System.out.println("The month of the date is March");
         } else if (d1.getMonth() == 3)
         {
             System.out.println("The month of the date is April");
         } else if (d1.getMonth() == 4)
         {
             System.out.println("The month of the date is May");
         } else if (d1.getMonth() == 5)
         {
             System.out.println("The month of the date is June");
         } else if (d1.getMonth() == 6)
         {
             System.out.println("The month of the date is July");
         } else if (d1.getMonth() == 7)
         {
             System.out.println("The month of the date is August");
         } else if (d1.getMonth() == 8)
         {
             System.out.println("The month of the date is September");
         } else if (d1.getMonth() == 9)
         {
             System.out.println("The month of the date is October");
         } else if (d1.getMonth() == 10)
         {
             System.out.println("The month of the date is November");
         } else if (d1.getMonth() == 11)
         {
             System.out.println("The month of the date is December");
         }
         
         
    }
}
