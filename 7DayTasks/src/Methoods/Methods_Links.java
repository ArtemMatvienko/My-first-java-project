package Methoods;



public class Methods_Links {
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        User user = userFactory.create("John", "Snow");
        System.out.println(user.name + " " + user.surname);
    }

    static class User {
        String name, surname;

        User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
    }

    interface UserFactory {
        User create(String name, String surname);
    }
}
