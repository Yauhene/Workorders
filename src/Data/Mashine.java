package Data;

public class Mashine {
    private static int index = 0;
    private int id;
    private String brand;
    private String model;
    private String sNumber;
    private int idClient;

    public Mashine(int id, String brand, String model, String sNumber, int idClient) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.sNumber = sNumber;
        this.idClient = idClient;
    }

    @Override
    public String toString() {
        return String.format("машина %d, бренд %s, модель: %s, s/n %s, клиент %d",
                id, brand, model, sNumber, idClient);
    }
}
