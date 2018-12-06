package net.singlex.designpattern.multitonpattern;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Emperor instance = Emperor.getInstance();
            System.out.print(instance);
            System.out.println("  " + instance.info());
        }
    }
}
