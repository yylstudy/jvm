package c.jvmutil;

/**
 * ËÀËø¼à¿Ø
 * @Author: yyl
 * @Date: 2019/5/5 14:33
 */
public class MyTest2 {
    static class SynAddRunnable implements Runnable{
        int a;
        int b;
        public SynAddRunnable(int a,int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)){
                try{
                    Thread.sleep(100);
                    synchronized (Integer.valueOf(b)){

                    }
                }catch (Exception e){

                }

            }
        }
    }
    public static void main(String[] args){
        new Thread(new SynAddRunnable(1,2)).start();
        new Thread(new SynAddRunnable(2,1)).start();
    }

}
