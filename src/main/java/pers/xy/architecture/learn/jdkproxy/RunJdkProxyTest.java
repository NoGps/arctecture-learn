package pers.xy.architecture.learn.jdkproxy;

public class RunJdkProxyTest {
    public static void run(){
        TestProxy proxy = new TestProxy(new TestImpl());
        Test test = proxy.getProxy();
        test.test();
    }
}
