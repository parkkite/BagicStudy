package org.book.thisJava;

public class CH2_1 {
    public static void main(String[] args){
        CH2_1 ch2_1 = new CH2_1();
       // ch2_1.ByteExample();
       // ch2_1.GarbageValueExample();
        ch2_1.CastingExample();

    }

    //변수는 복수 개의 값을 저장 할 수 없다. 하나의 타입을 저장 할 수 있다.
    //*변수란 하나의 값을 저장할 수 있는 메모리 공간이다.
    //
    // int x, y, z 으로 선언 가능
    //*변수 이름은 메모리 주소에 붙여진 이름이다. 프로그램은 변수 이름을 통해서 메모리 주소에 접근하고 그곳에 값을 저장하거나 값을 읽는다.
    //변수 이름은 명명 규칙(naming convention)을 따라야 한다. *예약어를 변수 명으로 지정시 컴파일 에러 남*

    //변수의 사용
    //변수를 선언하고 처음값을 저장할 경우 저장한 값을 초기값이라 하고 그 행위를 변수의 초기화라고 한다.
    //초기값은 소스에서 직접 입력하는 경우가 많은데 직접 입력된 값을 리터럴(literal)이라고 한다.
    // ( \ )가 붙은 문자를 개행문자(이스케이프문자)라고 하고 특수한 용도로 사용된다.
    //* 변수는 초기화 되어야 읽기 가능, 초기화 안되면 읽기 불가능

    //데이터 타입
    //기본 타입 (primitive) 리터럴을 직접 저장하는 타입이다
    // 정수
    // byte  1byte 8bit
    public void ByteExample(){
        byte var1 =-128;
        byte var2 =-30;
        byte var3 =0;
        byte var4 =30;
        byte var5 =-127;
        byte var6 =-128;  //컴파일 에러

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);


    }


    // char  2byte 16bit
    //* 자바의 모든 문자는 유니코드로 처리한다.
    // 문자열로 저장하고 싶은 경우는 String으로 변수를 선언하고 ""로 감싸야 한다.

    public void CharExample(){
        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);


    }
    // * char 타입 변수를 문자를 대입하지 않고 초기화 시에는 아래처럼 해야한다.
    //char c = '';
    char cc = ' ';
    // short 2byte 16bit
    // int   4byte 32bit : 기본적인 정수연산은 int로 한다. byte/short는 메모리사용 크기가 작아서 메모리 범위가 초과되면 잘못된 결과를 얻기 쉽다.
    // * 저장할 수 있는 값의 범위를 초과하면 최솟값부터 반복 저장한다.
    // byte타입과 short타입을 +연산하면 int 타입으로 변환 후 연산된다. 결과 역시 int로 변환
    public void GarbageValueExample(){
        byte var1 = 125;
        int var2 = 125;

        for(int i = 0; i<5; i++){
            var1++;
            var2++;
            System.out.println("var1 :"+ var1 +"\t"+"var2 :"+ var2);
        }
    }
    public void IntExmple(){
        int var1 = 10;    //10진수로 저장
        int var2 = 012;//8진수로 저장
        int var3 = 0xA; //16진수로 저장

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }




    // long  8byte 64bit
    public void LongExample(){
        long var1 = 10;
        long var2 = 20L;
       // long var3 = 1000000000000; //컴파일 에러
        long var4 = 1000000000000L;
    }


    // 실수
    // float 4byte 32bit
    // double 8byte 64ibt
    // 논리
    // boolean 1byte 6bit


    //타입변환
    public void CastingExample(){
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }



}
