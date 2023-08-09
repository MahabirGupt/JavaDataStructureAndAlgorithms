import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExamples2 {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileStream = new FileOutputStream("House.ser");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        House house = new House(10);
//        house.wall = new Wall(6,7);
        Wall wall = new Wall(6,7);
        // Exception in thread "main" java.io.NotSerializableException:
        // com.rithus.serialization.Wall
        objectStream.writeObject(house);
        objectStream.close();
        System.out.println(wall.area);
    }
}
