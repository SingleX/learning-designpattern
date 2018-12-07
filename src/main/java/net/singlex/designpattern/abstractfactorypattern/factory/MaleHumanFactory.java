package net.singlex.designpattern.abstractfactorypattern.factory;

import net.singlex.designpattern.abstractfactorypattern.service.IHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return createHuman(HumanEnum.YellowMaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() {
        return createHuman(HumanEnum.WhitewMaleHuman);
    }

    @Override
    public IHuman createBlackHuman() {
        return createHuman(HumanEnum.BlackwMaleHuman);
    }
}
