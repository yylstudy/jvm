package a.oom;

/**
 * 多线程下
 * @Author: yyl
 * @Date: 2019/4/24 15:02
 */
public class MyTest3 {
    static class JavaVMStackOOM{
        private void dontStop(){
            while(true){

            }
        }
        public void stackLeakByThread(){
            while(true){
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        dontStop();
                    }
                });
                thread.start();
            }
        }
    }
    public static void main(String[] args){
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
    
}
