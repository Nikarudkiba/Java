import java.io.*;

public class Java2Lab6 {

    public static void main(String[]args) throws IOException {
        int[] myArr ={16,31,90,45,89};

    WriteInts wi=new WriteInts("myData.dat",myArr);
    ReadInts re =new ReadInts("myData.dat");
    WriteString ws = new WriteString("f1.txt","Hello world");

    }

}
class WriteInts {
    public WriteInts(String s, int[] myArr) throws IOException {
        File f1 = new File(s);
        long sz =myArr.length ;
        if (sz >= 0) {
            FileOutputStream fout = new FileOutputStream(f1);
            DataOutputStream dout = new DataOutputStream(fout);
            for (int y = 0;y<sz;y++)
            {
                dout.write(myArr[y]);
            }
            dout.close();
        }

    }
}
class ReadInts{
    public ReadInts(String s) throws IOException {
        File f1 = new File(s);
        long sz = f1.length();
        int x;
        if (sz != 0) {
            FileInputStream fin = new FileInputStream(f1);
            DataInputStream din = new DataInputStream(fin);
            for (int y = 0;y<sz;y++)
            {
                x = din.read();
                System.out.println(x);
            }
            din.close();

        }
    }
}
class WriteString{
    public WriteString(String s, String s2) throws FileNotFoundException {
        File f1 = new File(s);
        long sz = f1.length();
        if (sz == 0) {
            FileOutputStream fout = new FileOutputStream(f1);
            PrintStream ps = new PrintStream(fout);
            ps.println(s2);
            ps.close();
        }

    }
}
