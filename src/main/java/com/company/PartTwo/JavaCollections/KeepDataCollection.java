package com.company.PartTwo.JavaCollections;

import java.util.LinkedList;

public class KeepDataCollection {
    public static void main(String[] args) {
        LinkedList<PostAddress> addresses = new LinkedList<PostAddress>();
        addresses.add(new PostAddress("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        addresses.add(new PostAddress("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        addresses.add(new PostAddress("Tom Cartlon", "867 Elm St", "Champaign", "IL", "61820"));

        for (PostAddress iter :
                addresses) {
            System.out.println(iter + "\n");

            System.out.println();
        }
    }
}



class PostAddress {
    String name;
    String street;
    String city;
    String state;
    String code;

    public PostAddress(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

