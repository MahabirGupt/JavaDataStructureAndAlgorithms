import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class House implements Serializable {
    public House(int number) {
        super();
        this.number = number;
        System.out.println(number);
    }

    Wall wall;
    int number;
}

class Wall implements Serializable {
    int length;
    int breadth;
    int color;
    int area;

    public Wall(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }
}

