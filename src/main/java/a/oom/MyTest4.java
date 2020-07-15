package a.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * ������������ʱ���������
 * ��jdk 1.7���ϵİ汾�ǲ������ OutOfMemoryError PermGen space�����
 * vm arg: -XX:PermSize=10M -XX:MaxPermSize=10M
 * @Author: yyl
 * @Date: 2019/4/24 15:12
 */
public class MyTest4 {
    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        int i=0;
        while(true){
            Thread.sleep(1000);
            list.add(String.valueOf(i++).intern());
        }
    }
    
}
