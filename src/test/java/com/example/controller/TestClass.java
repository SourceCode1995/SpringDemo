package com.example.controller;

import org.junit.Test;

import java.io.File;

public class TestClass {
    @Test
    public void deleteFile(){
        String path = "E:\\开发资料\\01、Java最新V13课程【2022官网在售就业班】";
        File file = new File(path);
        fun(file);
    }

    private void fun(File file){
        for (File listFile : file.listFiles()) {
            if(listFile.isDirectory()){
                fun(listFile);
            }else{
                String name = listFile.getName();
                String nameWithoutIndex;
                if(name.lastIndexOf(".")!=-1){
                    nameWithoutIndex = name.substring(0,name.lastIndexOf("."));
                    if (nameWithoutIndex.endsWith("(1)")){
                        listFile.delete();
                    }
                }else{
                    continue;
                }

            }
        }

    }
}
