package a.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * java ���ڴ����
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * ����������
 * -Xms20m:����java�ѵ���СֵΪ20M
 * -Xmx20m:����java�ѵ����ֵΪ20M   ����Ե����ֵ����Сֵ����Ϊһ�£���˵���˶Ѳ�����չ
 * -XX:+HeapDumpOnOutOfMemoryError: ������ڳ����ڴ�����쳣ʱDump����ǰ���ڴ��ת�������Ա��º���з���
 * @Author: yyl
 * @Date: 2019/4/22 11:19
 */
public class MyTest1 {
    static class OomObject{
        
    }
    public static void main(String[] args){
        List<OomObject> list = new ArrayList();
        while (true) {
            OomObject oomObject = new OomObject();
            list.add(oomObject);
        }
    }
    
}
