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
                    "4. Изменить шансы\n" +
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
                            System.out.println("Мишка добавлен");
                            break;
                        case "0":
                            break;
                    }
                    break;
                case "2":
                    try {
                        app.Draw();
                        System.out.println("Розыгрыш");
                    }
                    catch (Exception e){
                        System.out.println("Игрушек больше нет");
                    }
                    break;
                case "3":
                    try {
                        System.out.println("Приз: " + app.Prize().toString() + " выдан");
                    }
                    catch (Exception e){
                        System.out.println("Все призы выданы");
                    }
                    break;
                case "4":
                    System.out.println("Выберите игрушку:\n"+
                            "1. Изменить шанс машинки\n" +
                            "2. Изменить шанс куклы\n" +
                            "3. Изменить шанс мишки\n" +
                            "0. Выйти");
                    System.out.print("Команда: ");
                    in = sc.nextLine();
                    System.out.print("Введите новый шанс: ");
                    double d = 0.5;
                    try {
                        d = Double.parseDouble(sc.nextLine());
                    }
                    catch (Exception e){
                        System.out.println("Данные некорректны");
                        break;
                    }
                    switch (in) {
                        case "1":
                            app.chanceCar(d);
                            System.out.println("Шанс: " + d);
                            break;
                        case "2":
                            app.chanceDoll(d);
                            System.out.println("Шанс: " + d);
                            break;
                        case "3":
                            app.chanceBear(d);
                            System.out.println("Шанс: " + d);
                            break;
                        case "0":
                            break;
                    }
                    break;
                case "0":
                    flag = false;
                    break;
            }
        }
    }
}
