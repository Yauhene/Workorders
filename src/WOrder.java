public class WOrder {
    private static int id=0;
    private String woName;
    private int idMash;
    private int hoursMash;
    private int idClient;

    private String workPlace;

    public WOrder (String woName, int idMash, int hoursMash, int idClient, String workPlace) {
        this.id = ++id;
        this.woName = woName;
        this.idMash = idMash;
        this.hoursMash = hoursMash;
        this.idClient = idClient;
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return String.format("Работа: id %d,  наим. %s, место: %s, %d, %d часов, %d", id, woName, workPlace, idMash, hoursMash, idClient);
    }

}
