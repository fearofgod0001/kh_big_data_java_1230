package 스트림입출력예제4번;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;

//Reader는 문자 스트림의 최상위 추상 클래스 입니다.
public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("test.txt");
//        int readData;
//        while(true){
//            readData = reader.read(); // 한개의 문자(2바이트)를 읽어 4byte int 타입으로 반환
//            if(readData == -1)break;
//            System.out.print((char)readData);
//        }
//        reader.close();

        int readNo;
        char[] cBuf = new char[256];
        String data = "";
        while (true) {
            readNo = reader.read(cBuf);
            if(readNo == -1)break;
            data += new String(cBuf,0,readNo);
        }
        System.out.print(data);
        reader.close();
    }
}
