package 프로퍼티;
//키와 값이 모두 String 타입으로 제한 된 Map 컬렉션이며 HashTable에서 상속 받았습니다.
//주로 문자열로 이루어진 파일에서 정보를 읽을 때 사용 합니다.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); //HashTable에서 상속
        String path = PropertiesEx.class.getResource("../회원정보조합/database.properties").getPath();
        path = URLDecoder.decode(path,"utf-8"); // 한글이 포함 되는 이를 해석하기 위한 코드
        properties.load(new FileReader(path)); //


        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("drive : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);


    }
}
