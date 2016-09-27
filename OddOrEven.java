
/**
 * Write a description of class OddOrEven here.
 * 
 * @author (your name) 
 * (╯°□°）╯︵ ┻━┻
 * ┬──┬ ノ( ゜-゜ノ)
 */
import java.util.Scanner;
public class OddOrEven
{ public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int number;
        
        System.out.println("Please input one number if you dont ill flip the tabel (╯°□°）╯︵ ┻━┻ !");
        
       number = reader.nextInt();
        
       if (number % 2 == 0 ) { 
           System.out.println("Your number is Even. Ill fix the tabel ┬──┬ ノ( ゜-゜ノ)");
       
    }
    else  {
        System.out.println("Your number is Odd. The table stays where it is ┻━┻"); 
        
    }
}
}
