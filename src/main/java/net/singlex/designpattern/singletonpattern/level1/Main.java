package net.singlex.designpattern.singletonpattern.level1;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Main {

    public static void main(String[] args) {

        Emperor emperor;

        for (int i = 0; i < 10; i++) {
            emperor = Emperor.getEmperor();
            emperor.info();
            // 不管创建多少个，输出的内存地址信息都是一样的，说明是同一个对象
            System.out.println(emperor);
        }
    }
}
