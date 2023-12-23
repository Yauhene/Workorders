import Service.Service;
public class WRecord {
    private int idWO;
    private String wPlace;
    private String wType;
    private String wDate;
    private String wBegin;
    private String wEnd;
    private String wDuration = "0";
    private int wDistance = 0;
    private String wDescription = "";

    public WRecord(
            int idWO, String wPlace, String wType,
            String wDate, String wBegin, String wEnd, int wDistance, String wDescription) {
        this.idWO = idWO;
        this.wPlace = wPlace;
        this.wType = wType;
        this.wDate = wDate;
        this.wBegin = wBegin;
        this.wEnd = wEnd;
        this.wDistance = wDistance;
        this.wDescription = wDescription;
        this.wDuration = Service.DateDifferent(wDate, wBegin, wDate, wEnd);
    }

    @Override
    public String toString() {
//        return String.format("WO id: %d, %s, %s, %s, %s, %s, %s", %d, %s ",
//        idWO, wPlace, wType, wDate, wBegin, wEnd, wDuration, wDistance, wDescription);
          return String.format("WO id: %d, %s, %s, %s, %s, %s, %s ",
        idWO, wPlace, wType, wDate, wBegin, wEnd, wDuration );

    }
}
