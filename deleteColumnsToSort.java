import java.util.*;
import java.util.List;

public class deleteColumnsToSort 
{
    public List<Integer> deletionSize(String[] stringList)
    {
        // create empty list for the first char of string.
        List<Integer> index = new ArrayList<Integer>();
        //boolean value to determine if the string is equal size.
        boolean valid = true;
        //get first char of string in index.
        for(int character=0;character<stringList[0].length();character++)
        {
            
            if (valid)
            {
                //will compare the string lengths to check if valid
                for(int column=0;column<stringList.length-1;column++)
                {
                    if(stringList[column].length()==stringList[column+1].length())
                    {
                        if(stringList[column].charAt(character)>stringList[column+1].charAt(character))
                        {
                            index.add(character);
                            break;
                        }
                    }
                    else
                    {
                        valid = false;
                    }
                }
            }
            else
            //if valid is false then the index will just be -1.
            {
                index.add(-1);
                break;
            }
        }
        return index;
    }
    
    public static void main(String [] args)
    {
        String [] characters = new String[]{"Captain","Marvel","saved", "the", "Avengers"};
        deleteColumnsToSort columnSort = new deleteColumnsToSort();
        List<Integer> deletion = columnSort.deletionSize(characters);
        System.out.println(deletion.toString());
    }
}
