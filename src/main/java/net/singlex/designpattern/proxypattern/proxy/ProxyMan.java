package net.singlex.designpattern.proxypattern.proxy;

import net.singlex.designpattern.proxypattern.service.KindWomen;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class ProxyMan implements KindWomen {

    private KindWomen kindWomen;

    public ProxyMan(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void action1() {
        this.kindWomen.action1();
    }

    @Override
    public void action2() {
        this.kindWomen.action2();
    }
}
