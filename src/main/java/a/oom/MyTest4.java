package a.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法区和运行时常量池溢出
 * 在jdk 1.7以上的版本是不会出现 OutOfMemoryError PermGen space错误的
 * @Author: yyl
 * @Date: 2019/4/24 15:12
 */
public class MyTest4 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        int i=0;
        while(true){
            list.add(String.valueOf(i++).intern());
        }
    }
    
}
