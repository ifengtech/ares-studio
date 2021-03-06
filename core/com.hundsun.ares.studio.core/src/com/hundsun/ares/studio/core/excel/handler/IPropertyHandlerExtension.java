/**
 * 源程序名称：IPropertyHandlerExtension.java
 * 软件著作权：恒生电子股份有限公司 版权所有
 * 系统名称：JRES Studio
 * 模块名称：com.hundsun.ares.studio.biz.core
 * 功能说明：$desc
 * 相关文档：
 * 作者：sundl
 */
package com.hundsun.ares.studio.core.excel.handler;

import com.hundsun.ares.studio.core.IARESProject;
import com.hundsun.ares.studio.core.excel.SheetParser;

/**
 * @author sundl
 *
 */
public interface IPropertyHandlerExtension {

	void init(SheetParser sheetParser, IARESProject project);
	
}
