package usersFromTine.after;

public class TestUser {

    public static void main(String[] args) {
        System.out.println("hello");
        User user = new User("peter", "1234");
        PremiumUser premiumUser = new PremiumUser("Arboe", "4321");
        AdminUser adminUser = new AdminUser("Fie", "1221");
        user.generateNewPassword();
        System.out.println(user.getPassword());
        System.out.println(premiumUser.generateNewPassword());
        System.out.println(adminUser.generateNewPassword());
    }
}
