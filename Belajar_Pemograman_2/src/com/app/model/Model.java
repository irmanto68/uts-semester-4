/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.model;

import com.app.entity.Entity;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class Model extends AbstractTableModel {

    private List<Entity> list;

    public Model() {
    }

    public Model(List<Entity> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columIndex) {
        return list.get(rowIndex).getValue(columIndex);
    }

    private String[] column = {"NIM","Nama","Jurusan","Alamat","Email","Telpon"};
    @Override
    public String getColumnName(int index) {
        return column[index];
    }

}
