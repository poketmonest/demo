/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.abstractfactorypattern.factory.beanfactory;

import com.sai.designpattern.abstractfactorypattern.bean.Color;
import com.sai.designpattern.abstractfactorypattern.bean.Shape;
import com.sai.designpattern.abstractfactorypattern.factory.AbstractFactory;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Circle;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Rectangle;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Square;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
