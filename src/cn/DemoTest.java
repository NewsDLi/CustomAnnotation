package cn;

import java.sql.SQLException;
import java.util.List;

import cn.util.CreatTable;
import cn.util.PackageUtil;

public class DemoTest{

    public static void main(String[] args) throws SQLException {
        String packages = "cn.model";
        List<String> getClassNames = PackageUtil.GetClassNames(packages);
        // 循环创建数据库表
        for (String className : getClassNames) {
            if (CreatTable.CrateTable(className)) {
                System.out.println("建表成功");
            }else{
                System.out.println("失败");
            }
        }
    }
}
