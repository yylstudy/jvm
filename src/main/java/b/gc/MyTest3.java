package b.gc;

/**
 * gc 说明
 * VM 参数：
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+UseSerialGC -XX:SurvivorRatio=8
 * 虚拟机参数说明：
 * -XX:+PrintGCDetails  发生gc时打印日志，并且在进程退出时输出当前内存各区域分配情况
 * -Xms20M:堆内存最小值
 * -Xmx20M:堆内存最大值
 * -Xmn10M:10M分配给新生代，剩下10M分配给老年代
 * -XX:SurvivorRatio=8:新生代中Eden区与一个Survivor的比例是8:1
 * -XX:UseSerialGC:表示jvm使用Serial+Serial Old的收集器组合进行gc
 * @Author: yyl
 * @Date: 2019/4/26 10:43
 */
public class MyTest3 {
    private static final int _1MB = 1024*1024;
    public static void main(String[] args){
        byte[] application1,application2,application3,application4;
        application1 = new byte[2*_1MB];
        application2 = new byte[2*_1MB];
        application3 = new byte[2*_1MB];
        application4 = new byte[4*_1MB];
    }
    
}
