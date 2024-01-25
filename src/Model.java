import Data.Client;
import Data.Mashine;
import Data.WOrder;
import Data.WRecord;

import java.util.ArrayList;
import java.util.HashMap;

public class Model {
    public static ArrayList<WOrder> wo_List = new ArrayList<>();
    public static ArrayList<Mashine> mash_List = new ArrayList<>();
    public  static ArrayList<Client> cl_List = new ArrayList<>();
    public static HashMap wo_Map = new HashMap<>();

//    public Model() {
//
//    }

    /**
     * ТЕСТОВЫЙ!!!!
     * Создание начального массива данных
     */
    public static void testList() {
        Client client_1 = new Client(1,"Трест 15", "Минск", "Минина", "1", "",  "стройка");
        Client client_2 = new Client(2,"Гродножилстрой", "Гродно", "Индустриальная", "8", "",  "стройка");


        Mashine mash_1 = new Mashine(1,"CAT", "D5K XL", "WWW02158", 1);
        Mashine mash_2 = new Mashine(2,"CAT", "D6T", "PEZ00365", 2);
        Mashine mash_3 = new Mashine(3,"CAT", "428F", "LBH00996", 2);

        WOrder wo_1 = new WOrder(1, "03102023/1", 1, 12354, 1);
        WOrder wo_2 = new WOrder(2, "05102023/1", 2, 3678, 2);
        WOrder wo_3 = new WOrder(3, "05102023/2", 3, 5712, 2);

        System.out.println();
        System.out.println(wo_1);
        System.out.println(" -------> " + mash_1);
        System.out.println(" -------> " + client_1);
        wo_1.recordsList = new ArrayList<WRecord>();

        wo_1.recordsList.add(new WRecord(wo_1.getId(), "", "дорога", "22","12","2023",
                "06", "00", "06", "30", 28, ""));
        wo_1.recordsList.add(new WRecord(wo_1.getId(), "Минск", "работа", "22","12","2023",
                "06", "30", "16", "30", 0, "замена ТНВД"));
        wo_1.recordsList.add(new WRecord(wo_1.getId(), "", "дорога обратно", "22","12","2023",
                "16", "30", "17", "00", 28, ""));
        wo_1.printRecList();
    }


}
