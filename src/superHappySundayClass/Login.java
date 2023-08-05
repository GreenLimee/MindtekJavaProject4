package src.superHappySundayClass;

public class Login {

    public String loginMethod (String userName, String password){
        String expectedUserName = "mindtek@gmail.com";
        String expectedPassword = "SmartStudents";

        if(expectedUserName.equalsIgnoreCase(userName)&&expectedPassword.equals(password)){
            return "Welcome to the Home page!";
        }
        return "Incorrect username or password. Please, try again ... ";
    }



}
