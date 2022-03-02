package com.julong.nucleicacid.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 日期时间的工具类,用于比较日期等功能
 *
 */
public final class DateTimeUtil {

	/**
	 * 仅比较日期时间部分,不包括毫秒数
	 */
	public static final int DATETIME = 0;

	/**
	 * 仅比较日期部分,不包括时间和毫秒部分
	 */
	public static final int DATE = 1;

	/**
	 * 仅比较时间部分,不包括日期和毫秒部分
	 */
	public static final int TIME = 2;

	/**
	 * 日期时间格式
	 */
	public static final SimpleDateFormat DATETIME_FORMAT = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

	/**
	 * 日期格式
	 */
	public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy.MM.dd");

	/**
	 * 时间格式
	 */
	public static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");


	public DateTimeUtil(){

	}

	public static void main(String[] args) {
//		long begin = System.currentTimeMillis();
//
//		Date date1 = new Date();
//		System.out.println("date1：" + (System.currentTimeMillis() - begin));
//
//		Date date2 = new Date();
//		System.out.println("date2：" + (System.currentTimeMillis() - begin));
//
//		Date date3 = new Date();
//		System.out.println("date3：" + (System.currentTimeMillis() - begin));
//
//		//Date date3 = new Date(1993 - 1990,8 -1,14,16,23,24);
//
//		int p_matchMode = TIME;
//		boolean p_includeSencond = true;
//
//		System.out.println("lt(date1,date2,p_matchMode,p_includeSencond) = " + lt(date1,date2,p_matchMode,p_includeSencond));
//		System.out.println("le(date1,date2,p_matchMode,p_includeSencond) = " + le(date1,date2,p_matchMode,p_includeSencond));
//
//		System.out.println("eq(date1,date2,p_matchMode,p_includeSencond) = " + eq(date1,date2,p_matchMode,p_includeSencond));
//		System.out.println("ne(date1,date2,p_matchMode,p_includeSencond) = " + ne(date1,date2,p_matchMode,p_includeSencond));
//
//		System.out.println("gt(date1,date2,p_matchMode,p_includeSencond) = " + gt(date1,date2,p_matchMode,p_includeSencond));
//		System.out.println("ge(date1,date2,p_matchMode,p_includeSencond) = " + ge(date1,date2,p_matchMode,p_includeSencond));
//
//		System.out.println("between(date2,date1,date3,TIME,true) = " + between(date2,date1,date3,p_matchMode,p_includeSencond));

//		System.out.println(StringToDate("2008.09.10 13:25:25","yyyy.MM.dd HH:mm:ss"));
//		System.out.println(StringToDate("2008.09.10 13:25:25",DATETIME_FORMAT));
//
//		System.out.println(StringToDate("2008-09-10","yyyy-MM-dd"));
//		System.out.println(StringToDate("2008.09.10",DATE_FORMAT));
//
//		System.out.println(StringToDate("132525","HHmmss"));
//		System.out.println(StringToDate("13:25:25",TIME_FORMAT));
//
//
//		Date currTime = new Date();
//		System.out.println(DateToString(currTime,"yyyyMMddHHmmss"));
//		System.out.println(DateToString(currTime,DATETIME_FORMAT));
//		System.out.println(DateToString(currTime,DATE_FORMAT));
//		System.out.println(DateToString(currTime,TIME_FORMAT));



//		System.exit(0);

	}

	/**
	 * 根据日期和时间拼成一个DateTime
	 */
	public static Date getDateTime(Date date, Date time){
		if(date == null || time == null) return null;

		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c1.setTime(date);

		c2.setTime(time);

		c.set(Calendar.YEAR,c1.get(Calendar.YEAR));
		c.set(Calendar.MONTH,c1.get(Calendar.MONTH));
		c.set(Calendar.DATE,c1.get(Calendar.DATE));
		c.set(Calendar.HOUR_OF_DAY,c2.get(Calendar.HOUR_OF_DAY));
		c.set(Calendar.MINUTE,c2.get(Calendar.MINUTE));
		c.set(Calendar.SECOND,0);
		return c.getTime();
	}

	/**根据比较模式对传入的日期重新格式化处理
	 * @param p_date 传入的日期
	 * @param p_matchMode 比较模式
	 * @return
	 */
	public static Date normalizeDate (Date p_date,int p_matchMode){
		return normalizeDate(p_date,p_matchMode,true);
	}


