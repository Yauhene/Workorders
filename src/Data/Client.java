package Data;

public class Client {
    private static int index = 0;
    private int id;
    private String name;
    private String locPlace;
    private String locStreet;
    private String locBuilding;
    private String locOffice;
    private String cType;

     public Client (int id, String name, String locPlace, String locStreet, String locBuilding, String locOffice, String cType) {
         this.id = id;
         this.name = name;
         this.locPlace = locPlace;
         this.locStreet = locStreet;
         this.locBuilding = locBuilding;
         this.locOffice = locOffice;
         this.cType = cType;
     }

     @Override
    public String toString() {
         return String.format("клиент: id %d, назв. %s, нас.пункт %s, улица %s, дом %s, офис %s, тип: %s", id, name, locPlace, locStreet, locBuilding, locOffice, cType);
     }
}
