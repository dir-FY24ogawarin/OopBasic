package company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ObjectSample4 {

    public static void main(String[] args) {
        String content ="これは最初の行です。\nこれは次の行です。\nそして、これが最後の行です。";
        
        try {
            Files.writeString(Paths.get("example.txt"), content);
            
            String content2=Files.readString(Paths.get("example.txt"));
            System.out.println(content2);
            
            List<String>lines =Files.readAllLines(Paths.get("example.txt"));
            var lineNumber = 1;
            for (String line:lines) {
                System.out.println("%d行目:%s".formatted(lineNumber,line));
                lineNumber++;
            }
            
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

}
