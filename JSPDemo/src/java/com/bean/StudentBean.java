/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author sparrow
 */
public class StudentBean implements java.io.Serializable {
    
    private int id;
    private String name;
    
    StudentBean() {
        super();
    }
    
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String name() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
