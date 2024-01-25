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
     *
     * @param wo экземпляр класса wo_Link
     */
    public void displayWoLink(woLink wo) {
        System.out.println("[ " + id + ", " + wo.w_order.getWoName() + ", " +
                wo.w_order.getIdMash() + ", " +  wo.w_order.getHoursMash() + ", " +
                wo.w_order.getIdClient() + ", " + next + ", " + getPrev() + " ]");
    }

} //------ конец класса woLink ---------------------------------------
