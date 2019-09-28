package c.jvmutil;

/**
 * @Author: yyl
 * @Date: 2019/5/5 15:22
 */
public class MyTest4 {
    public static void main(String[] args) {
        Super su = new Son();
        su.test1();
    }

    static class Super {
        protected static String ss = "aa";

        public void test1() {
            System.out.println(ss);
        }
    }

    static class Son extends Super {
        static {
            ss = "ff";
        }
    }

}
