package com.thread.demo19_FIleFilter;

import com.sun.org.apache.bcel.internal.util.BCELifier;

import java.io.File;
import java.io.FileFilter;

/**
 * @author ChristineHu
 * @date 2020-07-15 8:59
 */
public class demo19_FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        return pathname.getName().toLowerCase().endsWith(".zip");
    }
}
