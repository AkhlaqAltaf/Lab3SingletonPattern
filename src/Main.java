import javax.naming.AuthenticationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
commands();
    }

    static  void commands (){

        System.out.println("If You want to login    Enter  0 :");
        System.out.println("If You want to register Enter  1 :");

        Scanner scanner=Authentication.getScanner();

        int command = scanner.nextInt();

        if(command == 0){
            boolean isUser = Authentication.isUser();

            if(isUser==true){
                User user = Authentication.getCurrentUser();

                System.out.println("User is Authenticated ");

                System.out.println("User Email    : "+user.email);


            }

            else {
                System.out.println("User Not Register Yet..");

            }


        }
        if (command ==1){

            Authentication.registerUser();

        }
        commands();

    }
}