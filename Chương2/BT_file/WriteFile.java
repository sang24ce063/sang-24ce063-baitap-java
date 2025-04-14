import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String[] list = {"one", "two", "three", "four"};
        try {
            File file = new File("file.txt");
            FileWriter fileReader = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
            for (String s : list) {
                bufferedWriter.write(s + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

