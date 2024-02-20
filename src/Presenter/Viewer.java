package Presenter;

import Data.*;

import static Data.WOrder.getBriefWOInfo;

public class Viewer {

    public int mainMenu() {
        int result = 0;
        listShow(Presenter.woListForPresenter, 10);



        return result;
    }

    /**
     * == Процедура вывода последних элементов списка
     * @param list - список woLinkList
     * @param num - количество выводимых элементов
     */
    public void listShow(woLinkList list, int num) {
//        int n = 0;
        int n = list.getElementsCount();
//        woLink element = list.last;
        woLink curr = list.last;
        // Проверка на существование выводимого числа элементов в списке list
        if (num > n) {
            num = n;
        }
        // --- конец проверки
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for ( int i = 1; i <= n; i++) {

            System.out.println(getBriefWOInfo(curr.w_order));
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            curr = curr.getPrev();
        }

    }

    /** == Функция вывода "шапки" списка воркордеров
     *
     * @return
     */
    public String showHeaderForMenu(WOrder wo) {
//        return String.format("WO id: %d, %s, %s, %s, %s, %s, %s", %d, %s ",
//        idWO, wPlace, wType, wDate, wBegin, wEnd, wDuration, wDistance, wDescription);
//        return String.format("|   %-5d | %s-%s-%s |  %s:%s | %s:%s  |  %5s   | %-15s   | %-18s | %-3s | %s",
//                wo.getId(),
//                wo.recordsList.get(0).getwDateDay(), wo.recordsList.get(0).getwDateMonth(),  wo.recordsList.get(0).getwDateYear(),
//                wBeginHours, wBeginMinutes, wEndHours, wEndMinutes,  wDuration, wPlace,  wType, wDistance, wDescription);
        return "";
    }
}
