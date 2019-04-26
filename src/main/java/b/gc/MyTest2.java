package b.gc;

import com.sun.istack.internal.FinalArrayList;

/**
 * 一次对象自我拯救的演示，说明两点问题
 * 1）对象可以在被GC时自我拯救
 * 2）这种自救的机会只有一次，因为一个对象的finalize方法最多只会被系统自动调用一次
 * @Author: yyl
 * @Date: 2019/4/24 15:58
 */
public class MyTest2 {
    public static MyTest2 SAVE_HOOK = null;
    public void isAlive(){
        System.out.println("yes i am still alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method execute");
        MyTest2.SAVE_HOOK = this;
    }
    public static void main(String[] args) throws Exception{
        SAVE_HOOK = new MyTest2();
        //对象第一次成功拯救自己
        SAVE_HOOK = null;
        System.gc();
        //因为finalize方法所在线程的优先级很低，所以暂停0.5s以等待它
        Thread.sleep(500);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no i am dead");
        }
        //下面这段代码和上面代码完全一致，但是这次自救却失败了，说明了一个对象的finalize方法最多只能被系统调用一次
        SAVE_HOOK = null;
        System.gc();
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no i am dead");
        }

    }
    
    
}
