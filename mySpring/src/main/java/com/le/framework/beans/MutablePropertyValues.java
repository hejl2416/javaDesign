package com.le.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 管理bean下的多个property标签
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList != null) {
            this.propertyValueList = propertyValueList;
        } else {
            this.propertyValueList = new ArrayList<>();
        }
    }

    public PropertyValue[] getPropertyValueList() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : this.propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) return propertyValue;
        }
        return null;
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return this.propertyValueList.iterator();
    }

    public boolean isEmpty() {
        return this.propertyValueList.isEmpty();
    }

    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        for (int i = 0; i < this.propertyValueList.size(); i++) {
            PropertyValue value = this.propertyValueList.get(i);
            if (value.getName().equals(propertyValue.getName())) {
                this.propertyValueList.set(i, new PropertyValue(propertyValue.getName(),
                        propertyValue.getRef(), propertyValue.getValue()));
                return this;
            }
        }
        this.propertyValueList.add(propertyValue);
        return this;
    }

    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }
}
