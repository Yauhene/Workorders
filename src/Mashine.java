public class Mashine {
    private static int id = 0;
    private String brand;
    private String model;
    private String sNumber;
    private int idClient;

    public Mashine(String brand, String model, String sNumber, int idClient) {
        this.id = ++id;
        this.brand = brand;
        this.model = model;
        this.sNumber = sNumber;
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return String.format("машина %d, бренд %s, модель %s, s/n %s, клиент %d",
                id, brand, model, sNumber,idClient);
    }
}
