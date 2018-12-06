package net.singlex.designpattern.singletonpattern.level2;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Emperor emperor = Emperor.getInstance();
            emperor.info();
            System.out.println(emperor);
        }
    }
}
