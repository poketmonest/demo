/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.abstractfactorypattern.producer;

import com.sai.designpattern.abstractfactorypattern.factory.AbstractFactory;
import com.sai.designpattern.abstractfactorypattern.factory.beanfactory.ColorFactory;
import com.sai.designpattern.abstractfactorypattern.factory.beanfactory.ShapeFactory;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
