/**
* <p>Copyright: Copyright (c) 2013</p>
* <p>Company: 恒生电子股份有限公司</p>
*/
package com.hundsun.ares.studio.procedure.compiler.skeleton.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hundsun.ares.studio.engin.token.IParamDefineHelper;

/**
 * @author qinyuan
 *
 */
public class ParamDefineHelper implements IParamDefineHelper{


	
	Map<Integer, List<String>> paraMap = new HashMap<Integer, List<String>>();

	public void addInit(int type,String paraName){
		String realName = paraName.trim();
		if(!paraMap.containsKey(type)){
			paraMap.put(type, new ArrayList<String>());
		}
		if(!paraMap.get(type).contains(realName)){
			paraMap.get(type).add(realName);
		}
		paraMap.get(type).add(realName);
	}

	/* (non-Javadoc)
	 * @see com.hundsun.ares.studio.engin.token.IParamDefineHelper#canInit(int, java.lang.String)
	 */
	@Override
	public boolean canInit(int type, String paraName) {
		String realName = paraName.trim();
		if(paraMap.get(type)==null){
			return true;
		}
		return !paraMap.get(type).contains(realName);
	}
	
}
