package Auth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppRegAuth authModule = new AppRegAuth();
        String userLogin;
        String userPassword;
        System.out.println("Добро пожаловать! Пожалуйста, выберите одну из опций: ");
        while (true) {
            System.out.println("1) Авторизация");
            System.out.println("2) Регистрация");
            Scanner sc = new Scanner(System.in);
            String userChoice = sc.nextLine();
            switch (userChoice) {
                case "1":
                    System.out.println("Пожалуйста, введите данные для авторизации!");
                    System.out.print("Логин: ");
                    userLogin = sc.nextLine();
                    System.out.print("Пароль: ");
                    userPassword = sc.nextLine();

                    if (authModule.AuthUser(userLogin, userPassword) != null) {
                        System.out.printf("Добро пожаловать, %s", userLogin);
                        System.exit(0);
                    }
                    else {
                        System.out.println("Данные не валидны! Пожалуйста, попробуйте ещё раз!");
                        continue;
                    }

                    break;
                case "2":
                    System.out.println("Пожалуйста, введите данные для регистрации!");
                    System.out.print("Логин: ");
                    userLogin = sc.nextLine();
                    System.out.print("Пароль: ");
                    userPassword = sc.nextLine();

                    if (authModule.RegisterUser(userLogin, userPassword) != null) {
                        System.out.println("Пользователь успешно зарегистрирован!");
                    }
                    else {
                        System.out.println("Данный пользователь уже существует!");
                    }
            }
        }
    }
}
