package com.functionInterface.demo01_FunctionInterface;

import com.functionInterface.demo01_FunctionInterface.MyFunctionInterface;

/**
 * @author ChristineHu
 * @date 2020-09-04 8:55
 */

public class MyFunctionInterfaceImpl implements MyFunctionInterface {
    @Override
    public void method() {
        System.out.println("函数式接口的实现类对对象");
    }
}
