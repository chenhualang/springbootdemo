package dateutil;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 工作日计算工�?,该类主要用于计算两个日期之间的工作日期�?�数，或则计算多少个工作日之后的日期�?
 * 使用方法�?
 * <pre>
 * 	  1、首先设置法定工作日列表和法定假日列�?
 *    2、计算工作日总数
 *  例如�?
 *  WorkdayUtils workdayUtils = new WorkdayUtils();
 *  workdayUtils.setLegalWorkdayList(legalWorkdayList);
 *  workdayUtils.setLegalHolidayList(legalHolidayList);
 *  Date date =  workdayUtils.getWorkday(new Date(), 15);//计算15个工作日之后的日�?
 *  int count = workdayUtils.getWorkdayCount(new Date(), format.parse("2013-08-13"));//计算两个日期之间的工作日总数
 * </pre>
 * @author LiuJunGuang
 * @date 2013�?7�?22日下�?6:17:28
 */
public class WorkdayUtils {
	/**
	 * @fields LEGAL_WORKDAY 法定工作�?
	 */
	public static final int LEGAL_WORKDAY = 1;
	/**
	 * @fields LEGAL_HOLIDAY 法定节假�?
	 */
	public static final int LEGAL_HOLIDAY = 2;
	/**
	 * @fields WORKDAY 普�?�工作日
	 */
	public static final int WORKDAY = 3;
	/**
	 * @fields HOLIDAY 普�?�假�?
	 */
	public static final int HOLIDAY = 4;

	/**
	 * @fields  日期格式化类型，默认是�?�yyyy-MM-dd�?
	 */
	private String datePattern = "yyyy-MM-dd";

	/**
	 * @fields legalWorkdayList 法定工作日列表，日期格式 yyyy-MM-dd
	 */
	private List<String> legalWorkdayList;
	/**
	 * @fields legalHolidayList 法定节假日列表，日期格式yyyy-MM-dd
	 */
	private List<String> legalHolidayList;

	public WorkdayUtils() {
		super();
	}

	/**
	 * @description 构�?�方�?
	 * @param legalWorkdayList 法定工作日列�?
	 * @param legalHolidayList 法定假日列表
	 */
	public WorkdayUtils(List<String> legalWorkdayList, List<String> legalHolidayList) {
		super();
		this.legalWorkdayList = legalWorkdayList;
		this.legalHolidayList = legalHolidayList;
	}

	/**
	 * @description 构�?�方�?
	 * @param legalWorkdayList 法定工作日列�?
	 * @param legalHolidayList 法定假日列表
	 * @param datePattern 日期模式，默认为“yyyy-MM-dd�?
	 */
	public WorkdayUtils(List<String> legalWorkdayList, List<String> legalHolidayList, String datePattern) {
		super();
		this.legalWorkdayList = legalWorkdayList;
		this.legalHolidayList = legalHolidayList;
		this.datePattern = datePattern;
	}

	/**
	 * 设置法定工作日列�?
	 * @param legalWorkdayList
	 */
	public void setLegalWorkdayList(List<String> legalWorkdayList) {
		this.legalWorkdayList = legalWorkdayList;
	}

	/**
	 * 设置法定节假日列�?
	 * @param legalHolidayList
	 */
	public void setLegalHolidayList(List<String> legalHolidayList) {
		this.legalHolidayList = legalHolidayList;
	}

	/**
	 * 获取日期格式化类型，默认为�?�yyyy-MM-dd�?
	 * @return String
	 */
	public String getDatePattern() {
		return datePattern;
	}

	/**
	 * 设置日期格式化类型，如果参数为空或null则使用默认格式�?�yyyy-MM-dd�?
	 * @param datePattern
	 */
	public void setDatePattern(String datePattern) {
		if (StringUtils.isNotBlank(datePattern))
			this.datePattern = datePattern;
	}

