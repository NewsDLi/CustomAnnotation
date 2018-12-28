package cn;

import java.util.List;

import cn.util.CreatTable;
import cn.util.PackageUtil;

public class DemoTest{

    public static void main(String[] args) throws Exception {
        // 要建的表的注释所在的包名
        String packages = "cn.model";
        List<String> getClassNames = PackageUtil.GetClassNames(packages);
        // 循环创建数据库表
        for (String className : getClassNames) {
            System.out.println(className);
            if (CreatTable.CrateTable(className)) {
                System.out.println("建表成功");
            }
        }
    }
    
}
