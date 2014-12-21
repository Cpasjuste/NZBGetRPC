package com.malothetoad.nzbgetrpc;

import org.json.JSONException;
import org.json.JSONObject;

public class Log 
{
	int id; //ID of log-entry.
	String kind; //Class of log-entry, one of the following strings: INFO, WARNING, ERROR, DEBUG.
	int time; //Time since the Epoch (00:00:00 UTC, January 1, 1970), measured in seconds. This is what c-function "time" returns.
	String text; //string	Log-message.
	
	public Log( JSONObject obj )
	{
		try 
		{
			id = obj.getInt( "ID" );
			kind = obj.getString( "Kind" );
			time = obj.getInt( "Time" );
			text = obj.getString( "Text" );
		} 
		catch (JSONException e) 
		{
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
