package b.gc;

/**
 * 33.125��[GC[DefNew��3324K-��152K��3712K����0.0025925 secs]3324K-��152K��11904K����0.0031680 secs]
 * 1 0 0.6 6 7��[F u l l G C[T e n u r e d��0 K-��2 1 0 K��1 0 2 4 0 K����0.0 1 4 9 1 4 2 s e c s]4603K-��210K��19456K����
 * [Perm��2999K-��2999K��21248K��]��0.0150007 secs][Times��user=0.01 sys=0.00��real=0.02 secs]
 *
 * [Full GC 283.736��[ParNew��261599K-��261599K��261952K����0.0000288 secs]
 *
 *��ǰ������֡�33.125�����͡�100.667����������GC������ʱ�䣬������ֵĺ����Ǵ�Java
 * �������������������������
 * GC��־��ͷ�ġ�[GC���͡�[Full  GC��˵������������ռ���ͣ�����ͣ�����������������
 * ����GC���������GC�ġ�����С�Full����˵�����GC�Ƿ�����Stop-The-World�ģ���������
 * ����������ռ���ParNew����־Ҳ����֡�[Full GC������һ������Ϊ�����˷��䵣��ʧ��֮
 * ������⣬���Բŵ���STW��������ǵ���System.gc�����������������ռ�����ô�����ｫ
 * ��ʾ��[Full GC��System������
 * �������ġ�[DefNew������[Tenured������[Perm����ʾGC����������������ʾ������������
 * ʹ�õ�GC�ռ�����������صģ���������������ʹ�õ�Serial�ռ����е���������Ϊ��Default
 * New  Generation����������ʾ���ǡ�[DefNew���������ParNew�ռ��������������ƾͻ��
 * Ϊ��[ParNew������Ϊ��Parallel New Generation�����������Parallel Scavenge�ռ�������������
 * ����������Ϊ��PSYoungGen��������������ô�ͬ��������Ҳ�����ռ��������ġ�
 * ���淽�����ڲ��ġ�3324K-��152K��3712K���������ǡ�GCǰ���ڴ�������ʹ������-��
 * GC����ڴ�������ʹ�����������ڴ��������������������ڷ�����֮��ġ�3324K-��
 * 152K��11904K������ʾ��GCǰJava����ʹ������-��GC��Java����ʹ��������Java������
 * ��������
 * �����󣬡�0.0025925 secs����ʾ���ڴ�����GC��ռ�õ�ʱ�䣬��λ���롣�е��ռ�����
 * �����������ʱ�����ݣ��硰[Times��user=0.01 sys=0.00��real=0.02 secs]�����������user��
 * sys��real��Linux��time�����������ʱ�京��һ�£��ֱ�����û�̬���ĵ�CPUʱ�䡢�ں�
 * ̬���ĵ�CPU�¼��Ͳ����ӿ�ʼ��������������ǽ��ʱ�䣨Wall Clock Time����CPUʱ����
 * ǽ��ʱ��������ǣ�ǽ��ʱ��������ַ�����ĵȴ���ʱ������ȴ�����I/O���ȴ��߳���
 * ������CPUʱ�䲻������Щ��ʱ������ϵͳ�ж�CPU���߶�˵Ļ������̲߳����������Щ
 * CPUʱ�䣬���Զ��߿���user��sysʱ�䳬��realʱ������ȫ�����ġ�
 * @Author: yyl
 * @Date: 2019/4/26 10:43
 */
public class MyTest3 {
}