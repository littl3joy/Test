package com.leonatus;


import com.leonatus.People.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        List<People> person = new ArrayList<>();
        Collections.addAll(person,
                new People("mary", 33));

        person.stream()
                .forEach(System.out::println);

    }
}
