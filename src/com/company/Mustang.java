package com.company;

public class Mustang implements Horse {
    private String Name;
    private int Weight;

    public Mustang(String Name, int Weight)
    {
        this.Name = Name;
        this.Weight = Weight;
    }


    public  int getWeight()
    {
        return Weight;
    }

    public String getName()
    {
        return Name;
    }



}
