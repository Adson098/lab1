import java.io.*;

public class main {


    public void saveFile(String data) throws IOException {
        FileWriter f = new FileWriter("temp.txt");
        BufferedWriter out = new BufferedWriter(f);
        out.write(data);
        out.close();
    }

    public void readFile() throws IOException {
        FileInputStream f = new FileInputStream("temp.txt");
        DataInputStream in = new DataInputStream(f);
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        String strLine;
        String dane = "";
        while ((strLine = r.readLine()) != null) {
            dane += strLine;
        }
        in.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        {
            System.out.println("gowno");
        }
    }
}
