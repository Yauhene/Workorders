package Data;

import java.util.ArrayList;



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

    @Override
    public String toString() {
            return String.format("Workorder id %d: \nномер работы: %s, код машины: %d, моточасов: %d, код клиента: %d",
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
}
