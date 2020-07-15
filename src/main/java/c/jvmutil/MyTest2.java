package c.jvmutil;

/**
 * ËÀËø¼à¿Ø
 * @Author: yyl
 * @Date: 2019/5/5 14:33
 */
public class MyTest2 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        new Thread(new MyThread(obj1,obj2)).start();
        new Thread(new MyThread(obj2,obj1)).start();
    }
    static class MyThread extends Thread{
        private Object obja;
        private Object objb;
        public MyThread(Object obja,Object objb){
            this.obja = obja;
            this.objb = objb;
        }
        @Override
        public void run() {
            try{
                synchronized (obja){
                    Thread.sleep(100);
                    synchronized (objb){

                    }
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
