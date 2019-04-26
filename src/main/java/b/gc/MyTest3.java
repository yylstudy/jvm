package b.gc;

/**
 * 33.125：[GC[DefNew：3324K-＞152K（3712K），0.0025925 secs]3324K-＞152K（11904K），0.0031680 secs]
 * 1 0 0.6 6 7：[F u l l G C[T e n u r e d：0 K-＞2 1 0 K（1 0 2 4 0 K），0.0 1 4 9 1 4 2 s e c s]4603K-＞210K（19456K），
 * [Perm：2999K-＞2999K（21248K）]，0.0150007 secs][Times：user=0.01 sys=0.00，real=0.02 secs]
 *
 * [Full GC 283.736：[ParNew：261599K-＞261599K（261952K），0.0000288 secs]
 *
 *最前面的数字“33.125：”和“100.667：”代表了GC发生的时间，这个数字的含义是从Java
 * 虚拟机启动以来经过的秒数。
 * GC日志开头的“[GC”和“[Full  GC”说明了这次垃圾收集的停顿类型，而不是用来区分新
 * 生代GC还是老年代GC的。如果有“Full”，说明这次GC是发生了Stop-The-World的，例如下面
 * 这段新生代收集器ParNew的日志也会出现“[Full GC”（这一般是因为出现了分配担保失败之
 * 类的问题，所以才导致STW）。如果是调用System.gc（）方法所触发的收集，那么在这里将
 * 显示“[Full GC（System）”。
 * 接下来的“[DefNew”、“[Tenured”、“[Perm”表示GC发生的区域，这里显示的区域名称与
 * 使用的GC收集器是密切相关的，例如上面样例所使用的Serial收集器中的新生代名为“Default
 * New  Generation”，所以显示的是“[DefNew”。如果是ParNew收集器，新生代名称就会变
 * 为“[ParNew”，意为“Parallel New Generation”。如果采用Parallel Scavenge收集器，那它配套
 * 的新生代称为“PSYoungGen”，老年代和永久代同理，名称也是由收集器决定的。
 * 后面方括号内部的“3324K-＞152K（3712K）”含义是“GC前该内存区域已使用容量-＞
 * GC后该内存区域已使用容量（该内存区域总容量）”。而在方括号之外的“3324K-＞
 * 152K（11904K）”表示“GC前Java堆已使用容量-＞GC后Java堆已使用容量（Java堆总容
 * 量）”。
 * 再往后，“0.0025925 secs”表示该内存区域GC所占用的时间，单位是秒。有的收集器会
 * 给出更具体的时间数据，如“[Times：user=0.01 sys=0.00，real=0.02 secs]”，这里面的user、
 * sys和real与Linux的time命令所输出的时间含义一致，分别代表用户态消耗的CPU时间、内核
 * 态消耗的CPU事件和操作从开始到结束所经过的墙钟时间（Wall Clock Time）。CPU时间与
 * 墙钟时间的区别是，墙钟时间包括各种非运算的等待耗时，例如等待磁盘I/O、等待线程阻
 * 塞，而CPU时间不包括这些耗时，但当系统有多CPU或者多核的话，多线程操作会叠加这些
 * CPU时间，所以读者看到user或sys时间超过real时间是完全正常的。
 * @Author: yyl
 * @Date: 2019/4/26 10:43
 */
public class MyTest3 {
}
