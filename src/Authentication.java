import java.util.Scanner;

public class Authentication {

    private static  Authentication authentication;
    private static  Scanner scanner ;
    private String username;
    private String password;
   private static Record record;


    private Authentication(String username , String password){

              this.username = username;
              this.password =password;


    }

    public  static Authentication registerUser(){
        record = Record.getRecord();
        if (authentication ==null){
            System.out.println("Enter User Name : ");
            String username = getScanner().nextLine();
            getScanner().nextLine();
            System.out.println("Enter Password  : ");
            String password = getScanner().nextLine();
            System.out.println("Enter User Email : ");
            String email = getScanner().nextLine();



            Record.setRecord(username , password , email);

            authentication = new Authentication(username , password);

            return  authentication;

        }

        else {

            return authentication;
        }

    }
    public static  User login(){
        System.out.println("Enter User Name : ");
        String username = getScanner().nextLine();
        getScanner().nextLine();
        System.out.println("Enter Password  : ");
        String password = getScanner().nextLine();

        boolean authenticated =Record.isUser(username , password);
       if(authenticated){
           return Record.getCurrectUser();
       }

       else{

           System.out.println("This User is Not Register");
           return null;
       }




    }

    public static  Scanner getScanner (){
        if(scanner == null){
            scanner = new Scanner(System.in);
            return  scanner;

        }

        else{
            return  scanner;
        }


    }
    public static User getCurrentUser(){

        return Record.getCurrectUser();
    }

    public static boolean isUser(){
        System.out.println("Enter User Name : ");
        String username = getScanner().nextLine();
        getScanner().nextLine();
        System.out.println("Enter Password  : ");
        String password = getScanner().nextLine();
        return Record.isUser(username , password);
    }
}
