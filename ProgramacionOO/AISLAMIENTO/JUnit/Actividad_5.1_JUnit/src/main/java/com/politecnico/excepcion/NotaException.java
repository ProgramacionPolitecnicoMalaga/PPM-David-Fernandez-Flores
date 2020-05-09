package com.politecnico.excepcion;

public class NotaException extends Exception{

    public NotaException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Esta nota excede las posibles, amiga";
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
