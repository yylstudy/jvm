package a.oom;

/**
 * ���߳��� java �����ջ�ͱ��ط���ջ���
 * @Author: yyl
 * @Date: 2019/4/24 14:20
 */
public class MyTest2 {
    static class JavaVMStackSOF{
        private int stackLength=1;
        public void stackLeak(){
            stackLength++;
            stackLeak();
        }
    }
    public static void main(String[] args){
        JavaVMStackSOF sof = new JavaVMStackSOF();
        try{
            sof.stackLeak();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("stack length:"+sof.stackLength);
        }
    }
    
}
