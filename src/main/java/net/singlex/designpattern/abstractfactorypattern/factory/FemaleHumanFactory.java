package net.singlex.designpattern.abstractfactorypattern.factory;

import net.singlex.designpattern.abstractfactorypattern.service.IHuman;

/**
 * Created by zhanhai on 2018/12/7.
 *
 * @author zhanhai
 * @date 2018/12/07
 */
public class FemaleHumanFactory extends AbstractHumanFactory {
    @Override
    public IHuman createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    @Override
    public IHuman createWhiteHuman() {
        return super.createHuman(HumanEnum.WhitewFemaleHuman);
    }

    @Override
    public IHuman createBlackHuman() {
        return super.createHuman(HumanEnum.BlackwFemaleHuman);
    }
}
