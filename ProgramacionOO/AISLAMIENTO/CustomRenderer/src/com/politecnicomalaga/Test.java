package com.politecnicomalaga;

import com.politecnicomalaga.DAO.LectorCredenciales;

public class Test {
    public static void main(String[] args) {
        LectorCredenciales cr = new LectorCredenciales();
        System.out.println(cr.getUser());
        System.out.println(cr.getPass());
        System.out.println(cr.getHost());
        System.out.println(cr.getDatabase());
    }
}
