package net.singlex.designpattern.simplefactorypattern.service;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class HumanFactory {

    public static IHuman createHuman(Class clazz) {
        IHuman human = null;
        try {
            human = (IHuman)Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("createHuman catch exception.");
        }
        return human;
    }
}
