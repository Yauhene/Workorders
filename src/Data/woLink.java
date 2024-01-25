package Data;

public class woLink {
    private int id;
    private WOrder w_order;
    public woLink next;
    private woLink prev;
    public int elCount = 0;

    public woLink (int id, WOrder w_order) {
        this.id = id;
        this.w_order = w_order;
        this.elCount += 1;

    }
    //------------------------------------------------


    public woLink getPrev() {
        return prev;
    }


    public void setPrev(woLink prev) {
        this.prev = prev;
    }

    /**
     * Вывод на экран элемента woLink
     *
     */
    public void displayWoLink() {
        System.out.println("[ " + id + ", " + w_order.getWoName() + ", " +
                w_order.getIdMash() + ", " +  w_order.getHoursMash() + ", " +
                w_order.getIdClient() + ", " + next + ", " + getPrev() + " ]");
    }

} //------ конец класса woLink ---------------------------------------
