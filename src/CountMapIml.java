import java.util.HashMap;
import java.util.Map;

public class CountMapIml<K> implements CountMap<K>{
    private HashMap<K,Integer> countMap = new HashMap<>();

    public CountMapIml() {
    }

    public CountMapIml(K k) {
        this.countMap.put(k,1);
    }

    @Override
    public void add(K k){
        if (this.countMap.containsKey(k))
            this.countMap.put(k,this.countMap.get(k)+1);
        else
            this.countMap.put(k,1);
    };

    @Override
    public int getCount(K k){
        return this.countMap.getOrDefault(k, 0);
    };

    @Override
    public int remove(K k){
        if (this.countMap.containsKey(k))
            return countMap.remove(k);
        else
            return 0;
    };

    //количество разных элементов
    @Override
    public int size(){
        return this.countMap.size();
    };

    @Override
    public void addAll(CountMap<K> source){
        for (K key: source.toMap().keySet()){
            if (this.countMap.containsKey(key))
                this.countMap.put(key, this.countMap.get(key) + source.toMap().get(key));
            else
                this.countMap.put(key, source.toMap().get(key));
        }
    };

    @Override
    public Map<K,Integer> toMap(){
        return countMap;
    };

    @Override
    public void toMap(Map<K,Integer> destination){
        for (K key: this.countMap.keySet()) {
            if (destination.containsKey(key))
                destination.put(key, this.countMap.get(key) + destination.get(key));
            else
                destination.put(key, this.countMap.get(key));
        }
    };
}
