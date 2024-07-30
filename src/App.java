import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        

         String text = extractString("C:\\Users\\Igorj\\personal projects\\sudoku\\sudoku\\src\\sudoku.txt")

        
        
    }
    


    static String extractstring(filepath){
        File file = new File("");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null)

    
        System.out.println(st);
    }

}
