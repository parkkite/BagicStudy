package org.book.thisJava.ch01;

public class Ch1_1 {


        //자바란
        //1. 이식성이 높은 언어이다.
        //-> 어떤 OS든 JRE(java Runtime Environment)만 있다면 실행이 가능하다.
        //2. 객체 지향 언어이다.
        //-> 객체를 먼저 만들고 하나씩 조립해서 만드는 기법인 객체  지향 프로그래밍(OOP : Object Oriented Programming)을 사용한다.
        //-> 99,9% 객체 지향언어이다 (이유?)
        //3. 함수적 스타일 코딩 지원
        //-> 자바8버전부터 함수적 코딩을 지원한다.
        //4. 메모리를 자동으로 관리한다.
        //-> 다른 언어와 달리 자바는 garbage collector를 실행시켜 사용하지 않는 객체를 메모리에서 제거한다.
        //5. 다양한 어플리케이션 개발 가능
        //-> 다양한 운영체제에서 사용 가능한 프로그램을 개발할 수 있다.
        // * javaSE(standard Edition)은 JVM + 개발 필수 도구 + API를 정의한 것
        //      클라이언트와 서버 프로그램 상관없이 개발하고 실행하려면 JDK를 설치
        //*  javaEE(Enterprise EDition)은 서버용 애플리케이션 개발을 위한 도구및 라이브러리 제공
        //     servlet/jsp을 이요한 웹어플리케이션 /EJB / XML 등이 있다.
        //6. 멀티 스레드를 쉽게 구현
        //7. 동적 로딩을 지원한다.
        //8. 막강한 오픈소스 라이브러리가 풍부하다.

        //JDK
        // 자바는 완전한 기계어가 아님 바이트코드다 그래서 해석이 필요한데 그것을 JVM(Java Virtual Machine)이 해준다.
        // JVM은 운영체제에 종속적이다.
        // 소스파일(*.java) -> (컴파일러 javac.exe가 컴파일) -> 바이트 코드 파일(*.class) > OS에 맞게 JVM(java.exe) 구동
        // 바이트 코드는 하나지만 운영체제에 맞게 번역되는 기계어는 달라진다.
        // 한번에 기계어가 번역되는 것이 아닌 JVM을 거쳐 번역되고 실행되어 C/C++ 보다 느리지만 JIT컴파일러를 통해 격차가 많이줄어들었다.

        // JRE = JVM + 표준클래스 라이브러리
        // JDK = JRE + 개발에 필요한 도구
        // Path에 bin위치 등록해야 사용가능

        //*컴파일
        //파일명(앞글자 대문자)과 클래스 명(앞글자 소문자)이 다르면 컴파일 에러
        //파일명(앞글자 소문자)과 클래스 명(앞글자 대문자)이 다르면 에러 x

        //* java.exe가 실행되면 메모리를 로드 -> 최적의 기계어로 번역 -> main()메소드를 찾아 실행




}