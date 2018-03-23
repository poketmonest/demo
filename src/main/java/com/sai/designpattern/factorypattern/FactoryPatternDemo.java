/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.factorypattern;

import com.sai.designpattern.factorypattern.bean.Shape;
import com.sai.designpattern.factorypattern.factory.ShapeFactory;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();
    }
}
