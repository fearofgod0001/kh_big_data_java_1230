package Date클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date() : 1970년 1월1일 0시 0분0초에서 현재가지의 경과시간으로 시간계산(msec), 객체를 생성 후 사용
//simpleDateFormat : 운영체제로 부터 얻어진 시간 정보를 우리가 원하는 포맷으로 변경해서 출력함(pattern)
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월dd일 hh시mm분ss초");
//        String dataStr = sdf.format(now);
//        System.out.println(dataStr);

        /*
         yyyy: 연도를 4자리로 표현
         yy : 연도를 2자리로 표현
         MM : 월을 2자리로 표현(반드시 대문자 소문자는 분으로 인식 minute)
         hh : 12시간제
         HH : 24시간제
         mm : 분을 표시
         W : 월에 몇번째 주
         w : 연에서 몇번 째 주


        */
        SimpleDateFormat f1,f2,f3,f4,f5,f6,f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년 MM월 dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날.");
        f7 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));


    }
}
