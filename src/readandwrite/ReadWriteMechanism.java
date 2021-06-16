package readandwrite;

import product.Product;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Queue;

@SuppressWarnings("unchecked")
public class ReadWriteMechanism {

    public static Map<String, List<Queue<Product>>> readWeedingMachineDataFromFile() {
        try (FileInputStream fileInputStream = new FileInputStream("data.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Map<String, List<Queue<Product>>>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writeWeedingMachineDataToFile(Map<String, List<Queue<Product>>> blocks) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(blocks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
