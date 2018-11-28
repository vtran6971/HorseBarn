package com.company;

public class Mustang implements Horse {
    String Name;
    int Weight;

    public Mustang(String theName, int theWeight)
    {
        this.Name = theName;
        this.Weight = theWeight;
    }

    public  String getName()
    {
        return this.Name;
    }

    public  int getWeight()
    {
        return this.Weight;
    }

    public  String toString()
    {
        return "name: " + this.Name + " weight: " + this.Weight;
    }
}
