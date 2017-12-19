package net.zhang.dubbo.test.provider;

import net.zhang.dubbo.test.api.DemoService;

/**
 * @author Administrator
 * @date 2017/12/11
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
