package com.malothetoad.nzbgetrpc;

import org.json.JSONException;
import org.json.JSONObject;

public class File 
{
	int ID;	//ID of file.
	int NZBID; //ID of NZB-file.
	String NZBFilename; //Name of nzb-file. The filename could include fullpath (if client sent it by adding the file to queue).
	String NZBName; //The name of nzb-file without path and extension. Ready for user-friendly output.
	String NZBNicename; //The name of nzb-file without path and extension. Ready for user-friendly output. NOTE: deprecated, use NZBName instead.
	String Subject; //Subject of article (read from nzb-file).
	String Filename; //Filename parsed from subject. It could be incorrect since the subject not always correct formated. After the first article for file is read, the correct filename is read from article body.
	boolean FilenameConfirmed; //"True" if filename was already read from article's body. "False" if the name was parsed from subject. For confirmed filenames the destination file on disk will be exactly as specified in field "filename". For unconfirmed filenames the name could change later.
	String DestDir; //Destination directory for output file.
	int FileSizeLo; //Filesize in bytes, Low 32-bits of 64-bit value.
	int FileSizeHi; //Filesize in bytes, High 32-bits of 64-bit value.
	int RemainingSizeLo; //Remaining size in bytes, Low 32-bits of 64-bit value.
	int RemainingSizeHi; //Remaining size in bytes, High 32-bits of 64-bit value.
	boolean Paused; //"True" if file is paused.
	int PostTime; //Date/time when the file was posted to newsgroup (Timestamp in Unix format).
	int Priority; //Priority of the file.
	int ActiveDownloads; //Number of active downloads for the file. With this filed can be determined what file(s) is (are) being currently downloaded.
	
	public File( JSONObject obj )
	{
		try 
		{
			ID = obj.getInt( "ID" );
			NZBID = obj.getInt( "NZBID" );
			NZBFilename = obj.getString( "NZBFilename" );
			NZBName = obj.getString( "NZBName" );
			NZBNicename = obj.getString( "NZBNicename" );
			Subject = obj.getString( "Subject" );
			Filename = obj.getString( "Filename" );
			FilenameConfirmed = obj.getBoolean( "FilenameConfirmed" );
			DestDir = obj.getString( "DestDir" );
			FileSizeLo = obj.getInt( "FileSizeLo" );
			FileSizeHi = obj.getInt( "FileSizeHi" );
			RemainingSizeLo = obj.getInt( "RemainingSizeLo" );
			RemainingSizeHi = obj.getInt( "RemainingSizeHi" );
			Paused= obj.getBoolean( "Paused" );
			PostTime = obj.getInt( "PostTime" );
			Priority = obj.getInt( "Priority" );
			ActiveDownloads = obj.getInt( "ActiveDownloads" );
		} 
		catch (JSONException e) 
		{
			e.printStackTrace();
		}
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getNZBID() {
		return NZBID;
	}
	public void setNZBID(int nZBID) {
		NZBID = nZBID;
	}
	public String getNZBFilename() {
		return NZBFilename;
	}
	public void setNZBFilename(String nZBFilename) {
		NZBFilename = nZBFilename;
	}
	public String getNZBName() {
		return NZBName;
	}
	public void setNZBName(String nZBName) {
		NZBName = nZBName;
	}
	public String getNZBNicename() {
		return NZBNicename;
	}
	public void setNZBNicename(String nZBNicename) {
		NZBNicename = nZBNicename;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}
	public boolean isFilenameConfirmed() {
		return FilenameConfirmed;
	}
	public void setFilenameConfirmed(boolean filenameConfirmed) {
		FilenameConfirmed = filenameConfirmed;
	}
	public String getDestDir() {
		return DestDir;
	}
	public void setDestDir(String destDir) {
		DestDir = destDir;
	}
	public int getFileSizeLo() {
		return FileSizeLo;
	}
	public void setFileSizeLo(int fileSizeLo) {
		FileSizeLo = fileSizeLo;
	}
	public int getFileSizeHi() {
		return FileSizeHi;
	}
	public void setFileSizeHi(int fileSizeHi) {
		FileSizeHi = fileSizeHi;
	}
	public int getRemainingSizeLo() {
		return RemainingSizeLo;
	}
	public void setRemainingSizeLo(int remainingSizeLo) {
		RemainingSizeLo = remainingSizeLo;
	}
	public int getRemainingSizeHi() {
		return RemainingSizeHi;
	}
	public void setRemainingSizeHi(int remainingSizeHi) {
		RemainingSizeHi = remainingSizeHi;
	}
	public boolean isPaused() {
		return Paused;
	}
	public void setPaused(boolean paused) {
		Paused = paused;
	}
	public int getPostTime() {
		return PostTime;
	}
	public void setPostTime(int postTime) {
		PostTime = postTime;
	}
	public int getPriority() {
		return Priority;
	}
	public void setPriority(int priority) {
		Priority = priority;
	}
	public int getActiveDownloads() {
		return ActiveDownloads;
	}
	public void setActiveDownloads(int activeDownloads) {
		ActiveDownloads = activeDownloads;
	}
}
