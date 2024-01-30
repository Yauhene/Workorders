package Data;

import Service.Service;
public class WRecord {
    private int idWO;
    private String wPlace;
    private String wType;
    private String wDateDay;
    private String wDateMonth;
    private String wDateYear;
    private String wBeginHours;
    private String wBeginMinutes;
    private String wEndHours;
    private String wEndMinutes;
    private String wDuration = "0";
    private int wDistance = 0;
    private String wDescription = "";

    public WRecord(
            int idWO, String wPlace, String wType,
            String wDateDay, String wDateMonth, String wDateYear,
            String wBeginHours, String wBeginMinutes,
            String wEndHours, String wEndMinutes, int wDistance, String wDescription) {
        this.idWO = idWO;
        this.wPlace = wPlace;
        this.wType = wType;
        this.wDateDay = wDateDay;
        this.wDateMonth = wDateMonth;
        this.wDateYear = wDateYear;
        this.wBeginHours = wBeginHours;
        this.wBeginMinutes = wBeginMinutes;
        this.wEndHours = wEndHours;
        this.wEndMinutes = wEndMinutes;
        this.wDistance = wDistance;
        this.wDescription = wDescription;
        this.wDuration = Service.DateDifferent(wDateDay, wDateMonth, wDateYear, wBeginHours, wBeginMinutes,
                wDateDay, wDateMonth, wDateYear, wEndHours, wEndMinutes);
    }

    @Override
    public String toString() {
//        return String.format("WO id: %d, %s, %s, %s, %s, %s, %s", %d, %s ",
//        idWO, wPlace, wType, wDate, wBegin, wEnd, wDuration, wDistance, wDescription);
          return String.format("|   %5d | %s-%s-%s |  %s:%s | %s:%s  |  %5s   | %-15s   | %-20s | %s ",
        idWO, wDateDay, wDateMonth, wDateYear, wBeginHours, wBeginMinutes, wEndHours, wEndMinutes,  wDuration, wType,  wPlace, wDescription);

    }


}
