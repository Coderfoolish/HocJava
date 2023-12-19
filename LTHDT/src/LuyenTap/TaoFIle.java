package LuyenTap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TaoFIle {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt") ;
        if (!file.exists()){
            file.createNewFile() ;
        }
        FileInputStream f = new FileInputStream(file) ;
        int s = f.read() ;
        while (s != -1){ //doc den vi tri cuoi cung cua file
            System.out.println((char) s);
            s = f.read() ;
        }
        f.close();
        FileOutputStream o = new FileOutputStream(file) ;

        o.write("abc".getBytes());

    }
}
