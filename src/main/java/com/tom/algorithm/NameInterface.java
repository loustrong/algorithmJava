package com.tom.algorithm;

/**
 * this is about interface
 */
public interface NameInterface {
    /**
     * @param firstName 名
     * @param lastName  姓
     */
    public void setName(String firstName, String lastName);
/*
* 这是getName
* */
    public String getName();
    public void setFirst(String firstName);
    public void setLast(String lastName);
    public void giveLastName(NameInterface aName);
    public String toString();
}
