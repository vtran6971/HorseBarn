package com.company;

public class HorseBarn {
    public Horse[] spaces;

    public HorseBarn(Horse[] horses) {
        this.spaces = horses;
    }

   /* public String toString()
    {
        String output = "";
        output += this.getName+ "," + " weighs: " + this.getWeight();
        return output;
    }
*/


    public int findHorseSpace(String Name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && Name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;

    }

    public void consolidate()
    {
        int nullcount = 0;
        for (int a = 0; a < this.spaces.length; a++)
        {
            if (this.spaces[a] == null)
            {
                nullcount++;
            }
        }

        for (int nulls = 0; nulls < nullcount; nulls++)
        {
            for (int i = 0; i < this.spaces.length; i++) {
                if (this.spaces[i] == null) {
                    for (int j = i; j < spaces.length; j++) {
                        if (spaces[j] != null) {
                            spaces[i] = this.spaces[i + 1];
                            spaces[i + 1] = null;
                            j = spaces.length;
                        }
                    }
                }
            }
        }
        }
    }


