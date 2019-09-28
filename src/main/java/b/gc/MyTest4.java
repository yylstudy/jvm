package b.gc;

/**
 * gc ˵��
 * VM ������
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+UseSerialGC -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 * ���������˵����
 * -XX:+PrintGCDetails  ����gcʱ��ӡ��־
 * -Xms20M:���ڴ���Сֵ
 * -Xmx20M:���ڴ����ֵ
 * -Xmn10M:10M�������������ʣ��10M����������
 * -XX:SurvivorRatio=8:��������Eden����һ��Survivor�ı�����8:1
 * -XX:UseSerialGC:��ʾjvmʹ��Serial+Serial Old���ռ�����Ͻ���gc
 * @Author: yyl
 * @Date: 2019/4/26 10:43
 */
public class MyTest4 {
    private static final int _1MB = 1024*1024;
    public static void main(String[] args){
        byte[] application1,application2,application3,application4,application5,application6;
        application1 = new byte[2*_1MB];
        application2 = new byte[2*_1MB];
        application4 = new byte[7*_1MB];
        application3 = new byte[2*_1MB];
        application5 = new byte[2*_1MB];
    }
    
}
