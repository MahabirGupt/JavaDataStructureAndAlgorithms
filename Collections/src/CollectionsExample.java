import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

class Cricketer implements Comparable<Cricketer> {
    int runs;
    String name;

    public Cricketer(String name, int runs) {
        super();
        this.name = name;
        this.runs = runs;
    }

    @Override
    public String toString() {
        return name + " " + runs;
    }

    // compareTo takes an argument of the same type of the class
    // compareTo returns -1 if this < that
    // 1 if this > that
    // 0 if this = that
    @Override
    public int compareTo(Cricketer that) {
        if (this.runs > that.runs) {
            return 1;
        }
        if (this.runs < that.runs) {
            return -1;
        }
        return 0;
    }

}

class DescendingSorter implements Comparator<Cricketer> {

    // compareTo returns -1 if cricketer1 < cricketer2
    // 1 if cricketer1 > cricketer2
    // 0 if cricketer1 = cricketer2

    // Since we want to sort in descending order,
    // we should return -1 when runs are more
    @Override
    public int compare(Cricketer cricketer1, Cricketer cricketer2) {
        if (cricketer1.runs > cricketer2.runs) {
            return -1;
        }
        if (cricketer1.runs < cricketer2.runs) {
            return 1;
        }
        return 0;
    }

}

