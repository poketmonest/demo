/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.factorypattern.factory;

import com.sai.designpattern.factorypattern.bean.Shape;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Circle;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Rectangle;
import com.sai.designpattern.abstractfactorypattern.bean.impl.Square;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
