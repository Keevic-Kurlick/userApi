package ru.netology.user;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.setName("Иван");
        post.setPatronymic("Иванович");
        post.setSurname("Иванов");
        post.setBirthday(13, 6, 1999);
        post.setPassport(4444, 4444444);
        post.setPhone(7, 999, 9999999);
        post.setSubscription(true);

        post.printPost();

        System.out.println();

        Post post1 = new Post("Petr", "Petrovich",
                "Petrov", 4545, 454544,
                7, 987, 2223322,
                10, 8, 1988, true);

        post1.printPost();
    }
}
