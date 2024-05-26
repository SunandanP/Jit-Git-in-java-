package git.hash;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class FileOperator {
    private FileInputStream objectInputStream;
    private final File file;

    public FileOperator(String path){
        file = new File(path);
        try {
            objectInputStream = new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFileContents(){
        try {
            objectInputStream = new FileInputStream(file);
            var readData = objectInputStream.readAllBytes();
            var readDataArray = new ArrayList<Byte>();

            for (byte b : readData) {
                readDataArray.add(b);
            }

            StringBuilder data = new StringBuilder();

            readDataArray.stream()
                    .map(b -> (char)b.byteValue())
                    .forEach(data::append);


            return data.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