	/**
	 * 获取多少个工作日之后的工作日�?
	 * @param date 指定日期,不能为null
	 * @param amount 多少个工作日,如果为负数则表示多少工作日之前的工作日，为正数则表示多少个工作日之后的工作日
	 * @return Date 新的日期对象
	 */
	public Date getWorkday(Date date, int amount) {
		assertNotNull(date);
		Date workday = date;
		if (amount > 0) {
			for (int i = 0; i < amount; i++) {
				workday = getNextWorkday(workday);
			}
		}
		if (amount < 0) {
			for (int i = amount; i < 0; i++) {
				workday = getPrevWorkday(workday);
			}
		}
		return workday;
	}

	/**
	 * 获取指定日期之间的工作日总数
	 * @param startDate �?始日期不能为null
	 * @param endDate 结束日期不能为null，结束日期必须大于等于开始日�?
	 * @return 工作日天�?
	 */
	public int getWorkdayCount(Date startDate, Date endDate) {
		assertNotNull(startDate);
		assertNotNull(endDate);
		int count = 0;
		if (DateUtils.isSameDay(startDate, endDate)) {
			if (isWorkday(startDate))
				count = 1;
			return count;
		}
		if (endDate.before(startDate)) {
			throw new IllegalArgumentException("The endDate must be greater than startDate");
		}
		Date day = startDate;
		while (!DateUtils.isSameDay(day, endDate)) {
			day = DateUtils.addDays(day, 1);
			if (isWorkday(day))
				count++;
		}
		return count;
	}

	/**
	 * 获取指定日期之后的下�?个工作日，该方法会返回一个新的日期对�?
	 * @param date Date 不能为null
	 * @return Date 下个�?个工作日
	 */
	public Date getNextWorkday(Date date) {
		return getNeighbourWorkday(date, 1);
	}

	/**
	 * 获取指定日期之后的上�?个工作日，该方法会返回一个新的日期对�?
	 * @param date Date 不能为null
	 * @return Date 上一个工作日
	 */
	public Date getPrevWorkday(Date date) {
		return getNeighbourWorkday(date, -1);
	}

	/**
	 * 获取日类型，日类型包括法定工作日、法定节假日、普通工作日、普通假日�??
	 * @param date
	 * @return int 日类�?
	 */
	public int getDayType(Date date) {
		assertNotNull(date);
		String dateStr = DateFormatUtils.format(date, this.datePattern);
		if (legalWorkdayList != null && !legalWorkdayList.isEmpty()) {
			if (legalWorkdayList.contains(dateStr))
				return LEGAL_WORKDAY;
		}
		if (legalHolidayList != null && !legalHolidayList.isEmpty()) {
			if (legalHolidayList.contains(dateStr))
				return LEGAL_HOLIDAY;
		}
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int day = c.get(Calendar.DAY_OF_WEEK);
		if (Calendar.MONDAY <= day && day <= Calendar.FRIDAY) {
			return WORKDAY;
		}
		return HOLIDAY;
	}

	/**
	 * 判断给定的日期是否是工作日或法定工作�?
	 * @param date 日期不能为null
	 * @return 如果是工作日或法定工作日则返回true，否则返回false
	 */
	public boolean isWorkday(Date date) {
		int dayType = getDayType(date);
		if (dayType == LEGAL_WORKDAY || dayType == WORKDAY)
			return true;
		return false;
	}

	/**
	 * 断言指定的对象不为null，如果为null则抛出IllegalArgumentException异常
	 * @param obj
	 */
	private void assertNotNull(Object obj) {
		if (obj == null)
			throw new IllegalArgumentException("The date must not be null!");
	}

	/**
	 * 获取临近的工作日
	 * @param date 日期，不能为null
	 * @param neighbour 如果�?1表示下一个工作日�?-1表示上一个工作日
	 * @return Date 新的日期对象
	 */
	private Date getNeighbourWorkday(Date date, int neighbour) {
		assertNotNull(date);
		Date nextWorkday = date;
		do {
			nextWorkday = DateUtils.addDays(nextWorkday, neighbour);
		} while (!isWorkday(nextWorkday));
		return nextWorkday;
	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		WorkdayUtils workdayUtils = new WorkdayUtils();
		Date date = workdayUtils.getWorkday(new Date(), 15);
		System.out.println(format.format(date));
		System.out.println(workdayUtils.getWorkdayCount(new Date(), format.parse("2013-08-13")));
	}
}
