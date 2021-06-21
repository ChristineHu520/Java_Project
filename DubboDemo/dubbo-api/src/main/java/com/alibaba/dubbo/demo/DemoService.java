package com.alibaba.dubbo.demo;
import java.util.List;

/**
 * @author : ChristineHu
 * @Project: Java_Projects
 * @date Date : 2021年06月21日 16:43
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
