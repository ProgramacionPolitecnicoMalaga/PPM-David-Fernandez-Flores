package datasend;

import java.util.TreeMap;

public class DataTransfer {
    private TreeMap<String,Object> data = new TreeMap<>();

    public void put(String clave,Object object){
        data.put(clave,object);
    }
    public Object get(String clave){
        return data.get(clave);
    }
}
