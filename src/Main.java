//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    //if
    public static String ifTest(int num){
        String result = "";
        if(num > 0){
            result = "양수";
        }else if(num == 0){
            result = "0";
        }else{
            result = "음수";
        }

        return result;
    }

    //switch
    public static String switchTest(int num){
        String result = "";

        switch (num){
            case 1 :
                result = "월";
                break;
            case 2 :
                result = "화";
                break;
            case 3 :
                result = "수";
                break;
            default:
                result = "기타";
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 10;
//        int y = 5;

        System.out.println("if문 : " + ifTest(x));
        System.out.println("switch문 : " + switchTest(2));

//
//        int a = x + y; //더하기
//        int b = x - y; //빼기
//        int c = x * y; //곱하기
//        int d =  x/y; //나누기
//        int e =  x + 3; //대입 연산자
//        boolean f = x == 10; // 비교 연산자
//        boolean g = x > y; //논리 연산자
//        int h = x++; //증감 연산자
//        String i = (x > 2) ? "A" : "B"; //삼항 연산자
//
//        System.out.println("더하기 : " + a);
//        System.out.println("빼기 : " + b);
//        System.out.println("곱하기 : " + c);
//        System.out.println("나누기 : " + d);
//        System.out.println("대입 연산자 : " + e);
//        System.out.println("비교 연산자 : " + f);
//        System.out.println("논리 연산자 : " + g);
//        System.out.println("증감 연산자 : " + h);
//        System.out.println("삼항 연산자 : " + i);


//        //for
//        for(int n = 0; n < 5; n++){
//            System.out.println("for문 : " + n);
//        }
//
//        //while
//        int count = 3;
//
//        while (count > 0){
//            System.out.println("while문" + count);
//            count--;
//        }
//
//        //do-while
//        int testNum = 0;
//        do {
//            System.out.println("do while문" + testNum);
//            testNum++;
//        }while (testNum < 3);
    }
}