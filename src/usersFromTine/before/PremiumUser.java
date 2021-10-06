package usersFromTine.before;

import java.util.Random;

public class PremiumUser {
    private String username;
    private String password;

    public PremiumUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword(){
        Random r = new Random();
        String newPassword = "";
        for(int i = 0 ; 20 > i ; i++){
            char c = 'a';
            c += r.nextInt(40);
            newPassword = newPassword.concat(String.valueOf(c));
        }
        this.password = newPassword;
        return newPassword;
    }

}