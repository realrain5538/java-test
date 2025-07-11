//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

//        System.out.println("if문 : " + ifTest(x));
//        System.out.println("switch문 : " + switchTest(2));
//        forTest();
//        whileTest(y);
        arrTest();
    }

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

    //for
    public static void forTest(){
        for(int n = 0; n < 5; n++){
            System.out.println("for문 : " + n);
        }
    }

    //while
    public static void whileTest(int num){

        while (num > 0){
            System.out.println("while문" + num);
            num--;
        }
    }

    //array
    public static void arrTest(){
        int[] numArr = {1,2,3,4,5};

        for(int i = 0; i < numArr.length; i++){
            System.out.println("배열 : " + numArr[i]);
        }
    }
}