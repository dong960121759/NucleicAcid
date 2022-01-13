package com.julong.nucleicacid.utils;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AgeUtil implements Serializable{
	
	private AgeUtil(){
		
	}

	/**
	 * 根据身份证号计算病人的一些信息
	 * @param idNo
	 * @return map 	键:sex		值:Long 性别
	 * 				键:birthday	值:Date	出生日期
	 * 				键:age		值:Long 年龄
	 */
	public static Map getPatientInfoByIdNo(String idNo){
		Map map = new HashMap();
		Long sex = null;
		Date birthday = null;
		Long age = null;
		if(idNo.length() == 15){
			if(idNo.substring(14,15).equals("1")){
				sex = new Long(1);
			}else{
				sex = new Long(2);
			}
			String birthdaystr = "19" + idNo.substring(6,8) + "." + idNo.substring(8,10) + "." + idNo.substring(10,12);

			try {
				birthday = new SimpleDateFormat("yyyy.MM.dd").parse(birthdaystr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(birthday != null){
				String ageStr = computerAge(null,birthday);
				age = intAge(ageStr);
			}
		}else if(idNo.length() == 18){
			if(idNo.substring(16,17).equals("1")){
				sex = new Long(1);
			}else{
				sex = new Long(2);
			}
			String birthdaystr = idNo.substring(6,10)  + "." + idNo.substring(10,12) + "." + idNo.substring(12,14);

			try {
				birthday = new SimpleDateFormat("yyyy.MM.dd").parse(birthdaystr);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(birthday != null){
				String ageStr = computerAge(null,birthday);
				age = intAge(ageStr);
			}
		}
		map.put("sex", sex);
		map.put("birthday", birthday);
		map.put("age", age);
		return map;
	}

	/**根据出生日期算出到指定日期currdate时的年龄
	 * 年龄显示格式
	 * 1.一个月以下 几天
	 * 2.一岁以下 几月几天
	 * 3.三岁以下 几岁几月
	 * 4.三岁以上  几岁
	 */
	public static String computerAge(Date currdate,Date brithday){
		if(currdate == null) currdate = Calendar.getInstance().getTime();
		if (brithday == null) return "";

		long milliseconds = currdate.getTime() - brithday.getTime();
		int minute = (int)(milliseconds/60000);
		int day = minute/1440;
		int month = day/30;
		int year = month/12;

		if(year >= 3){
			return String.valueOf(year) + "Y";
		}else{
			if(year >= 1){
				if (month - year*12 > 0){
					return String.valueOf(year) + "Y" + String.valueOf(month - year*12) + "M";
				}else{
					return String.valueOf(year) + "Y";
				}
			}else{
				if(month >= 1){
					if (day - month*30 > 0){
						return String.valueOf(month) + "M" + String.valueOf(day - month*30) + "D";
					}else{
						return String.valueOf(month) + "M";
					}
				}else{
					return String.valueOf(day) + "D";
				}
			}
		}
	}

	/**根据年龄字符串解析年龄数,只返回年数
	 */
	public static Long intAge(String age){
		if (age == null){
			return null;
		}else{
			int yearPos = age.indexOf("Y");
			if (yearPos == -1) return new Long(0);

			String yearStr = age.substring(0,yearPos);
			return new Long(yearStr);
		}

	}
}
