package Data;

import java.util.*;

import static Data.Client.getClients_mapById;
import static java.lang.Integer.parseInt;


public class WOrder {
    private static int index=0;
    private static int maxId;
    private int id;
    private String woName;
    private int idMash;
    private int hoursMash;
    private int idClient;
    private int countOfRecords; // количество строк-записей работ в воркордере


    private String workPlace;
    public ArrayList<WRecord> recordsList;

    public WOrder (int id, String woName, int idMash, int hoursMash, int idClient, int countOfRecords) {
        this.id = id;
        this.woName = woName;
        this.idMash = idMash;
        this.hoursMash = hoursMash;
        this.idClient = idClient;
        this.countOfRecords = 0;
        recordsList = new ArrayList<WRecord>();
        if (maxId < this.id) maxId = this.id;
    }


    /**
     * Метод возвращает id наряд-заказа
     * @return
     */

    public int getId() {
        return this.id;
    }

    /**
     * Метод вывода записей работ
     */
    public void printRecList() {
        for (WRecord i: recordsList) {
            System.out.println(i);
        }
    }

    public static void printTestRecList(ArrayList<WRecord> rec) {
            int counter = 0;
        for (int i = 0; i < rec.size(); i++) {
            System.out.println(counter + "-  " + "id: " + rec.get(i).getIdWO());
            counter++;
            System.out.println(counter + "-  " + "day: " + rec.get(i).getwDateDay());
            counter++;
            System.out.println(counter + "-  " + "month: " + rec.get(i).getwDateMonth());
            counter++;
            System.out.println(counter + "-  " + "year: " + rec.get(i).getwDateYear());
            counter++;
            System.out.println(counter + "-  " + "bH: " + rec.get(i).getwBeginHours());
            counter++;
            System.out.println(counter + "-  " + "bM: " + rec.get(i).getwBeginMinutes());
            counter++;
            System.out.println(counter + "-  " + "eH: " + rec.get(i).getwEndHours());
            counter++;
            System.out.println(counter + "-  " + "eM: " + rec.get(i).getwEndMinutes());
            counter++;
            System.out.println(counter + "-  " + "type: " + rec.get(i).getwType());
            counter++;
            System.out.println(counter + "-  " + "place: " + rec.get(i).getwPlace());
            counter++;
            System.out.println(counter + "-  " + "descr: " + rec.get(i).getwDescription());
            counter++;
            System.out.println(counter+ "-  " + "dist: " + rec.get(i).getwDistance());
            counter++;
            System.out.println("-  " + "----------------------------------------");

            counter = 0;

        }
    }

    public static void print_WOrder(WOrder wo) {
        System.out.println(wo.toString());
        wo.printRecList();
    }

    /**
     * == Процедура слртировки записей воркордера в порядке убывания времени записи
     * @param rList - список записей воркордера
     */
    public static void sortRecordsList(ArrayList rList) {
//        System.out.println("Погнали сортировать");
        int flag;
        int recCount = rList.size();
        boolean earler;
        WRecord tempRec;
        ArrayList<WRecord> tempArr = rList;

        for (int r = 1; r < recCount; r++) {
            flag = r;
            while ((flag > 0 && aEarlierB(tempArr.get(flag), tempArr.get(flag - 1)))) {
                tempRec = tempArr.get(flag);
                tempArr.set(flag, tempArr.get(flag - 1));
                tempArr.set((flag - 1), tempRec);
                flag--;
            }
        }
        rList = tempArr;
//        for (int i = 0; i < rList.size(); i++) {
//            System.out.println(rList.get(i));
//        }
    }

    @Override
    public String toString() {
            return String.format("Workorder id %d: Номер работы: %s, код машины: %d, моточасов: %d, код клиента: %d",
                    id, woName,  idMash, hoursMash, idClient);
    }


    public String getWoName() {
        return woName;
    }

    public int getIdMash() {
        return idMash;
    }

