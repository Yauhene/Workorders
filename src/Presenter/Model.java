package Presenter;

import Data.*;

import java.io.*;
import java.util.*;

import static filesOperations.in_out.WO_to_File;

public class Model {
    //public static ArrayList<WOrder> wo_List = new ArrayList<>();
    public static ArrayList<Mashine> mash_List = new ArrayList<>();
    public static ArrayList<Client> cl_List = new ArrayList<>();
    private static HashMap<String, WOrder> map_WoByName = new HashMap<>();
    private static HashMap<Integer, WOrder> map_WoById = new HashMap<>();
    private static HashMap<Integer, ArrayList<WRecord>> map_RecordsByWo = new HashMap<>(); // ключ - id воркордера
    // значение - ArrayList с записями
    private static HashMap<String, ArrayList<WRecord>> map_RecordsByDate = new HashMap<>();
    private static woLinkList wo_MapList;

    public static woLinkList woList = new woLinkList();


    public Model() throws IOException {
        testList();
    }


    /**
     * ТЕСТОВЫЙ!!!!
     * Создание начального массива данных
     */
    public static void testList() throws IOException {
        System.out.println();
        System.out.println("****************************************************************");
        WO_from_File("src/Files/workorders.txt");
//        woLinkList.woDisplayList();
//        WOrder wo_0 = woLinkList.first.w_order;
//        wo_0.recordsList = WOrder.SortRecordsList(wo_0);

        Client client_1 = new Client(1, "Трест 15", "Минск", "Минина", "1", "", "стройка");
        Client client_2 = new Client(2, "Гродножилстрой", "Гродно", "Индустриальная", "8", "", "стройка");
        Client client_3 = new Client(3, "МАПИД", "Минск", "Глаголева", "37", "", "стройка");

        cl_List.add(client_1);
        cl_List.add(client_2);
        cl_List.add(client_3);
        System.out.println();
//        for (int i = 0; i <= cl_List.size() - 1; i++) {
//            System.out.println(cl_List.get(i));
//        }

        Mashine mash_1 = new Mashine(1, "CAT", "D5K XL", "WWW02158", 1);
//        WOrder wo_1 = new WOrder(1, "22122023/1", 1, 12354, 1, 0);
//
//        wo_1.recordsList = new ArrayList<WRecord>();
//
//        wo_1.recordsList.add(new WRecord(wo_1.getId(), "", "дорога", "22", "12", "2023",
//                "06", "00", "06", "30", 28, "дорога к клиенту"));
//        wo_1.recordsList.add(new WRecord(wo_1.getId(), "Минск", "работа", "22", "12", "2023",
//                "06", "30", "16", "30", 0, "замена ТНВД"));
//        wo_1.recordsList.add(new WRecord(wo_1.getId(), "", "дорога обратно", "22", "12", "2023",
//                "16", "30", "17", "00", 28, "дорога обратно"));
//        hashMapWoWork(wo_1);

        Mashine mash_2 = new Mashine(2, "CAT", "D6T", "PEZ00365", 2);
//        WOrder wo_4 = new WOrder(4, "23122023/1", 2, 3678, 2, 0);
//
//        wo_4.recordsList = new ArrayList<WRecord>();
//
//        wo_4.recordsList.add(new WRecord(wo_4.getId(), "", "дорога", "23", "12", "2023",
//                "06", "00", "06", "30", 28, "дорога к клиенту"));
//        wo_4.recordsList.add(new WRecord(wo_4.getId(), "Минск", "работа", "23", "12", "2023",
//                "06", "30", "16", "30", 0, "замена форсунок"));
//        wo_4.recordsList.add(new WRecord(wo_4.getId(), "", "дорога обратно", "23", "12", "2023",
//                "16", "30", "17", "00", 28, "дорога обратно"));
//
//        hashMapWoWork(wo_4);

        Mashine mash_3 = new Mashine(3, "CAT", "320D", "DHK00734", 3);
//        WOrder wo_3 = new WOrder(3, "24012024/2", 3, 0, 3, 0);
//
//        wo_3.recordsList = new ArrayList<WRecord>();
//
//        wo_3.recordsList.add(new WRecord(wo_3.getId(), "", "дорога", "24", "01", "2024",
//                "11", "00", "11", "30", 15, "дорога к клиенту"));
//        wo_3.recordsList.add(new WRecord(wo_3.getId(), "Минск", "работа", "24", "01", "2024",
//                "11", "30", "14", "00", 0, "Регулировка зазоров клапанов ГРМ"));
//        wo_3.recordsList.add(new WRecord(wo_3.getId(), "", "дорога обратно", "24", "01", "2024",
//                "14", "00", "14", "30", 28, "дорога обратно"));
//
//        hashMapWoWork(wo_3);
//
//        woList.insertLast(wo_1);
//        woList.insertLast(wo_4);
//        woList.insertLast(wo_3);

//        System.out.println("==========================================================");
        woLinkList.woDisplayList();
//        print_hasMapWoByName();
//        System.out.println("Погнали запишем....");
//        WOrder tempWO = woList.getLast().w_order;
//        for (int i = 0; i < woList.getLast().w_order.recordsList.size(); i++) {
//            System.out.println(woList.getLast().w_order.recordsList.get(i));
//        }
//        WOrder.sortRecordsList(tempWO.recordsList);
//        for (int i = 0; i < woList.getLast().w_order.recordsList.size(); i++) {
//            System.out.println(woList.getLast().w_order.recordsList.get(i));
//        }

        WO_to_File("src/Files/workorders_bak.txt");
    }