	/**根据比较模式对传入的日期重新格式化处理
	 * @param p_date 传入的日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 */
	public static Date normalizeDate (Date p_date,int p_matchMode,boolean p_includeSencond){
		if (p_matchMode !=0 && p_matchMode !=1 && p_matchMode !=2){
			p_matchMode = 0;
		}

		Calendar calendar = new GregorianCalendar();

		if(p_date != null){
			calendar.setTime(p_date);
		}else{
			return p_date;
		}

		switch (p_matchMode) {

			case DATETIME: //日期时间部分

				if (!p_includeSencond){
					calendar.set(Calendar.SECOND, 0);
				}
				calendar.set(Calendar.MILLISECOND, 0);
				break;

			case DATE: //日期部分
				calendar.set(Calendar.HOUR_OF_DAY, 0);
				calendar.set(Calendar.MINUTE, 0);
				calendar.set(Calendar.SECOND, 0);
				calendar.set(Calendar.MILLISECOND, 0);
				break;
			case TIME: //时间部分
				calendar.set(Calendar.YEAR, 1);
				calendar.set(Calendar.MONTH, Calendar.JANUARY);
				calendar.set(Calendar.DATE, 1);
				calendar.set(Calendar.MILLISECOND, 0);
				break;
			default: //缺省日期时间
				if (!p_includeSencond){
					calendar.set(Calendar.SECOND, 0);
				}
				calendar.set(Calendar.MILLISECOND, 0);
				break;
		}

		p_date = calendar.getTime();

		return p_date;
	}

	private static long normalizeTime (Date p_date){
		long time;
		if (p_date == null ) {
			time = Long.MIN_VALUE;
		}else{
			time = p_date.getTime();
		}
		return time;
	}

	/**判断p_date1 < p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true <, false >=
	 */
	public static boolean lt(Date p_date1,Date p_date2,int p_matchMode){
		return lt(p_date1,p_date2,p_matchMode,false);
	}

	/**判断p_date1 < p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true <, false >=
	 */
	public static boolean lt(Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		if (p_date1 == null && p_date2 == null){
			return false;
		}

		p_date1 = normalizeDate(p_date1,p_matchMode,p_includeSencond);
		p_date2 = normalizeDate(p_date2,p_matchMode,p_includeSencond);

		return normalizeTime(p_date1) < normalizeTime(p_date2);
	}

	/**判断p_date1 <= p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true <=, false >
	 */
	public static boolean le(Date p_date1,Date p_date2,int p_matchMode){
		return le(p_date1,p_date2,p_matchMode,false);
	}

	/**判断p_date1 <= p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true <=, false >
	 */
	public static boolean le(Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		if (p_date1 == null && p_date2 == null){
			return true;
		}
		p_date1 = normalizeDate(p_date1,p_matchMode,p_includeSencond);
		p_date2 = normalizeDate(p_date2,p_matchMode,p_includeSencond);

		return normalizeTime(p_date1) <= normalizeTime(p_date2);
	}

	/**判断p_date1 = p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true =, false <>
	 */
	public static boolean eq(Date p_date1,Date p_date2,int p_matchMode){
		return eq(p_date1,p_date2,p_matchMode,false);
	}

	/**判断p_date1 = p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true =, false <>
	 */
	public static boolean eq(Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		if (p_date1 == null && p_date2 == null){
			return true;
		}

		p_date1 = normalizeDate(p_date1,p_matchMode,p_includeSencond);
		p_date2 = normalizeDate(p_date2,p_matchMode,p_includeSencond);

		return normalizeTime(p_date1) == normalizeTime(p_date2);
	}

	/**判断p_date1 <> p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true <>, false 小于
	 */
	public static boolean ne(Date p_date1,Date p_date2,int p_matchMode){
		return ne(p_date1,p_date2,p_matchMode,false);
	}

	/**判断p_date1 <> p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true <>, false 小于
	 */
	public static boolean ne(Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		if (p_date1 == null && p_date2 == null){
			return false;
		}
		p_date1 = normalizeDate(p_date1,p_matchMode,p_includeSencond);
		p_date2 = normalizeDate(p_date2,p_matchMode,p_includeSencond);

		return normalizeTime(p_date1) != normalizeTime(p_date2);
	}


