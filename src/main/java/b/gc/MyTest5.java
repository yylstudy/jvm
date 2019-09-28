package b.gc;

/**
 * VM²ÎÊý: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution -XX:+UseSerialGC
 * 
 * @Author: yyl
 * @Date: 2019/4/28 11:29
 */
public class MyTest5 {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] application1, application2, application3;
        application1 = new byte[_1MB / 4];
        System.out.println("11111");
        application2 = new byte[_1MB * 4];
        System.out.println("22222");
        application3 = new byte[_1MB * 4];
        System.out.println("33333");
        application3 = null;
        application3 = new byte[_1MB * 4];
        System.out.println("44444");
    }

}
