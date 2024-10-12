package college;
import java.io.*;

public class FileHandlinng
{
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";

        // Create a file and write to it
        try 
        {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }

            // Write to the file
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter data");
            String buffer =br.readLine();
            
            FileWriter f1= new FileWriter(file);
            f1.write(buffer);
            System.out.println("file contents added");
            f1.close();

            // Read from the file
            System.out.println("Reading from the file:");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
            reader.close();

            // Delete the file
            if (file.delete())
            {
                System.out.println("File deleted successfully.");
            } 
            else
            {
                System.out.println("Failed to delete the file.");
            }

        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}


