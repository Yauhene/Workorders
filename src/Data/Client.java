package Data;

import java.io.*;
import java.util.*;

public class Client {
    private static int index = 0;
    private int id;
    private static int maxId;
    private String name;
    private String locPlace;
    private String locStreet;
    private String locBuilding;
    private String locOffice;
    private String cType;

    private static HashMap<Integer, Client> clients_mapById = new HashMap<>() ;

     private Client (int id, String name, String locPlace, String locStreet, String locBuilding, String locOffice, String cType) {
         this.id = id;
         this.name = name;
         this.locPlace = locPlace;
         this.locStreet = locStreet;
         this.locBuilding = locBuilding;
         this.locOffice = locOffice;
         this.cType = cType;
         if (maxId < this.id) maxId = this.id;

     }

    public static int getIndex() {
        return index;
    }

    public int getId() {
        return id;
    }

    public static int getMaxId() {
        return maxId;
    }

    public String getName() {
        return name;
    }

    public String getLocPlace() {
        return locPlace;
    }

    public String getLocStreet() {
        return locStreet;
    }

    public String getLocBuilding() {
        return locBuilding;
    }

    public String getLocOffice() {
        return locOffice;
    }

    public String getcType() {
        return cType;
    }

    public static HashMap<Integer, Client> getClients_mapById() {
         return clients_mapById;
    }

    public static void addClientInMapById(Client client) {
         if (!clients_mapById.containsKey(client.getId())) {
             clients_mapById.put(client.getId(),client);
         }
         else {
             System.out.println("Ошибка!!! Мапа clients_mapById уже содержит такой ключ.");
         }


//        getClients_mapById().put();
    }

    /**
     * Чтение общего списка клиентов из файла
     *
     * @param fileName - файл-источник
     */
    public static void clients_from_File(String fileName) {
        String tempStr = "";
        File file = new File(fileName);
//        WOrder wo;
        try {
            Scanner scanner = new Scanner(file);
            String tStr;
            while (scanner.hasNextLine()) {
                tStr = scanner.nextLine();
                String tempStrArr[] = tStr.split(";");
//                System.out.println(" размер массива tempStrArr[]: " + tempStrArr.length);
//
                // ----- Заполнение нового экземпляра Client данными работы
//                Client client_1 = new Client(1, "Трест 15", "Минск", "Минина", "1", "", "стройка");

                Client client = new Client(Integer.parseInt(tempStrArr[0]), // id
                        tempStrArr[1].trim(), // имя клиента
                        tempStrArr[2].trim(), // локация клиента
                        tempStrArr[3].trim(), // улица
                        tempStrArr[4].trim(), // здание
                        tempStrArr[5].trim(), // номер офиса
                        tempStrArr[6].trim());// тип клиента
//                for (int i = 0; i < tempStrArr.length; i++) {
//                    System.out.println(tempStrArr[i]);
//                }
//                System.out.println( "распечатаем клиента: " + client.toString());

                Client.addClientInMapById(client);



            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
         return String.format("клиент: id %d, назв. %s, нас.пункт %s, улица %s, дом %s, офис %s, тип: %s", id, name, locPlace, locStreet, locBuilding, locOffice, cType);
     }
}
