/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimirdata;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
/**
 *
 * @author jcarl
 */
public class Data {
    public static void main (String [] args )throws ParseException {
       Calendar calendario = Calendar.getInstance();
       Date data = calendario.getTime();
        
       Locale br= new Locale("pt","BR");
       Locale eua = Locale.ENGLISH;
        
       DateFormat test1 = DateFormat.getDateInstance(DateFormat.FULL, br);
       System.out.println("Data Brasil: " + test1.format(data));       

       DateFormat test2 = DateFormat.getDateInstance(DateFormat.FULL, eua);
       System.out.println("Data EUA: " + test2.format(data));

       DateFormat test3 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, br);
       System.out.println("Data Brasil: " + test3.format(data));

       DateFormat test4 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, eua);
       System.out.println("Data EUA: " + test4.format(data));

       DateFormat test5 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, br);
       System.out.println("Data Brasil: " + test5.format(data));

       DateFormat test6 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, eua);
       System.out.println("Data EUA: " + test6.format(data));

       DateFormat test7 = DateFormat.getDateInstance(DateFormat.SHORT, br);
       System.out.println("Data Brasil: " + test7.format(data));

       DateFormat test8 = DateFormat.getDateInstance(DateFormat.SHORT, eua);
       System.out.println("Data EUA: " + test8.format(data));
        
    }    
}
