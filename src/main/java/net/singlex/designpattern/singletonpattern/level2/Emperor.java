package net.singlex.designpattern.singletonpattern.level2;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Emperor {

    private static volatile Emperor emperor;

    /**
     * 干掉构造函数
     */
    private Emperor() {
    }

    /**
     * 双重检查锁 DCL（内存可见性，禁止指令重排序（jdk1.5以后才能正确工作））
     *
     * @return
     */
    public static Emperor getInstance() {
        if (emperor == null) {
            synchronized (Emperor.class) {
                if (emperor == null) {
                    emperor = new Emperor();
                }
            }
        }
        return emperor;
    }

    public void info() {
        System.out.println("emperor info");
    }
}
