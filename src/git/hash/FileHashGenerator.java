package git.hash;

public class FileHashGenerator {
    FileOperator fileOperator;

    public FileHashGenerator(String path){
        fileOperator = new FileOperator(path);
    }

    public String generateHash(){
        return HashProvider.hash(fileOperator.readFileContents());
    }
}
