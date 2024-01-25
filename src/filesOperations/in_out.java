package filesOperations;

import java.io.File;
import java.util.Scanner;

public class in_out {
    /**
     * Сохранение воркордеров в файл
     * @param fileName
     * @throws Exception
     */
//    public static void to_WO_File(String fileName) throws Exception {
//        ArrayList<Toy> arr = Toy.toysList;
//        String tempStr = "";
//        FileWriter writer = new FileWriter(fileName);
//        try {
//            for (int i = 0; i < arr.size(); i++) {
//                tempStr = String.valueOf(arr.get(i).id) + ";" +
//                        String.valueOf(arr.get(i).frequency) + ";" +
//                        String.valueOf(arr.get(i).toyType) + ";" +
//                        String.valueOf(arr.get(i).note);
////                System.out.println("tempStr = " + tempStr);
//                writer.write(tempStr);
//                writer.append('\n');
//            }
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

    /**
     * Чтение общего списка клиентов из файла
     *
     * @param fileName
     */
    public static void clientsFromFile(String fileName) {
        String tempStr = "";
//        String tempStrArr[];
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String tStr = scanner.nextLine();
                String tempStrArr[] = tStr.split(";");
                System.out.println(tempStrArr[0] + ", " + tempStrArr[1] + ", " +tempStrArr[2] + ", " + tempStrArr[3]);

//                Toy t = new Toy(Integer.parseInt(tempStrArr[1]), tempStrArr[2], tempStrArr[3]);
//                Toy.toysList.add(t);
//                System.out.println(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        //    /**
//     * Запись общего списка игрушек в файл
//     * @param fileName
//     * @throws Exception
//     */
//    public static void toFile(String fileName) throws Exception {
//        ArrayList<Toy> arr = Toy.toysList;
//        String tempStr = "";
//        FileWriter writer = new FileWriter(fileName);
//        try {
//            for (int i = 0; i < arr.size(); i++) {
//                tempStr = String.valueOf(arr.get(i).id) + ";" +
//                        String.valueOf(arr.get(i).frequency) + ";" +
//                        String.valueOf(arr.get(i).toyType) + ";" +
//                        String.valueOf(arr.get(i).note);
////                System.out.println("tempStr = " + tempStr);
//                writer.write(tempStr);
//                writer.append('\n');
//            }
//            writer.flush();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}


    }

    public static void main(String[] args) {

        clientsFromFile("src.Files.clients.txt");
    }

    public static void helloFromFiles() {
        System.out.println();
        System.out.println();
        System.out.println("Hi from in_out.java !!!");

    }
}