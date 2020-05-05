package com.politecnico.tableModel;

import com.politecnico.modelo.ListaPersonas;
import com.politecnico.modelo.Persona;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class CustomTableModel extends AbstractTableModel {
    private static final int C_NOMBRE = 0;
    private static final int C_APELLIDO = 1;
    private static final int C_EDAD = 2;

    private ListaPersonas lista = ListaPersonas.getInstance();

    private static String[] columns = {"Nombre","Apellidos","Edad"};

    @Override
    public int getRowCount() {
        return lista.getSizeLista();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        if ((row >= 0) && (row < lista.getSizeLista())){
            switch (col){
                case C_NOMBRE: return lista.getPersonaAt(row).getNombre();
                case C_APELLIDO: return lista.getPersonaAt(row).getApellidos();
                case C_EDAD: return lista.getPersonaAt(row).getEdad();
            }
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case C_NOMBRE:
            case C_APELLIDO:
                return String.class;
            case C_EDAD: return Integer.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if ((rowIndex >= 0) && (rowIndex < lista.getSizeLista())){
            switch (columnIndex){
                case C_NOMBRE: lista.getPersonaAt(columnIndex).setNombre((String) aValue);
                case C_APELLIDO: lista.getPersonaAt(columnIndex).setApellidos((String) aValue);
                case C_EDAD: lista.getPersonaAt(columnIndex).setEdad((Integer) aValue); // Aqui da error
            }
        }
        fireTableCellUpdated(rowIndex,columnIndex);
    }

    public void removeRow(int rowSelected){
        if ((rowSelected >= 0) && (rowSelected < lista.getSizeLista())){
            lista.deleteThis(rowSelected);
            fireTableCellUpdated(rowSelected,rowSelected);
        }
    }

    public void addNewRow(){
        lista.añadirPersona(new Persona("","",0));
        fireTableDataChanged();
    }
}
