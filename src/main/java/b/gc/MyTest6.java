package b.gc;

import java.util.ArrayList;
import java.util.List;

/**
 * ÄÚ´æ¼à¿Ø
 * VM ²ÎÊý:
 * -Xms100M -Xmx100M -XX:+UseSerialGC
 * @Author: yyl
 * @Date: 2019/4/29 10:30
 */
public class MyTest6 {
    static class OOMObject{
        private byte[] placeHolder = new byte[64*1024];
    }
    public static void main(String[] args) throws Exception{
        fillHeap(1000);
        System.gc();
    }
    public static void fillHeap(int num) throws Exception{
        List<OOMObject> list = new ArrayList();
        for(int i=0;i<num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }

    }

}
