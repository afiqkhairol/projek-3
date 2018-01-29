import java.util.*;
public class Darap_sifir {
  public static void main (String[] args){
       int w;
       int  z;
       int  y;
       
    Scanner input = new Scanner (System.in);
      
       System.out.print("Taipkan sifir berapa yang anda nak: ");
       z=input.nextInt();      
       for(w=1; w<=12; w++){
           y=w*z;
        System.out.println(w+"X"+z+"="+y); 
        }
        System.out.print("Terus");
        jawapan = input.nextLine();
    } while(w<=12);
}