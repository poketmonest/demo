/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.abstractfactorypattern.factory.beanfactory;

import com.sai.designpattern.abstractfactorypattern.bean.Color;
import com.sai.designpattern.abstractfactorypattern.bean.Shape;
import com.sai.designpattern.abstractfactorypattern.factory.AbstractFactory;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Blue;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Green;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Red;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
