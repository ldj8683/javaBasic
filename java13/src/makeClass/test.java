package makeClass;

public class test {
   //클래스이름을 대문자로 시작해야함.
   //낙타표기법을 지켜야함.
   
   
   //성질(속성,property, attribute)  => 멤버변수로 표현
   // 멤버변수는 선언만 해준다.!
   // 특정한 값을 넣지 않음
   // 멤버변수는 자동초기화됨.
   String color; //참조형은 무조건 null로 초기화
   int size; // 기본형은 0으로 초기화
   
   
   
   //동작(함수, 기능처리, 명령어)  => 메서드(method, 어떤 기능을 처리하기 위한 방법을 정의)로 표현
   public void on() {
      //함수이름은 소문자로 시작
      System.out.println("TV를 켜다");

   }
   public void off() {
      System.out.println("TV를 끄다");
      
   }
   public void ch() {
      System.out.println("TV채널을 바꾸다.");
      
   }
   
   
   
}