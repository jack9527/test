package com.yx.base.util;

import java.util.ArrayList;
import java.util.HashMap;

import com.yx.base.parameter.Constants;
import com.yx.base.parameter.ResponseData;

public class YxUtil {

	public static void main(String args[]) {
		System.out.println(YxUtil.splitLong("").length);
		System.out.println(YxUtil.splitLong("11").length);
		System.out.println(YxUtil.splitLong("11,,66").length);
		System.out.println(YxUtil.splitLong("111,2121,23232,").length);
	}



	public static Long[] splitLong(String ids) {
		if (ids == null || ids.length() == 0) {
			return new Long[0];
		}
		if (ids.indexOf(",") == -1) {
			Long id[] = new Long[1];
			id[0] = Long.parseLong(ids);
			return id;
		} else {
			ArrayList<Long> list = new ArrayList<Long>();
			String[] idString = ids.split(",");
			for (String id : idString) {
				if (id != null && id.trim().length() > 0) {
					list.add(Long.parseLong(id));
				}
			}
			return list.toArray(new Long[list.size()]);
		}
	}

	public static String[] split(String ids) {
		if (ids == null || ids.length() == 0) {
			return new String[0];
		}
		if (ids.indexOf(",") == -1) {
			String id[] = new String[1];
			id[0] = ids;
			return id;
		} else {
			ArrayList<String> list = new ArrayList<String>();
			String[] idString = ids.split(",");
			for (String id : idString) {
				if (id != null && id.trim().length() > 0) {
					list.add(id);
				}
			}
			return list.toArray(new String[list.size()]);
		}
	}

	public static ResponseData createSuccessData(Object obj) {
		return getResponse(Constants.SUCCESS_CODE, obj);
	}
	
	public static ResponseData createSimpleSuccess(int code,Object succTipContent) {
		HashMap<String, Object> info = new HashMap<String, Object>();
		info.put("info", succTipContent);
		return getResponse(code, info);
	}

	public static ResponseData createSimpleSuccess(Object succTipContent) {
		HashMap<String, Object> info = new HashMap<String, Object>();
		info.put("info", succTipContent);
		return getResponse(Constants.SUCCESS_CODE, info);
	}

	public static ResponseData createFail(String failContent) {
		HashMap<String, Object> info = new HashMap<String, Object>();
		info.put("info", failContent);
		return getResponse(Constants.FAIL_CODE, info);
	}
	

	public static ResponseData getResponse(int code, Object content) {
		ResponseData data = new ResponseData();
		data.setCode(code);
		data.setData(content);
		return data;
	}
}
