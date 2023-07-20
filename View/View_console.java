package View;

import Presenter.App;

import java.util.Scanner;

public class View_console {
    protected App app;
    public View_console(){
        this.app = new App();
    }
    public void run(){
        Boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag){
            System.out.println("Введите команду:\n"+
                    "1. Добавить игрушку\n" +
                    "2. Розыгрыш\n" +
                    "3. Получить игрушку\n" +
                    "0. Выйти");
            System.out.print("Команда: ");
            String in = sc.nextLine();
            switch (in){
                case "1":
                    System.out.println("Выберите игрушку:\n"+
                            "1. Добавить машинку\n" +
                            "2. Добавить куклу\n" +
                            "3. Добавить мишку\n" +
                            "0. Выйти");
                    System.out.print("Команда: ");
                    in = sc.nextLine();
                    switch (in) {
                        case "1":
                            app.addCar();
                            System.out.println("Машинка добавлена");
                            break;
                        case "2":
                            app.addDoll();
                            System.out.println("Кукла добавлена");
                            break;
                        case "3":
                            app.addBear();
                            System.out.println("Мишка добавлена");
                            break;
                        case "0":
                            break;
                    }
                    break;
                case "2":
                    app.Draw();
                    System.out.println("Розыгрыш");
                    break;
                case "3":
                    app.Prize();
                    System.out.println("Приз выдан");
                    break;
                case "0":
                    flag = false;
                    break;
            }
        }
    }
}
