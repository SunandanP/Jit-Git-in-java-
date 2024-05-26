import git.hash.FileHashGenerator;
import git.hash.HashProvider;

public class Main {
    public static void main(String[] args) {
        FileHashGenerator fileHashGenerator = new FileHashGenerator("src/git/hash/hehe.txt");
        System.out.println(fileHashGenerator.generateHash());
        System.out.println(HashProvider.hash("asfasfasfasfsa  safsafsdafsaf asf as as saf asfasfasfsaf asfsaf sadfasdf dsfv dsvsadvsv"));
    }
}