package 추상메소드;

public class SmartPhone extends Phone{

    SmartPhone(String name) {
        super(name);

    }

    @Override
    void call() {
        System.out.println("부모의 통화 기능을 구현합니다.");
    }
    @Override
    public void internet(){
        System.out.println("인터넷 기능을 만듭니다.");
        System.out.println(name);
    }
}
