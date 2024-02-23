package Presenter;

import Data.*;

import java.util.*;

import static Presenter.Viewer.*;

public class MenuClients {

    public static void menu() {
        String result = "";
        boolean getOut = false; // флаг выхода из главного меню
        String respondString = ""; // строка-ответ
        Scanner scan = new Scanner(System.in);
//        listShow(Presenter.woListForPresenter, 7);
//        showHeaderForMenu();   !!! Уйдет в clientsListShow
        clientsListShow(Client.getClients_mapById());

        System.out.println(bottomMenu("Клиенты"));
        while (!getOut) {
            respondString = "";
            System.out.print("Ваш выбор: ");
            respondString = scan.nextLine();
            switch (respondString) {
                case "1" : {
                    System.out.println("Меню Найти в разработке");
                    break;
                }
                case "2" : {
                    System.out.println("Меню Выбрать в разработке");
                    break;
                }
                case "3" : {
                    System.out.println("Меню Редактировать в разработке");
                    break;
                }
                case "4" : {
                    System.out.println("Меню Добавить в разработке");
                    break;
                }
                case "5" : {
                    System.out.println("Меню Удалить в разработке");
                    break;
                }
                case "0", "" : {
                    System.out.println("Пока-пока! ---------------------------------------------------");
                    getOut = true;
                    break;
                }
                default: {
                    System.out.println("Ввод неверный, попробуйте еще раз");
                    break;
                }
            }

        }

//        return result;
    }

    public static void clientsListShow(HashMap<Integer, Client> map ){
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry);
        }

    }

//    public static void clientsListShow(Client.getClients_mapById()) {
//
//    }
}
