//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        int a = x + y; //더하기
        int b = x - y; //빼기
        int c = x * y; //곱하기
        int d =  x/y; //나누기
        int e =  x + 3; //대입 연산자
        boolean f = x > y; //논리 연산자

        System.out.println("더하기 : " + a);
        System.out.println("빼기 : " + b);
        System.out.println("곱하기 : " + c);
        System.out.println("나누기 : " + d);
        System.out.println("대입 연산자 : " + e);
        System.out.println(x == 10); // 비교 연산자

    }
}