package dateutil;

import com.alibaba.fastjson.JSON;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 指定工作日和休息日.
 * 本程序可以取得所有的工作日，
 * 并可以将工作日设为休息日，
 * 也可以将休息日设为工作日，
 * 最后返回存放工作日的map.
 * @author 
 */
@SuppressWarnings("unchecked")
public class designationWorkDay {

	/**
	 * 主调用方法.
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String inStartDate = "2018-1-3";
		String inEndDate = "2018-1-10";
//		long dt3 = System.currentTimeMillis();
		HashMap specialDay = setSpecialDay();
		Map map = getValue(inStartDate, inEndDate, 1, specialDay);

//		long dt4 = System.currentTimeMillis();
		TreeMap treeMap = new TreeMap();
		treeMap.putAll(map);
//		System.out.println(treeMap);
//		System.out.println(map);
//		System.out.println(dt4 - dt3);
//		long dt7 = System.currentTimeMillis();
		//本例中返回第六个工作日
		String mapKey = getKeyFromValue(map, "2");
//		long dt8 = System.currentTimeMillis();
//		System.out.println(dt8 - dt7);
		System.out.println("workdayinfo"+ JSON.toJSONString(map));
		System.out.println(mapKey);
		System.out.println(map.get(mapKey));
	}

	/**
	 * 设置特别日期（工作日改为非工作日，休息日改为工作日）
	 * MAP中value为Y的表示设为工作日，反之休息日
	 * @return
	 * @throws Exception
	 */
	public static HashMap setSpecialDay() throws Exception {
		HashMap specialDay = new HashMap();
		specialDay.put("2011-01-01", "Y");
		specialDay.put("2011-01-02", "Y");
		specialDay.put("2011-01-03", "N");
		specialDay.put("2011-01-05", "N");
		return specialDay;
	}

	/**
	 * 工作日反查，可根据第几个工作日，返回工作日的日期.
	 * @param map
	 * @param mapValue
	 * @return
	 * @throws Exception
	 */
	public static String getKeyFromValue(Map map, String mapValue)
			throws Exception {
		for (Object o : map.keySet()) {
			if (map.get(o).toString().equals(mapValue)) {
				return o.toString();
			}
		}
		return null;
	}

	/**
	 * 得到全年工作日MAP.
	 * 
	 * @param inStartDate
	 * @param inEndDate
	 * @param mapValue
	 * @return
	 * @throws Exception
	 */
	public static HashMap getValue(String inStartDate, String inEndDate,
			int mapValue) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse(inStartDate);
		Date endDate = sdf.parse(inEndDate);
		// 转换起止日期
		Calendar cal_start = Calendar.getInstance();
		Calendar cal_end = Calendar.getInstance();
		cal_start.setTime(startDate);
		cal_end.setTime(endDate);
		// 得到起止日期相差天数
		int days = getDaysBetween(cal_start, cal_end);
		Calendar cal_date = Calendar.getInstance();
		HashMap hmap = new HashMap();
		for (int i = 0; i < days; i++) {
			Date date = getDateAfter(sdf.format(cal_start.getTime()), i);
			cal_date.setTime(date);
			if (isWorkDay(date)) {
				hmap.put(sdf.format(date), mapValue);
				mapValue++;
			}
		}
		return hmap;
	}

	/**
	 * 得到全年工作日MAP,并处理干扰日期.
	 * 
	 * @param inStartDate
	 * @param inEndDate
	 * @param mapValue
	 * @param specialDay
	 * @return
	 * @throws Exception
	 */
	public static HashMap getValue(String inStartDate, String inEndDate,
			int mapValue, HashMap specialDay) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sdf.parse(inStartDate);
		Date endDate = sdf.parse(inEndDate);
		// 转换起止日期
		Calendar cal_start = Calendar.getInstance();
		Calendar cal_end = Calendar.getInstance();
		cal_start.setTime(startDate);
		cal_end.setTime(endDate);
		// 得到起止日期相差天数
		int days = getDaysBetween(cal_start, cal_end);
		Calendar cal_date = Calendar.getInstance();
		HashMap hmap = new HashMap();
		for (int i = 0; i < days; i++) {
			Date date = getDateAfter(sdf.format(cal_start.getTime()), i);
			cal_date.setTime(date);
			if (isWorkDay(date)
					&& !String.valueOf(specialDay.get(sdf.format(date)))
							.equals("N")) {
				hmap.put(sdf.format(date), mapValue);
				mapValue++;
			} else {
				if (String.valueOf(specialDay.get(sdf.format(date)))
						.equals("Y")) {
					hmap.put(sdf.format(date), mapValue);
					mapValue++;
				}
			}
		}
		return hmap;
	}

	/**
	 * 获取N天后日期.
	 * 
	 * @param inDate
	 * @param days
	 * @return
	 * @throws ParseException
	 */
	public static Date getDateAfter(String inDate, long days)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(inDate);
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.set(Calendar.DATE, (int) (now.get(Calendar.DATE) + days));
		return now.getTime();
	}

	public static boolean isWorkDay(Date inDate) throws Exception {
		Calendar cal_date = Calendar.getInstance();
		cal_date.setTime(inDate);
		String weekIndex = getChineseWeek(cal_date);
		if (weekIndex.equals("Sunday") || weekIndex.equals("Saturday")) {
			return false;
		} else {
			return true;
		}
	}

	//Monday，Tuesday、Wednesday、Thursday、Friday、Saturday 、Sunday
	public static String getChineseWeek(Calendar date) {
		final String dayNames[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday" };
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		return dayNames[dayOfWeek - 1];
	}

	/**
	 * 获取两个日期间的天数.
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int getDaysBetween(Calendar d1, Calendar d2) {
		if (d1.after(d2)) {
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR)
				+ 1;
		int y2 = d2.get(Calendar.YEAR);
		if (d1.get(Calendar.YEAR) != y2) {
			d1 = (Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);
				d1.add(Calendar.YEAR, 1);
			} while (d1.get(Calendar.YEAR) != y2);
		}
		return days;
	}
}