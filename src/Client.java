public class Client {
    private static int id = 0;
    private String name;
    private String location;
    private String cType;

     public Client (String name, String location, String cType) {
         this.id = ++id;
         this.name = name;
         this.location = location;
         this.cType = cType;
     }

     @Override
    public String toString() {
         return String.format("клиент %d, назв. %s, располож. %s, тип: %s", id, name, location, cType);
     }
}
