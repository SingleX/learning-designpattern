package net.singlex.designpattern.abstractfactorypattern.service;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public abstract class AbstractBlackHuman implements IHuman {

    @Override
    public void action1() {
        System.out.println("abstract black human do action1.");
    }

    @Override
    public void action2() {
        System.out.println("abstract black human do action2.");
    }
}
