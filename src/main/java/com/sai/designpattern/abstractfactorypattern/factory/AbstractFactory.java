/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.abstractfactorypattern.factory;

import com.sai.designpattern.abstractfactorypattern.bean.Color;
import com.sai.designpattern.abstractfactorypattern.bean.Shape;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
