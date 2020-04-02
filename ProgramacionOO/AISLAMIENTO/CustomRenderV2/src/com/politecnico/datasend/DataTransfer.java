package com.politecnico.datasend;

import java.util.TreeMap;

public class DataTransfer {
    private TreeMap<String,Object> data = new TreeMap<>();

    public void put(String clave,Object objeto){
        data.put(clave,objeto);
    }
    public Object get(String clave){
        return data.get(clave);
    }
}
