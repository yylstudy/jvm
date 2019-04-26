package b.gc;

/**
 * ����ж϶����Ƿ�������
 * ���ü����������������һ�����ü�������ÿ����һ������������ʱ����������ֵ�ͼ�1��������ʧЧʱ����������ֵ�ͼ�1��
 * �κ�ʱ�̣�������Ϊ0�Ķ�������������󣬵���jvm���ж϶����������㷨���ǲ������������ԭ�������ַ������ܽ������֮��
 * �໥���õ����⣬������ʾ��
 *
 * @Author: yyl
 * @Date: 2019/4/24 15:25
 */
public class MyTest1 {
    public Object instance = null;
    private static  final int _1MB=1024*1024;
    /**
     * �����Ա����Ψһ���þ���ռ���ڴ棬�Ա�����GC��־�п�����Ƿ񱻻��չ�
     */
    private byte[] bigSize = new byte[2*_1MB];
    public static void main(String[] args){
        MyTest1 obj1  = new MyTest1();
        MyTest1 obj2 = new MyTest1();
        obj1.instance = obj2;
        obj2.instance = obj1;
        obj1 = null;
        obj2 = null;
        //������ʱ����gc��obj1��obj2�ܷ񱻻���,�鿴jvm gc��־��֪��obj1��obj2�ѱ�����
        //��û����Ϊobj1��obj2�໥���þ��޷����գ���Ҳ˵����jvm���ǲ������ü��������ж϶����Ƿ����
        System.gc();
    }
    
}
