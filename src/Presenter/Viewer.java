package Presenter;

import Data.*;

import java.util.*;

import static Data.WOrder.getBriefWOInfo;

public class Viewer {

    public static String mainMenu(woLinkList woList) {
        String result = "";
        boolean getOut = false; // флаг выхода из главного меню
        String respondString = ""; // строка-ответ
        Scanner scan = new Scanner(System.in);

        while (!getOut) {
            screenClear();
            listShow(Presenter.woListForPresenter, 7);
            System.out.println(bottomMainMenu());
            respondString = "";
            System.out.print("Ваш выбор: ");
//            Временная заглушка чтения из командной строки
//            respondString = scan.nextLine();
//            Отладочное значение для быстрого перехода к меню "Клиенты"
            respondString = "2";
                    switch (respondString) {
                case "1" : {
                    System.out.println("Меню воркордеров в разработке");
                    break;
                }
                case "2" : {
                    MenuClients.menu();
                    break;
                }
                case "3" : {
                    System.out.println("Меню машин в разработке");
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
//            Отладочное значение для быстрого выхода из меню"
            getOut = true;
        }



        return result;
    }

    /**
     * == Процедура вывода последних элементов списка
     * @param list - список woLinkList
     * @param num - количество выводимых элементов
     */
    public static void listShow(woLinkList list, int num) {
        System.out.println(WOrder.showHeaderForMenu());
//        int n = 0;
        int n = list.getElementsCount();
//        woLink element = list.last;
        woLink curr = list.last;
//        woLinkList.setCurrentElement(0);
        // Проверка на существование выводимого числа элементов в списке list
        if (num > n) {
            num = n;
        }
        // --- конец проверки
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        for ( int i = 1; i <= n; i++) {

            System.out.println(getBriefWOInfo(curr.w_order));
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            curr = curr.getPrev();
        }

    }
    /**
     * функция вывода нижнего меню
     * @return
     */
    public static String bottomMainMenu() {
        String outString = " ";
        System.out.println("=================================================================================================================================");
        outString += " Категории: \n" ;
        outString += " 0 - Выход; " + "1 - Воркордеры; " + "2 - Клиенты; " + "3 - Машины; ";


        return outString;
    }

    public static String bottomMenu(String category) {
        String offset = "      ";
        String outString = offset + category + "\n";
        outString += offset + "=================================================================================================================================";
        outString += "\n" ;
        outString += offset + "0 - Выход; " + "1 - Найти; " + "2 - Выбрать; " + "3 - Редактировать; " + "4 - Добавить; " + "5 - Удалить\n";
        return outString;

    }

    public static void screenClear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
