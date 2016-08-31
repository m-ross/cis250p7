package lab07;

import java.util.*;
import java.text.*;

public class Element {
	private String location, comment;
	private Date begin, end;
	private static SimpleDateFormat day = new SimpleDateFormat("MM/dd/yyyy");
	private static SimpleDateFormat time = new SimpleDateFormat("HH:mm");

	public Element() { }

	public Element(String location, Date begin, Date end) {
		String comment = "";
		set(location, begin, end, comment);
	}

	public Element(String location, Date begin, Date end, String comment) {
		set(location, begin, end, comment);
	}

	public void set(String location, Date begin, Date end, String comment) {
		this.location = location;
		this.comment = comment;
		this.begin = begin;
		this.end = end;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {
		return location;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setTimeBegin(Date begin) throws ParseException {
		this.begin = begin;
	}

	public Date getTimeBegin() {
		return begin;
	}

	public String getTimeBegin(boolean formatted) {
		String timeBegin = time.format(begin);
		return timeBegin;
	}

	public void setTimeEnd(Date end) throws ParseException {
		this.end = end;
	}

	public Date getTimeEnd() {
		return end;
	}

	public String getTimeEnd(boolean formatted) {
		String timeEnd = time.format(end);
		return timeEnd;
	}

	public String getDate() {
		String date = day.format(begin);
		return date;
	}

	public String getKey() {
		return getDate();
	}

	public Element clone() {
		Element clone = new Element(location, begin, end, comment);
		return clone;
	}
}