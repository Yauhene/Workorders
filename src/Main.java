import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //int id, String name, String location, String cType
        Client client_1 = new Client("'Речицадрев'", "Речица", "деревообработка");

//      public Mashine(String brand, String model, String sNumber, int idClient)
        Mashine mash_1 = new Mashine("CAT", "M322D MH", "D3X00332", 1);

        WOrder wo_1 = new WOrder("15122023/11", 1, 23182, 1, "Речица");

        System.out.println();
        System.out.println(wo_1);
        System.out.println(" -------> " + mash_1);
        System.out.println(" -------> " + client_1);
        wo_1.recordsList = new ArrayList<WRecord>();

        wo_1.recordsList.add(new WRecord(wo_1.getId(), "Речица", "дорога", "22-12-2023", "06:00", "10:00", 280, ""));
        wo_1.recordsList.add(new WRecord(wo_1.getId(), "Речица", "работа", "22-12-2023", "10:00", "14:00", 280, ""));
        wo_1.recordsList.add(new WRecord(wo_1.getId(), "Речица", "дорога обратно", "22-12-2023", "14:00", "18:00", 280, ""));
        wo_1.printRecList();
    }




}
