package Presenter;

import Data.*;

import java.util.*;

public class Model {
    //public static ArrayList<WOrder> wo_List = new ArrayList<>();
    public static ArrayList<Mashine> mash_List = new ArrayList<>();
    public  static ArrayList<Client> cl_List = new ArrayList<>();
    private static HashMap wo_Map = new HashMap<>();
    private static woLinkList wo_List;

    private woLinkList woList = new woLinkList();


    public Model() {
        testList();
    }



    /**
     * ТЕСТОВЫЙ!!!!
     * Создание начального массива данных
     */
    public static void testList() {
        Client client_1 = new Client(1,"Трест 15", "Минск", "Минина", "1", "",  "стройка");
        Client client_2 = new Client(2,"Гродножилстрой", "Гродно", "Индустриальная", "8", "",  "стройка");
        Client client_3 = new Client(3,"МАПИД", "Минск", "Глаголева", "37", "",  "стройка");

        cl_List.add(client_1);
        cl_List.add(client_2);
        cl_List.add(client_3);
        System.out.println();
        for (int i = 0; i <= cl_List.size() - 1; i++) {
            System.out.println(cl_List.get(i));
        }
//        System.out.println(cl_List);

        Mashine mash_1 = new Mashine(1,"CAT", "D5K XL", "WWW02158", 1);
        WOrder wo_1 = new WOrder(1, "22122023/1", 1, 12354, 1);

        wo_1.recordsList = new ArrayList<WRecord>();

        wo_1.recordsList.add(new WRecord(wo_1.getId(), "", "дорога", "22","12","2023",
                "06", "00", "06", "30", 28, ""));
        wo_1.recordsList.add(new WRecord(wo_1.getId(), "Минск", "работа", "22","12","2023",
                "06", "30", "16", "30", 0, "замена ТНВД"));
        wo_1.recordsList.add(new WRecord(wo_1.getId(), "", "дорога обратно", "22","12","2023",
                "16", "30", "17", "00", 28, ""));

        Mashine mash_2 = new Mashine(2,"CAT", "D6T", "PEZ00365", 2);
        WOrder wo_2 = new WOrder(2, "23122023/1", 2, 3678, 2);

        wo_2.recordsList = new ArrayList<WRecord>();

        wo_2.recordsList.add(new WRecord(wo_2.getId(), "", "дорога", "23","12","2023",
                "06", "00", "06", "30", 28, ""));
        wo_2.recordsList.add(new WRecord(wo_2.getId(), "Минск", "работа", "23","12","2023",
                "06", "30", "16", "30", 0, "замена форсунок"));
        wo_2.recordsList.add(new WRecord(wo_2.getId(), "", "дорога обратно", "23","12","2023",
                "16", "30", "17", "00", 28, ""));

        Mashine mash_3 = new Mashine(3,"CAT", "320D", "DHK00734", 3);
        WOrder wo_3 = new WOrder(3, "24012024/2", 3, 0, 3);

        wo_3.recordsList = new ArrayList<WRecord>();

        wo_3.recordsList.add(new WRecord(wo_3.getId(), "", "дорога", "24","01","2024",
                "11", "00", "11", "30", 15, ""));
        wo_3.recordsList.add(new WRecord(wo_3.getId(), "Минск", "работа", "24","01","2024",
                "11", "30", "14", "00", 0, "Регулировка зазоров клапанов ГРМ"));
        wo_3.recordsList.add(new WRecord(wo_3.getId(), "", "дорога обратно", "24","01","2024",
                "14", "00", "14", "30", 28, ""));


//        System.out.println();
//        System.out.println("//////" + wo_1);
//        System.out.println(" -------> " + mash_1);
//        System.out.println(" -------> " + client_1);
//        WOrder.print_WOrder(wo_1);
//
//        System.out.println();
//        System.out.println("//////" + wo_2);
//        System.out.println(" -------> " + mash_2);
//        System.out.println(" -------> " + client_2);
//        WOrder.print_WOrder(wo_2);
//
//        System.out.println();
//        System.out.println("//////" + wo_3);
//        System.out.println(" -------> " + mash_3);
//        System.out.println(" -------> " + client_3);
//        WOrder.print_WOrder(wo_3);

        woLinkList.insertLast(wo_1);
        woLinkList.insertLast(wo_2);
        woLinkList.insertLast(wo_3);

        System.out.println("==========================================================");
        woLinkList.woDisplayList();

    }


}
