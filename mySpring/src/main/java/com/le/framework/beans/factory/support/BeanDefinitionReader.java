package com.le.framework.beans.factory.support;

/**
 * 解析配置文件的接口
 */
public interface BeanDefinitionReader {
    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    //加载配置文件并在注册表中进行注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
