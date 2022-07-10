package supermark;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validar_mail {

    public static void main(String[] args) {                                                                      
 
       Scanner sc = new Scanner(System.in);
       String email;
       System.out.print("Introduce email: ");
       email = sc.nextLine();
       Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");   
       Matcher mat = pat.matcher(email);
       if(mat.find()){
          System.out.println("Correo Válido");
       }else{
          System.out.println("Correo No Válido");
     }
   }
}