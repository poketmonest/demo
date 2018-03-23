/**
 * Copyright 2017-2025 Evergrande Group.
 */
package com.sai.designpattern.abstractfactorypattern.bean.impl;

import com.sai.designpattern.abstractfactorypattern.bean.Color;

/**
 * description
 *
 * @author bozhicheng
 * @since 2018-03-23
 */
public class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
