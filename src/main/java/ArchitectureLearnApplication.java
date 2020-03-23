import pers.xy.architecture.learn.cglib.RunCglibTest;
import pers.xy.architecture.learn.jdkproxy.RunJdkProxyTest;
import pers.xy.architecture.learn.override.OverrideTestRun;

public class ArchitectureLearnApplication {
    public static void main(String[] args) {
        //RunJdkProxyTest.run();
        //OverrideTestRun.run();
        //RunCglibTest.run();
        //RunCglibTest.runCallBack();
        RunCglibTest.runFixed();
    }
}
