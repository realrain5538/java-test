package org.example;

public class Calculate {
    private int num1;
    private int num2;

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }

    //덧셈
    public static int sum(int a, int b){
        int result = 0;

        result = a + b;

        return result;
    }

    //빼기
    public static int sub(int a, int b){
        int result = 0;
        result = a-b;
        return result;
    }

    //곱하기
    public static int mul(int a, int b){
        int result = 0;
        result = a * b;

        return result;
    }

    //나누기
    public static int div(int a, int b){
        int result = 0;
        result = a/b;

        return result;
    }

    public static void main(String[] args){
        Calculate cal = new Calculate();
        cal.setNum1(10);
        cal.setNum2(5);

        System.out.println("덧셈 : " + sum(cal.getNum1(), cal.getNum2()));
        System.out.println("빼기 : " + sub(cal.getNum1(), cal.getNum2()));
        System.out.println("곱하기 : " + mul(cal.getNum1(), cal.getNum2()));
        System.out.println("나누기 : " + div(cal.getNum1(), cal.getNum2()));
    }
}
