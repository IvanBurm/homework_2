import java.io.File;
import java.io.IOException;

public class new_folder {
    public static void main(String args[])
    {   String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randString = new StringBuilder();
        int count = (int)(Math.random()*20);
        for(int i=0;i<count;i++)
            randString.append(symbols.charAt((int)(Math.random()*symbols.length())));

        System.out.println(randString);
        File f = new File("../../../"+randString);
        if(f.mkdir())
        {System.out.println("Folder Created..");
        }
        File file = new File("../../../"+randString,"test.txt");
        try
        {
            boolean created = file.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}
