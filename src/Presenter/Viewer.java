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
        System.out.println(WOrder.showHeaderForMenu());
//        int n = 0;
        int n = list.getElementsCount();
//        woLink element = list.last;
        woLink curr = list.last;
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


}
