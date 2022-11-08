import java.util.ArrayList;

public class PeopleDAO
{
    ArrayList<People> characters = new ArrayList<>();

    public void addPerson(People p)
    {
        characters.add(p);
    }

    public ArrayList<People> displayAll(){return characters;}

    public String toString()
    {
        String s = "";
        for(People temp: characters)
        {
            s = s + "'"+temp.getName()+"' ";
        }
        return s.trim();
    }


}