    public int getHoursMash() {
        return hoursMash;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getCountOfRecords() {
        return countOfRecords;
    }

    public static boolean aEarlierB (WRecord a, WRecord b) {
        boolean earler = false;
        int aYear = parseInt(a.getwDateYear());
        int aMonth = parseInt(a.getwDateMonth());
        int aDay = parseInt(a.getwDateDay());
        int aHours = parseInt(a.getwBeginHours());
        int aMinutes = parseInt(a.getwBeginMinutes());

        int bYear = parseInt(b.getwDateYear());
        int bMonth = parseInt(b.getwDateMonth());
        int bDay = parseInt(b.getwDateDay());
        int bHours = parseInt(b.getwBeginHours());
        int bMinutes = parseInt(b.getwBeginMinutes());

                // Обработка года
        if (aYear < bYear) {
            earler = true;
        }
        else if (aYear == bYear) {
//            Обработка месяца
            if (aMonth < bMonth) {
                earler = true;
            }
            else if (aMonth == bMonth) {
//                    Обработка дня
                if (aDay < bDay) {
                    earler = true;
                }
                else if (aDay == bDay) {
//                        Обработка часов
                    if (aHours < bHours) {
                        earler = true;
                    }
                    else if (aHours == bHours) {
//                            Обработка минут
                        if (aMinutes < bMinutes) {
                            earler = true;
                        }
                        if (aMinutes == bMinutes) {
                            earler = false;
                        }
                        if (aMinutes > bMinutes) {
                            earler = false;
                        }

                    } else if (aHours > bHours) {
                        earler = false;
                    }
// обработали минуты
                } else if (aDay > bDay) {
                    earler = false;
                }
            } else if (aMonth > bMonth) {
                earler = false;
            }

        }

        else if (aYear > bYear) {
            earler = false;
        }
        return earler;
    }

    public static int getMaxId() {
        return maxId;
    }

    /**
     * == Функция, формирующая строку краткой информации о воркордере
     * @param wo - экземпляр класса WOrder
     * @return
     */
    public static String getBriefWOInfo(WOrder wo) {
        // Добавляем id вркордера
        String resultString = String.format("| %5d ", wo.getId());
        // Добавляем иия воркордера
        resultString += String.format("| %10s ", wo.getWoName());
        // Добавляем первую дату начала работ
        resultString += String.format("| %2s-%2s-%4s ",
                wo.recordsList.get(0).getwDateDay(),
                wo.recordsList.get(0).getwDateMonth(),
                wo.recordsList.get(0).getwDateYear());
        // Добавляем места работ
        for (int i = 0; i < wo.countOfRecords; i++) {
            resultString += wo.recordsList.get(i).getwPlace() + ", ";
        }
        // Добавляем последнюю дату начала работ
        resultString += String.format("| %2s-%2s-%4s ",
                wo.recordsList.get(wo.getCountOfRecords()).getwDateDay(),
                wo.recordsList.get(wo.getCountOfRecords()).getwDateMonth(),
                wo.recordsList.get(wo.getCountOfRecords()).getwDateYear());
        // Добавляем примечание о работах вркордера
        for (int i = 0; i < wo.countOfRecords; i++) {
            resultString += wo.recordsList.get(i).getwDescription() + ", ";
        }
        // Добавляем название клиента
//        HashMap<Integer, Client> cl_map = getClients_mapById();
//        System.out.println("id клиента: " + getClients_mapById().get(wo.getIdClient()));
//        int cl_id = cl_map.get(wo.getIdClient());
//        Client cl = getClients_mapById().get(wo.getIdClient());
//        System.out.println("--- " + cl.toString());
//        System.out.println(" клиент " + getClients_mapById().get(wo.getIdClient()).getName());
//        System.out.println("!!! клиент " + getClients_mapById().get(wo.getIdClient()).getName() + " (" + getClients_mapById().get(wo.getIdClient()).getId() + ") ");
        resultString += "| " + getClients_mapById().get(wo.getIdClient()).getName() +  String.format("(id %-5d)",getClients_mapById().get(wo.getIdClient()).getId());
        resultString += "\n=========== работы: ";
        for (int i = 0; i < wo.recordsList.size(); i++) {
            if (!wo.recordsList.get(i).getwDescription().contains("дорога")) {
                resultString += wo.recordsList.get(i).getwDescription() + "; ";
            }

        }
//        String datesString = "";
        return resultString;
    }
}
