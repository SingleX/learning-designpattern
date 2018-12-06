package net.singlex.designpattern.singletonpattern.level1;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Emperor {

    /**
     * 静态内部类
     */
    private static class Holder {
        private static Emperor emperor = new Emperor();
    }

    private Emperor() {}

    public static Emperor getEmperor() {
        return Holder.emperor;
    }

    public void info() {
        System.out.println("emperor info");
    }
}