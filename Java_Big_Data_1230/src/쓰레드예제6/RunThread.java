package 쓰레드예제6;
//플래그를 이용한 종료 방법
public class RunThread extends Thread{
    private boolean stop;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run(){
        while(!stop){
            System.out.println("Thread 실행 중...");
        }

        System.out.println("자원 정리..");
        System.out.println("실행 종료");
    }
}
