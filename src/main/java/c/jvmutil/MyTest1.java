//package c.jvmutil;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
///**
// * 线程监控
// * @Author: yyl
// * @Date: 2019/4/29 10:47
// */
//public class MyTest1 {
//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        br.readLine();
//        //线程死循环
//        createBusyThread();
//        br.readLine();
//        Object obj = new Object();
//        //线程锁等待演示
//        createLockThread(obj);
//    }
//    public static void  createBusyThread(){
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//
//                }
//            }
//        },"testBusyThread");
//        thread.start();
//    }
//    public static void createLockThread(Object lock){
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (lock){
//                    try{
//                        lock.wait();
//                    }catch (Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }
//        },"testLockThread");
//        thread.start();
//    }
//
//}