    /**
     * Размещение данных о воркордере в мапах
     */
    public static void hashMapWoWork(WOrder wo) {
        map_WoByName.put(wo.getWoName(), wo);
        map_WoById.put(wo.getId(), wo);
//        for (Map.Entry entry: map_WoByName.entrySet()) {
//            System.out.println("Название воркордера: " + entry.getKey() + ", указатель: " + entry.getValue());
//            if (entry.getKey().equals("23122023/1")) {
//                System.out.println("Bingoo!!! Это воркордер " + entry.getValue());
//            }
//        }
    }

    /**
     * Вывод в консоль мапы map_WoByName
     */
    public static void print_hasMapWoByName() {
        WOrder wo;
        for (Map.Entry entry : map_WoByName.entrySet()) {
            wo = (WOrder) entry.getValue();
            System.out.println("Название воркордера: " + entry.getKey() + ", указатель id: " + wo.getId());
        }
    }

    /**
     * Процедура чтения воркордеров из файла
     *
     * @param fileName
     */
    public static void WO_from_File(String fileName) {
        String tempStr = "";
        File file = new File(fileName);
//        WOrder wo;
        try {
            Scanner scanner = new Scanner(file);
            String tStr;
            while (scanner.hasNextLine()) {
                tStr = scanner.nextLine();
               String tempStrArr[] = tStr.split(";");
//
                // ----- Заполнение нового экземпляра WOrder данными работы
                int recCount = Integer.parseInt(tempStrArr[5]); // приводим к int количество записей работ в WO
                WOrder wo = new WOrder(Integer.parseInt(tempStrArr[0]),
                        tempStrArr[1],
                        Integer.parseInt(tempStrArr[2]),
                        Integer.parseInt(tempStrArr[3]),
                        Integer.parseInt(tempStrArr[4]),
                        recCount);
                WOrder.print_WOrder(wo);
                wo.recordsList = new ArrayList<WRecord>();
                // ----- Внесение записей о работах
                for (int i = 0; i < recCount; i++) {
                    String tRecStr = scanner.nextLine();
                    String tStrArr[] = tRecStr.split(";");
                    tempStr = tStrArr[0].trim();
//                    System.out.println("size = " + tStrArr.length);
                    tempStr = tempStr.substring(1);

//                    for (int j = 0; j < tStrArr.length; j++) {
//                        System.out.println("- "  + j + ": " + tStrArr[j]);
//                    }

                    int idd = Integer.parseInt(tempStr);
                    String wPlace = tStrArr[10].trim();
                    String wType = tStrArr[8].trim();
                    String wDday = tStrArr[1].trim();
                    String wDmonth = tStrArr[2].trim();
                    String wDyear = tStrArr[3].trim();
                    String wBegH = tStrArr[4].trim();
                    String wBegM = tStrArr[5].trim();
                    String wEndH = tStrArr[6].trim();
                    String wEndM = tStrArr[7].trim();
                    String descr = tStrArr[10].trim();
                    int dist = Integer.parseInt(tStrArr[11].trim());

                    wo.recordsList.add(new WRecord(idd, wPlace, wType, // id, wPlace, wType
                            wDday, wDmonth, wDyear, // дата
                            wBegH, wBegM, // время начала
                            wEndH, wEndM, // время завершения
                            dist, // расстояние
                            descr)); // описание
//                    wo.printRecList();
                }
//                wo.printRecList();
                WOrder.sortRecordsList(wo.recordsList);
                woList.insertLast(wo);

//                System.out.println("-----------------------------------------------------");
//                pause();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *  Процедура извлечения дня, месяца и года из строки формата "dd-mm-yyyy"
     * @param str строка формата "dd-mm-yyyy"
     * @return
     */
    public String[] dateSeparFromDate(String str) {
        String tempStrArr[] = str.split("-");
        return tempStrArr;
    }

    public static void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PRESS ANY KEY");
        String s = scanner.nextLine();
    }

}