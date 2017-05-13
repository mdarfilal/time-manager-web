package fr.mdarfilal.time.manager.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Day {

	@Id
	private Date dateOfDay;
	private Date beginOfDay;
	private Date beginOfLunch;
	private Date endOfLunch;
	private Date endOfDay;
	private long totalOfDay;

	public Date getDateOfDay() {
		return dateOfDay;
	}

	public void setDateOfDay(Date dateOfDay) {
		this.dateOfDay = dateOfDay;
	}

	public Date getBeginOfDay() {
		return beginOfDay;
	}

	public void setBeginOfDay(Date beginOfDay) {
		this.beginOfDay = beginOfDay;
	}

	public Date getBeginOfLunch() {
		return beginOfLunch;
	}

	public void setBeginOfLunch(Date beginOfLunch) {
		this.beginOfLunch = beginOfLunch;
	}

	public Date getEndOfLunch() {
		return endOfLunch;
	}

	public void setEndOfLunch(Date endOfLunch) {
		this.endOfLunch = endOfLunch;
	}

	public Date getEndOfDay() {
		return endOfDay;
	}

	public void setEndOfDay(Date endOfDay) {
		this.endOfDay = endOfDay;
	}

	public long getTotalOfDay() {
		return totalOfDay;
	}

	public void setTotalOfDay(long totalOfDay) {
		this.totalOfDay = totalOfDay;
	}
}
