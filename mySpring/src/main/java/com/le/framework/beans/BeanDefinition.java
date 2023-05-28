package com.le.framework.beans;

/**
 * 定义bean标签类
 */
public class BeanDefinition {
    private String id;
    private String className;

    private MutablePropertyValues mutablePropertyValues;

    public BeanDefinition() {
        this.mutablePropertyValues = new MutablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValues getMutablePropertyValues() {
        return mutablePropertyValues;
    }

    public void setMutablePropertyValues(MutablePropertyValues mutablePropertyValues) {
        this.mutablePropertyValues = mutablePropertyValues;
    }
}
