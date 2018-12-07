package net.singlex.designpattern.abstractfactorypattern;

import net.singlex.designpattern.abstractfactorypattern.factory.FemaleHumanFactory;
import net.singlex.designpattern.abstractfactorypattern.factory.HumanFactory;
import net.singlex.designpattern.abstractfactorypattern.factory.MaleHumanFactory;
import net.singlex.designpattern.abstractfactorypattern.service.IHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class Main {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleHumanFactory();
        IHuman maleBlackHuman = maleHumanFactory.createBlackHuman();
        maleBlackHuman.action1();
        maleBlackHuman.action2();
        maleBlackHuman.action3();

        IHuman maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        IHuman maleYellowHuman = maleHumanFactory.createYellowHuman();

        HumanFactory femaleHumanFactory = new FemaleHumanFactory();
        femaleHumanFactory.createBlackHuman();
        femaleHumanFactory.createWhiteHuman();
        femaleHumanFactory.createYellowHuman();
    }
}
