package net.singlex.designpattern.proxypattern;

import net.singlex.designpattern.proxypattern.proxy.ProxyMan;
import net.singlex.designpattern.proxypattern.service.impl.Panjinlian;

/**
 * Created by zhanhai on 2018/12/6.
 *
 * @author zhanhai
 * @date 2018/12/06
 */
public class Main {

    public static void main(String[] args) {
        /**
         * 代理类接活，被代理类干活
         */
        ProxyMan proxyMan = new ProxyMan(new Panjinlian());
        proxyMan.action1();
        proxyMan.action2();
    }
}
