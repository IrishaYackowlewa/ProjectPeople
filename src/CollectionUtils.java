import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtils {

    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static<T> List<T> newArrayList() {
        return new ArrayList();
    }

    public static<T> int indexOf(List<? extends T> source, T t) {
        return source.indexOf(t);
    }

    public static<T> List<T> limit(List<? extends T> source, int size) {
        return new ArrayList<T>(source.subList(0, size));
    }

    public static<T> void add(List<? super T> source, T t) {
        source.add(t);
    }

    public static<T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static<T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static<T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T t: c1)
            if (c1.contains(t))
                return true;
        return false;
    }

    public static<T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> needList = new ArrayList<T>(list);
        needList.removeIf(n -> (n.compareTo(min)<=0 || n.compareTo(max)>=0));
        return needList;
    }

    public static<T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> needList = new ArrayList<T>(list);
        needList.removeIf(n -> (comparator.compare(n, min)<=0 || comparator.compare(n, max)>=0));
        return needList;
    }
}
