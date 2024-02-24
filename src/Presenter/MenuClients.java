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


        System.out.println(bottomMenu("Клиенты"));
        while (!getOut) {
            Viewer.screenClear();
            clientsListShow(Client.getClients_mapById());
            System.out.println(bottomMenu("Опции работы с клиентами:"));
            respondString = "";
            System.out.print("Ваш выбор: ");
//            Временная заглушка чтения ответадля автоматического выхода
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
//                    System.out.println("Пока-пока! ---------------------------------------------------");
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
        String resultString = "";
        Client client;
        int currClient = 0;
        ArrayList<Client> clArray = new ArrayList<>();
        for ( Map.Entry entry: map.entrySet()) {
            client = (Client) entry.getValue();
            clArray.add(client);
        }
        int showSize = 10; // количество выводимых клиентов
        if (showSize > clArray.size()) { showSize = clArray.size();} // переопределение на случай если элементов массива меньше десяти
        for (int i = 0; i < showSize; i++) {
            if (i != currClient) { resultString += "     ";}
            else { resultString += ">>>>>"; }
            resultString += " |      " + clArray.get(i).getId(); // id
            resultString += String.format("| %-21s", clArray.get(i).getName()); // name
            resultString += String.format("| %-17s", clArray.get(i).getLocPlace()); // place
            resultString += String.format("| %-21s ", clArray.get(i).getLocStreet()); // street
            resultString += String.format("| %-8s ", clArray.get(i).getLocBuilding()); // building
            resultString += " |  " + clArray.get(i).getLocOffice(); // office
            resultString += " |  " + clArray.get(i).getcType() + "\n"; // type
//
        }
        System.out.println(showHeaderForClientMenu());
        System.out.println(resultString);
    }

    public static String showHeaderForClientMenu() {
        String offset = "      ";
        String resultString = offset + "Список клиентов:\n";
        resultString += offset;
        resultString += "=================================================================================================================================\n";
        resultString += offset;
        resultString += "|  id   "; // Добавляем id клиента
        resultString += String.format("| %-20s ", "Название"); // Добавляем иия клиента
        resultString += "|  Нас.пункт       "; // Добавляем расположение клиента
        resultString += String.format("| %-21s ", "Улица");// Добавляем улицу
        resultString += "| Дом/корп. "; // Добавляем номер дома
        resultString += String.format("|%-4s", "Офис"); // Добавляем офис клиента
        resultString += String.format("| %-15s", "Тип") + "\n"; // Добавляем тип клиента
        resultString += offset;
        resultString += "=================================================================================================================================";

        return resultString;
    }
}
