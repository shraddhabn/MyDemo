package mock3;

import java.sql.Date;

public class Room {
	public int roomNr; 

	private Date beginDtm; 

	private Date endDttm; 

	public void book(int roomNr, Date beginDttm, Date endDttm) { 

	this.roomNr = roomNr; 

	this.beginDtm = beginDttm; 

	this.endDttm = endDttm; 

	} 
}
