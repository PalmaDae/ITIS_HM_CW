import java.io.*;

public class ThirdThread extends Thread{
    String input;
    String output;
    String fileName;

    public ThirdThread(String input, String output, String fileName) {
        this.input = input;
        this.output = output;
        this.fileName = fileName;
    }



    @Override
    public void run() {
        try {
            FileInputStream fis = new FileInputStream(new File(input));
            FileOutputStream fos = new FileOutputStream(output + fileName);

            int i;

            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            fis.close();
            fos.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
