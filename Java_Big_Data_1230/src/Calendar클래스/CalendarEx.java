package Calendar클래스;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* Calendar 클래스는 추상클래스 이므로 객체 생성없이 사용,
날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이하기 때문.
정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간기준 정보를 가져옴.
포함된 필드도 전부 클래스변수

*/
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

//        System.out.println(now.get(Calendar.YEAR));
//        System.out.println(now.get(Calendar.MONTH)+1);
//        System.out.println(now.get(Calendar.DAY_OF_WEEK));
//        System.out.println(now.get(Calendar.DAY_OF_MONTH));
//        System.out.println(now.get(Calendar.AM_PM));
////        int  i = now.get(Calendar.YEAR);
//        if(i == 1){}

        // yyyy년 MM월dd일 HH시mm분ss초

        System.out.print(now.get(Calendar.YEAR) +"년" + (now.get(Calendar.MONTH)+1) + "월" + now.get(Calendar.DATE) + "일");
        System.out.print(now.get(Calendar.HOUR_OF_DAY) +"시" + (now.get(Calendar.MINUTE)) + "분" + now.get(Calendar.SECOND) + "초");

    }
}
