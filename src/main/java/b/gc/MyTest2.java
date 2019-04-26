package b.gc;

import com.sun.istack.internal.FinalArrayList;

/**
 * һ�ζ����������ȵ���ʾ��˵����������
 * 1����������ڱ�GCʱ��������
 * 2�������ԾȵĻ���ֻ��һ�Σ���Ϊһ�������finalize�������ֻ�ᱻϵͳ�Զ�����һ��
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
        //�����һ�γɹ������Լ�
        SAVE_HOOK = null;
        System.gc();
        //��Ϊfinalize���������̵߳����ȼ��ܵͣ�������ͣ0.5s�Եȴ���
        Thread.sleep(500);
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no i am dead");
        }
        //������δ�������������ȫһ�£���������Ծ�ȴʧ���ˣ�˵����һ�������finalize�������ֻ�ܱ�ϵͳ����һ��
        SAVE_HOOK = null;
        System.gc();
        if(SAVE_HOOK!=null){
            SAVE_HOOK.isAlive();
        }else{
            System.out.println("no i am dead");
        }

    }
    
    
}
