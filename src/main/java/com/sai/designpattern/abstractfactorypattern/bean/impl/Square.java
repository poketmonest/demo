/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.abstractfactorypattern.bean.impl;


import com.sai.designpattern.abstractfactorypattern.bean.Shape;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
