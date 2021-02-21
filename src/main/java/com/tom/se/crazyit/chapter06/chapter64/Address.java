package com.tom.se.crazyit.chapter06.chapter64;

import java.util.Objects;

/**
 * @descriptions: Address
 * @author: Tom
 * @date: 2021/1/16 下午 04:10
 * @version: 1.0
 */
public class Address {
    private final String details;
    private final String postCode;
    public Address(){
        this.details = "";
        this.postCode = "";
    }
    public Address(String details, String postCode){
        this.postCode = postCode;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return details.equals(address.details) &&
                postCode.equals(address.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, postCode);
    }
}