	/**判断p_date1 > p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true >, false <=
	 */
	public static boolean gt(Date p_date1,Date p_date2,int p_matchMode){
		return gt(p_date1,p_date2,p_matchMode,false);
	}

	/**判断p_date1 > p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true >, false <=
	 */
	public static boolean gt(Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		if (p_date1 == null && p_date2 == null){
			return false;
		}
		p_date1 = normalizeDate(p_date1,p_matchMode,p_includeSencond);
		p_date2 = normalizeDate(p_date2,p_matchMode,p_includeSencond);

		return normalizeTime(p_date1) > normalizeTime(p_date2);
	}


	/**判断p_date1 >= p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true >=, false <
	 */
	public static boolean ge(Date p_date1,Date p_date2,int p_matchMode){
		return ge(p_date1,p_date2,p_matchMode,false);
	}

	/**判断p_date1 >= p_date2
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true >=, false <
	 */
	public static boolean ge(Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		if (p_date1 == null && p_date2 == null){
			return true;
		}
		p_date1 = normalizeDate(p_date1,p_matchMode,p_includeSencond);
		p_date2 = normalizeDate(p_date2,p_matchMode,p_includeSencond);

		return normalizeTime(p_date1) >= normalizeTime(p_date2);
	}

	/**判断 p_date1 <= p_date <= p_date2
	 * @param p_date 欲比较的日期
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @return boolean true 满足, false 不满足
	 */
	public static boolean between(Date p_date,Date p_date1,Date p_date2,int p_matchMode){
		return between(p_date,p_date1,p_date2,p_matchMode,false);
	}

	/**判断 p_date1 <= p_date <= p_date2
	 * @param p_date 欲比较的日期
	 * @param p_date1 第一个日期
	 * @param p_date2 第二个日期
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return boolean true 满足, false 不满足
	 */
	public static boolean between(Date p_date,Date p_date1,Date p_date2,int p_matchMode,boolean p_includeSencond){
		return ge(p_date,p_date1,p_matchMode,p_includeSencond) && le(p_date,p_date2,p_matchMode,p_includeSencond);
	}

	/**对p_date进行计算
	 * @param p_date 欲操作的日期
	 * @param p_field 同Calendar.add(field, amount)中的field
	 * @param p_amount 同Calendar.add(field, amount)中的amount
	 * @param p_matchMode 比较模式
	 * @return Date 返回相加相应field后格式化的日期
	 */
	public static Date add(Date p_date,int p_field,int p_amount,int p_matchMode){
		return add(p_date,p_field,p_amount,p_matchMode,p_field == Calendar.SECOND);
	}

	/**对p_date进行计算
	 * @param p_date 欲操作的日期
	 * @param p_field 同Calendar.add(field, amount)中的field
	 * @param p_amount 同Calendar.add(field, amount)中的amount
	 * @param p_matchMode 比较模式
	 * @param p_includeSencond 若p_matchMode为DATETIME时,是否要包含秒
	 * @return Date 返回相加相应field后格式化的日期
	 */
	public static Date add(Date p_date,int p_field,int p_amount,int p_matchMode,boolean p_includeSencond){
		if (p_date == null) return p_date;

		p_date = normalizeDate(p_date,p_matchMode,p_includeSencond);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(p_date);
		calendar.add(p_field, p_amount);

		return calendar.getTime();

	}

	/**对p_date取指定filed的值
	 * @param p_date 欲操作的日期
	 * @param p_field 同Calendar.get(field)中的field
	 * @return int 返回p_date指定filed的值
	 */
	public static int get(Date p_date,int p_field){

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(p_date);

		return calendar.get(p_field);

	}

