import java.util.ArrayList;

public class WOrder {
    private static int id=0;
    private String woName;
    private int idMash;
    private int hoursMash;
    private int idClient;


    private String workPlace;
    protected ArrayList<WRecord> recordsList;

    public WOrder (String woName, int idMash, int hoursMash, int idClient, String workPlace) {
        this.id = ++id;
        this.woName = woName;
        this.idMash = idMash;
        this.hoursMash = hoursMash;
        this.idClient = idClient;
        this.workPlace = workPlace;
        recordsList = new ArrayList<WRecord>();
    }

    public int getId() {
        return id;
    }

    public void printRecList() {
        for (WRecord i: recordsList) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return String.format("id %d:  wo: %s, место: %s, %d, %d часов, %d", id, woName, workPlace, idMash, hoursMash, idClient);
    }

}
