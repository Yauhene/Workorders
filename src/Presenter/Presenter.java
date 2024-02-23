package Presenter;

//import.Service.Model;

import Data.*;

import java.io.*;

public class Presenter {
    public static woLinkList woListForPresenter;

    public Presenter() throws IOException {
        String command = "";
        Model ModelList = new Model();
        woListForPresenter = ModelList.getWoList();

        Viewer viewer = new Viewer();


        while (!command.equals("exit")) {
            command = getMenuAnswer(woListForPresenter);
            command = "exit";
        }

    }
    public static String getMenuAnswer(woLinkList woList) {
        String result = Viewer.mainMenu(woList);
        return result;
    }

    /**
     * функция вывода нижнего меню
     * @return
     */
    public static String bootomMenu() {
        String outString = "";
        System.out.println("=================================================================================================================================");жж
        outString += " 0 - Выход; " +
                "1 - Добавить; " +
                "2 - Редактировать; " +
                "3 - Удалить; " +
                "4 - Найти; ";

        return outString;
    }
}
