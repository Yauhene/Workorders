package Data;

import java.util.*;

import static java.lang.Integer.parseInt;


public class WOrder {
    private static int index=0;
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

    public static void print_WOrder(WOrder wo) {
        System.out.println(wo.toString());
        wo.printRecList();
    }

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
}
