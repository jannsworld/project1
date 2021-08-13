package domain;

import java.time.LocalDate;

public class Notice {
	private String name;
	private LocalDate date;
	
	public Notice() {
		//nothing
	}
	
	public Notice(String name, LocalDate date) {
		this.name = name;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return name + "(" + date + ")";
	}	
	
}
