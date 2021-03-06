/**
 * 源程序名称：KeyValueBlock.java
 * 软件著作权：恒生电子股份有限公司 版权所有
 * 系统名称：JRES Studio
 * 模块名称：com.hundsun.ares.studio.biz.core
 * 功能说明：$desc
 * 相关文档：
 * 作者：sundl
 */
package com.hundsun.ares.studio.biz.excel.export;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sundl
 *
 */
public class KeyValueBlock extends Block {

	public class KeyValue {
		public String key;
		public String value;
		/** value占有几个单元格，单元格会合并处理 */
		public int span = 1;
		
		public KeyValue(String key, String value) {
			this.key = key;
			this.value = value;
		}
		
		public KeyValue(String key, String value, int span) {
			this.key = key;
			this.value = value;
			this.span = span;
		}
	}
	
	/** 每行几个属性,默认为3; */
	public int propertyPerLine = 3;
	public List<KeyValue> kvList = new ArrayList<KeyValueBlock.KeyValue>();
	
	public void addKeyValue(String key, String value) {
		this.kvList.add(new KeyValue(key, value));
	}
	
	public void addKeyValue(String key, String value, int span) {
		this.kvList.add(new KeyValue(key, value, span));
	}
	
}
