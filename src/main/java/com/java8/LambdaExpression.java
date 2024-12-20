package com.java8;

public interface LambdaExpression {
  //  public String test(String s);
    void test();
    default void testMethod(){
       System.out.println("default");
    }

    public static void staticTest(){
        System.out.println("static");
    }
}
//()->{}
class Test{
    /*public static void main1(String[] args) {
        LambdaExpression i = (s)-> s.substring(2);
        String test = i.test("test");
        System.out.println(test);
    }*/
    public static void main(String[] args) {
        LambdaExpression l = () -> System.out.println("test");
          l.test();
          l.testMethod();
        LambdaExpression.staticTest();

    }

}