package cn.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PackageUtil{

    // 加载包下面的所有类，并把类的全限定名返回
    public static List<String> GetClassNames(String packages){
        File file = new File(System.getProperty("user.dir") + "//src//" + packages.replace(".", "//"));
        List<String> classNames = new ArrayList<>();
        if (file.exists()){
            String[] list = file.list();
            for (String className : list){
                classNames.add(packages + "." + className.replace(".java", ""));
            }
        }
        return classNames;
    }
    
}