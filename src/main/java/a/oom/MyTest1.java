package a.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * java 堆内存溢出
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 参数解析：
 * -Xms20m:设置java堆的最小值为20M
 * -Xmx20m:设置java堆的最大值为20M   如果对的最大值和最小值设置为一致，那说明此堆不可拓展
 * -XX:+HeapDumpOnOutOfMemoryError: 虚拟机在出现内存溢出异常时Dump出当前的内存堆转储快照以便事后进行分析
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
