package cn.util;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class PackageUtil{

    /**
     * 
     * @param packages 包名
     * @return
     * @throws Exception 
     */
    public static List<String> GetClassNames(String packages) throws Exception{
    	Enumeration<URL> resources = getDefaultClassLoader().getResources(packages.replace(".", "/"));
    	List<String> className = new ArrayList<>();
    	while (resources.hasMoreElements()) {
			URL url = resources.nextElement();
			String protocol = url.getProtocol();
			if ("file".equals(protocol)) {
				String filePath = URLDecoder.decode(url.getFile(), "UTF-8");  
				File dir = new File(filePath);  
				// 如果不存在或者 也不是目录就直接返回  
				if (!dir.exists() || !dir.isDirectory()) {  
				  return null;  
				}
				File[] listFiles = dir.listFiles();
				for (File file : listFiles) {
					String name = file.getName();
					if (name.endsWith(".class")) {
						className.add(packages + "." + file.getName().replace(".class", ""));
					}
				}
			}
			if ("jar".equals(protocol)) {
				// TODO
			}
		}
    	return className;
    }
    
    /**
     * 获取ClassLoader
     * @return
     */
    public static ClassLoader getDefaultClassLoader() {
		ClassLoader cl = null;
		try {
			cl = Thread.currentThread().getContextClassLoader();
		}
		catch (Throwable ex) {
			// do nothing...
		}
		if (cl == null) {
			// do nothing...
			cl = PackageUtil.class.getClassLoader();
			if (cl == null) {
				// do nothing...
				try {
					cl = ClassLoader.getSystemClassLoader();
				}
				catch (Throwable ex) {
					// do nothing...
				}
			}
		}
		return cl;
	}
    
}