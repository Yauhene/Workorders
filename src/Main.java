public class Main {
    public static void main(String[] args) {
        //int id, String name, String location, String cType
        Client client_1 = new Client("Речицадрев", "Речица", "дерево");

//      public Mashine(String brand, String model, String sNumber, int idClient)
        Mashine mash_1 = new Mashine("CAT", "M322D MH", "D3X00332", 1);

        WOrder wo_1 = new WOrder("15122023/11", 1, 23182, 1, "Речица");
        System.out.println(wo_1);
        System.out.println(client_1);
        System.out.println(mash_1);


    }
}
