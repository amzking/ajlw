package com.ccue.ajlw.utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
/**
 * properties文件读写工具
 * @author chen
 *
 */
public class PropertyUtil {
	//默认配置项
	private final static String default_properties = "filed.properties";
	
	private static PropertiesConfiguration propertiesConfiguration;

	private static volatile PropertyUtil util;

	private PropertyUtil() { }

	public static synchronized PropertyUtil getInstance() {
	    if (util == null) {
			try {
				String filePath = PropertyUtil.class.getClassLoader().getResource(default_properties).getPath().replaceFirst("/", "");
				propertiesConfiguration = new PropertiesConfiguration(filePath);
				//开启当文件被修改时自动刷新
				propertiesConfiguration.setReloadingStrategy(new FileChangedReloadingStrategy());
				//开启修改Properties时自动保存
				propertiesConfiguration.setAutoSave(true);
			} catch (ConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("初始化配置文件失败！");
			}
			// 当文件的内容发生改变时，配置对象也会刷新
	    }
	    return util;
	}
}
