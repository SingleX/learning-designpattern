package net.singlex.designpattern.simplefactorypattern;

import net.singlex.designpattern.simplefactorypattern.service.HumanFactory;
import net.singlex.designpattern.simplefactorypattern.service.IHuman;
import net.singlex.designpattern.simplefactorypattern.service.impl.BlackHuman;
import net.singlex.designpattern.simplefactorypattern.service.impl.WhiteHuman;
import net.singlex.designpattern.simplefactorypattern.service.impl.YellowHuman;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Main {

    public static void main(String[] args) {
        IHuman human = HumanFactory.createHuman(WhiteHuman.class);
        human.laugh();

        IHuman human2 = HumanFactory.createHuman(BlackHuman.class);
        human2.laugh();

        IHuman human3 = HumanFactory.createHuman(YellowHuman.class);
        human3.laugh();
    }
}
