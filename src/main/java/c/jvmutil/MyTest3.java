package c.jvmutil;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * BTrace��̬��־׷��
 * tomcat�ж�̬���Ӵ�����Բ鿴spring5 ��Ŀ��MyController.test1()
 * @Author: yyl
 * @Date: 2019/5/5 14:40
 */
public class MyTest3 {
    //Btrace��̬�������´��� ���ڴ�ӡadd��������κͷ��ؽ��
//    import com.sun.btrace.annotations.*;
//    import static com.sun.btrace.BTraceUtils.*;
//    @BTrace
//    public class TracingScript {
//        @OnMethod(clazz="c.jvmutil.MyTest3",method="add",location=@Location(Kind.RETURN))
//        public static void func(@Self c.jvmutil.MyTest3 instance,int a,int b,@Return int result){
//            println("���ö�ջ��");
//            jstack();
//            println(strcat("��������a:",str(a)));
//            println(strcat("��������b:",str(a)));+

//            println(strcat("�������:",str(result)));
//        }
//    }

    public static void main(String[] args) throws Exception{
        MyTest3 myTest3 = new MyTest3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++){
            br.readLine();
            int a = (int)Math.round(Math.random()*1000);
            int c = (int)Math.round(Math.random()*1000);
            System.out.println(myTest3.add(a,c));
        }
    }

    public int add(int a,int b){
        return a+b;
    }

}
