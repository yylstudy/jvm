package b.gc;

/**
 * 如何判断对象是否死亡：
 * 引用计数法：给对象添加一个引用计数器，每当有一个对象引用它时，计数器的值就加1；当引用失效时，计数器的值就减1，
 * 任何时刻，计数器为0的对象就是死亡对象，但是jvm的判断对象死亡的算法不是采用这个方法，原因是这种方法不能解决对象之间
 * 相互引用的问题，下面是示例
 *
 * @Author: yyl
 * @Date: 2019/4/24 15:25
 */
public class MyTest1 {
    public Object instance = null;
    private static  final int _1MB=1024*1024;
    /**
     * 这个成员属性唯一作用就是占点内存，以便能在GC日志中看清楚是否被回收过
     */
    private byte[] bigSize = new byte[2*_1MB];
    public static void main(String[] args){
        MyTest1 obj1  = new MyTest1();
        MyTest1 obj2 = new MyTest1();
        obj1.instance = obj2;
        obj2.instance = obj1;
        obj1 = null;
        obj2 = null;
        //假设这时发生gc，obj1和obj2能否被回收,查看jvm gc日志可知，obj1和obj2已被回收
        //并没有因为obj1和obj2相互引用就无法回收，这也说明了jvm不是采用引用计数法来判断对象是否存活的
        System.gc();
    }
    
}
