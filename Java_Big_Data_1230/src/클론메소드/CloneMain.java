package 클론메소드;

public class CloneMain {
    public static void main(String[] args) {
        Member mem1= new Member("1234567","이태석","123123",30,true);
        Member mem2 = mem1.getMember();

        mem2.age = 300;
        mem2.name = "타이거";

        System.out.println("name : " + mem1.name);
        System.out.println("age : " + mem1.age);


        System.out.println("name : " + mem2.name);
        System.out.println("age : " + mem2.age);
    }
}