	/**对p_date的filed设置指定的值
	 * @param p_date 欲操作的日期
	 * @param p_field 同Calendar.set(field,value)中的field
	 * @param p_field 同Calendar.set(field,value)中的value
	 * @return int 返回p_date指定filed的值
	 */
	public static Date set(Date p_date,int p_field,int p_value){

		Calendar calendar = new GregorianCalendar();
		calendar.setTime(p_date);
		calendar.set(p_field,p_value);

		return calendar.getTime();

	}
	/**
	 * 得到两个日期之间的相隔天数 如 2009-10-01 to 2009-10-2 得到 1
	 * @param date1 p_date1
	 * @param date2 p_date2
	 * @return int
	 */
	public static int getDaysBetween(Date date1, Date date2 ) {
		date1 = normalizeDate(date1,DATE,true);
		date2 = normalizeDate(date2,DATE,true);

		Calendar p_date1 = new GregorianCalendar();
		p_date1.setTime(date1);

		Calendar p_date2 = new GregorianCalendar();
		p_date2.setTime(date2);

		if (p_date1.after(p_date2)) { // swap dates so that p_date1 is start and p_date2 is end
			java.util.Calendar swap = p_date1;
			p_date1 = p_date2;
			p_date2 = swap;
		}
		int days = p_date2.get(java.util.Calendar.DAY_OF_YEAR)
				- p_date1.get(java.util.Calendar.DAY_OF_YEAR);
		int y2 = p_date2.get(java.util.Calendar.YEAR);
		if (p_date1.get(java.util.Calendar.YEAR) != y2) {
			p_date1 = (java.util.Calendar) p_date1.clone();
			do {
				days += p_date1.getActualMaximum(java.util.Calendar.DAY_OF_YEAR);
				p_date1.add(java.util.Calendar.YEAR, 1);
			} while (p_date1.get(java.util.Calendar.YEAR) != y2);
		}

		return days;
	}

	/**对p_dateString的指定的日期格式转换为日期
	 * @param p_dateString 要转换的日期字符串
	 * @param p_dateFormatString 日期格式字符串
	 * @return Date 返回转换后的日期(不合法的为null)
	 */
	public static Date StringToDate( String p_dateString,String p_dateFormatString){
		Date retDate = null;
		try {
			retDate = new SimpleDateFormat(p_dateFormatString).parse(p_dateString);
		} catch (ParseException e) {
			retDate = null;
		}
		return retDate;
	}

	/**对p_dateString的指定的日期格式转换为日期
	 * @param p_dateString 要转换的日期字符串
	 * @param p_dateFormat 日期格式
	 * @return Date 返回转换后的日期(不合法的为null)
	 */
	public static Date StringToDate( String p_dateString,SimpleDateFormat p_dateFormat){
		Date retDate = null;
		try {
			retDate = p_dateFormat.parse(p_dateString);
		} catch (ParseException e) {
			retDate = null;
		}
		return retDate;
	}

	/**对p_dateString的指定的日期,格式为指定格式的字符串
	 * @param p_date 要格式化的日期
	 * @param p_dateFormatString 日期格式字符串
	 * @return String 返回格式化后的字符串
	 */
	public static String DateToString( Date p_date,String p_dateFormatString){
		return new SimpleDateFormat(p_dateFormatString).format(p_date);
	}

	/**对p_dateString的指定的日期,格式为指定格式的字符串
	 * @param p_dateFormat 要格式化的日期
	 * @param p_date 日期格式
	 * @return String 返回格式化后的字符串
	 */
	public static String DateToString( Date p_date,SimpleDateFormat p_dateFormat){
		return p_dateFormat.format(p_date);
	}


	/**
	 * 计算年龄
	 * @param birthDay
	 * @return
	 * @throws Exception
	 */
	public static int getAge(Date birthDay) {
		if(birthDay == null){
			return -1 ;
		}

		//获取当前系统时间
		Calendar cal = Calendar.getInstance();
		//如果出生日期大于当前时间，则抛出异常
		if (cal.before(birthDay)) {
			return -1 ;
//            throw new IllegalArgumentException(
//                "The birthDay is before Now.It's unbelievable!");
		}
		//取出系统当前时间的年、月、日部分
		int yearNow = cal.get(Calendar.YEAR);
		int monthNow = cal.get(Calendar.MONTH);
		int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

		//将日期设置为出生日期
		cal.setTime(birthDay);
		//取出出生日期的年、月、日部分
		int yearBirth = cal.get(Calendar.YEAR);
		int monthBirth = cal.get(Calendar.MONTH);
		int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
		//当前年份与出生年份相减，初步计算年龄
		int age = yearNow - yearBirth;
		//当前月份与出生日期的月份相比，如果月份小于出生月份，则年龄上减1，表示不满多少周岁
		if (monthNow <= monthBirth) {
			//如果月份相等，在比较日期，如果当前日，小于出生日，也减1，表示不满多少周岁
			if (monthNow == monthBirth) {
				if (dayOfMonthNow < dayOfMonthBirth) age--;
			}else{
				age--;
			}
		}
//        System.out.println("age:"+age); 
		return age;
	}
}
