package net.singlex.designpattern.abstractfactorypattern.factory;

import net.singlex.designpattern.abstractfactorypattern.service.IHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public interface HumanFactory {

    IHuman createYellowHuman();

    IHuman createWhiteHuman();

    IHuman createBlackHuman();
}
