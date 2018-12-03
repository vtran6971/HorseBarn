import com.company.Horse;

public class HorseBarn {
    private Horse[] spaces;
    public HorseBarn(int stalls)
    {
     spaces = new Horse[stalls];
    }

    public int findHorseSpace(String Name)
    {
        for (int i = 0; i < this.spaces.length; i++)
        {
            if (this.spaces[i]!=null && Name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public  String toString()
    {
        String output = "";
        output += this.getName()+","+" weights: " +this.getWeight();
        return output;
    }
}
