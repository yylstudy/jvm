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
 * -XX:PretenureSizeThreshold=3145728: ���ڸ�ֵ�Ķ���ֱ�������������
 * @Author: yyl
 * @Date: 2019/4/26 10:43
 */
public class MyTest4 {
    public static void main(String[] args){
        byte[] application1 = new byte[4*1024*1024];
    }
    
}
