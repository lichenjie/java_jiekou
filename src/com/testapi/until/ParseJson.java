/**
 * 解析json返回参数
 */
package com.testapi.until;
import com.google.gson.Gson;
/**
 * @author lileilei
 *
 */
public class ParseJson {
	/*
	 *解析返回的json ֵ
	 */
	public static String Json(String jsStrings) {
		String result;
		if(jsStrings==null) {
			result=null;
			return result ;
		}try {
			Gson gson=new Gson();
			Json json=gson.fromJson(jsStrings, Json.class);
			result=json.code;
			return result ;
		} catch (Exception e) {
			// TODO: handle exception
			result=null;
			return result ;
		}
	}
}
