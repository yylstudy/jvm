package b.gc;

/**
 * VM����:
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
        //��һ�η���gc�ĵط�����ʱapplication2��������������½���application3��������
        application3 = new byte[_1MB*4];
        System.out.println("33333333");
        application3 = null;
        System.out.println("44444444");
        //�ڶ��η���gc�ĵط�
        application3 = new byte[_1MB*4];
        System.out.println("5555555");
        while(true){

        }

    }
    
}
