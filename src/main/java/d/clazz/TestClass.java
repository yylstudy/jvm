package d.clazz;


/**
 * @Author: yyl
 * @Date: 2019/5/6 9:38
 */
public class TestClass {
    public static void main(String[] args){
        test1(new Function<Integer>(){
            @Override
            public void test1(Integer integer) {
                System.out.println("1111111111");
            }
        });
    }
    public static void test1(Function<Integer> function) {
        function.test1(1);
    }

}
interface Function<T> {
    public void test1(T t);
}
