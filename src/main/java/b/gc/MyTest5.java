package b.gc;

/**
 * VM参数:
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution -XX:+UseSerialGC
 * @Author: yyl
 * @Date: 2019/4/28 11:29
 */
public class MyTest5 {
    private static final int _1MB = 1024*1024;
    public static void main(String[] args){
        byte[] application1,application2,application3;
        application1 = new byte[_1MB/4];
        System.out.println("11111111");
        application2 = new byte[_1MB*4];
        System.out.println("22222222");
        //第一次发生gc的地方，此时application2对象在老年代，新建的application3在新生代
        application3 = new byte[_1MB*4];
        System.out.println("33333333");
        application3 = null;
        System.out.println("44444444");
        //第二次发生gc的地方
        application3 = new byte[_1MB*4];
        System.out.println("5555555");
        while(true){

        }

    }
    
}
