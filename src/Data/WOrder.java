package Data;

import java.util.ArrayList;

public class WOrder {
    private static int index=0;
    private int id;
    private String woName;
    private int idMash;
    private int hoursMash;
    private int idClient;


    private String workPlace;
    public ArrayList<WRecord> recordsList;

    public WOrder (int id, String woName, int idMash, int hoursMash, int idClient) {
        this.id = id;
        this.woName = woName;
        this.idMash = idMash;
        this.hoursMash = hoursMash;
        this.idClient = idClient;
        recordsList = new ArrayList<WRecord>();
    }


    /**
     * Метод возвращает id наряд-заказа
     * @return
     */

    public int getId() {
        return id;
    }

    /**
     * Метод вывода записей работ
     */
    public void printRecList() {
        for (WRecord i: recordsList) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return String.format("id %d:  wo: %s, место: %s, %d, %d часов, %d", id, woName, workPlace, idMash, hoursMash, idClient);
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
}
