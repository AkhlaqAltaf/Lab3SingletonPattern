import java.util.ArrayList;
import java.util.Objects;

public class Record {

    private static  Record record;
    private static  User currecntUser;

    private static  ArrayList<User> users = new ArrayList<User>();


    private Record(){

        System.out.println("Record Object Created Now You Can Record Data Here : ");



    }

    public static Record getRecord(){

        if (record == null){

            record = new Record();
            return  record;

        }
        else{

            return record;
        }

    }

    public static  boolean isUser(String username , String password){

        for (int i =0 ; i<users.size() ; i++){

            if(users.get(i).username.equals(username)){
                if(users.get(i).password.equals(password)){
                    currecntUser = users.get(i);
                    return true;
                }

            }


        }
        return false;





    }

    public static void setRecord(String username , String password,String email ){

        User user = new User(username , password,email);
        users.add(user);
    }

    public static  User getCurrectUser(){

        if(currecntUser == null){

            System.out.println("No One Login Yet");
            return  currecntUser;
        }
        else{
            return currecntUser;
        }

    }

}



