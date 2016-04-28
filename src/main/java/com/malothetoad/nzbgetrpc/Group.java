package com.malothetoad.nzbgetrpc;

import org.json.JSONException;
import org.json.JSONObject;

public class Group 
{
	int NZBID; //ID of NZB-file.
	int FirstID; //ID of the first file in download queue, belonging to the group.
	int LastID; //ID of the last file in download queue, belonging to the group.
	String NZBFilename; //Name of nzb-file, this file was added to queue from. The filename could include fullpath (if client sent it by adding the file to queue).
	String NZBName; //The name of nzb-file without path and extension. Ready for user-friendly output.
	String DestDir; //Destination directory for output file.
	String Category; //Category for group or empty string if none category is assigned.
	int FileSizeLo;	//Initial size of all files in group in bytes, Low 32-bits of 64-bit value.
	int FileSizeHi; //Initial size of all files in group in bytes, High 32-bits of 64-bit value.
	int FileSizeMB; //Initial size of all files in group in megabytes.
	int RemainingSizeLo; //Remaining size of all (remaining) files in group in bytes, Low 32-bits of 64-bit value.
	int RemainingSizeHi; //Remaining size of all (remaining) files in group in bytes, High 32-bits of 64-bit value.
	int RemainingSizeMB; //Remaining size of all (remaining) files in group in megabytes.
	int	PausedSizeLo; //Size of all paused files in group in bytes, Low 32-bits of 64-bit value.
	int	PausedSizeHi; //Size of all paused files in group in bytes, High 32-bits of 64-bit value.
	int	PausedSizeMB; //Size of all paused files in group in megabytes.
	int	FileCount; //Initial number of files in group.
	int	RemainingFileCount; //Remaining (current) number of files in group.
	int	RemainingParCount; //Remaining (current) number of par-files in group.
	int MinPostTime; //Date/time when the oldest file in the group was posted to newsgroup (Timestamp in Unix format).
	int MaxPostTime; //Date/time when the newest file in the group was posted to newsgroup (Timestamp in Unix format).
	int MinPriority; //The lowest priority of files in the group. The files in the group can have different priorities.
	int MaxPriority; //The highest priority of files in the group. The files in the group can have different priorities.
	int ActiveDownloads; //Number of active downloads in the group. With this filed can be determined what group(s) is (are) being currently downloaded. In most cases only one group is downloaded at a time however more that one group can be downloaded simultaneously when the first group is almost completely downloaded.
	//array Parameters; //Post-processing parameters for group. See below.
	
	public Group( JSONObject obj )
	{
		try 
		{
			NZBID = obj.getInt( "NZBID" );
			FirstID = obj.getInt( "FirstID" );
			LastID = obj.getInt( "LastID" );
			NZBFilename = obj.getString( "NZBFilename" );
			NZBName = obj.getString( "NZBName" );
			DestDir = obj.getString( "DestDir" );
			Category = obj.getString( "Category" );
			FileSizeLo = obj.getInt( "FileSizeLo" );
			FileSizeHi = obj.getInt( "FileSizeHi" );
			FileSizeMB = obj.getInt( "FileSizeMB" );
			RemainingSizeLo = obj.getInt( "RemainingSizeLo" );
			RemainingSizeHi = obj.getInt( "RemainingSizeHi" );
			RemainingSizeMB = obj.getInt( "RemainingSizeMB" );
			PausedSizeLo = obj.getInt( "PausedSizeLo" );
			PausedSizeHi = obj.getInt( "PausedSizeHi" );
			PausedSizeMB = obj.getInt( "PausedSizeMB" );
			FileCount = obj.getInt( "FileCount" );
			RemainingFileCount = obj.getInt( "RemainingFileCount" );
			RemainingParCount = obj.getInt( "RemainingParCount" );
			MinPostTime = obj.getInt( "MinPostTime" );
			MaxPostTime = obj.getInt( "MaxPostTime" );
			MinPriority = obj.getInt( "MinPriority" );
			MaxPriority = obj.getInt( "MaxPriority" );
			ActiveDownloads = obj.getInt( "ActiveDownloads" );
		} 
		catch (JSONException e) 
		{
			e.printStackTrace();
		}
	}
	
	public int getNZBID() {
		return NZBID;
	}
	public void setNZBID(int nZBID) {
		NZBID = nZBID;
	}
	public int getFirstID() {
		return FirstID;
	}
	public void setFirstID(int firstID) {
		FirstID = firstID;
	}
	public int getLastID() {
		return LastID;
	}
	public void setLastID(int lastID) {
		LastID = lastID;
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
	public String getDestDir() {
		return DestDir;
	}
	public void setDestDir(String destDir) {
		DestDir = destDir;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
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
	public int getFileSizeMB() {
		return FileSizeMB;
	}
	public void setFileSizeMB(int fileSizeMB) {
		FileSizeMB = fileSizeMB;
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
	public int getRemainingSizeMB() {
		return RemainingSizeMB;
	}
	public void setRemainingSizeMB(int remainingSizeMB) {
		RemainingSizeMB = remainingSizeMB;
	}
	public int getPausedSizeLo() {
		return PausedSizeLo;
	}
	public void setPausedSizeLo(int pausedSizeLo) {
		PausedSizeLo = pausedSizeLo;
	}
	public int getPausedSizeHi() {
		return PausedSizeHi;
	}
	public void setPausedSizeHi(int pausedSizeHi) {
		PausedSizeHi = pausedSizeHi;
	}
	public int getPausedSizeMB() {
		return PausedSizeMB;
	}
	public void setPausedSizeMB(int pausedSizeMB) {
		PausedSizeMB = pausedSizeMB;
	}
	public int getFileCount() {
		return FileCount;
	}
	public void setFileCount(int fileCount) {
		FileCount = fileCount;
	}
	public int getRemainingFileCount() {
		return RemainingFileCount;
	}
	public void setRemainingFileCount(int remainingFileCount) {
		RemainingFileCount = remainingFileCount;
	}
	public int getRemainingParCount() {
		return RemainingParCount;
	}
	public void setRemainingParCount(int remainingParCount) {
		RemainingParCount = remainingParCount;
	}
	public int getMinPostTime() {
		return MinPostTime;
	}
	public void setMinPostTime(int minPostTime) {
		MinPostTime = minPostTime;
	}
	public int getMaxPostTime() {
		return MaxPostTime;
	}
	public void setMaxPostTime(int maxPostTime) {
		MaxPostTime = maxPostTime;
	}
	public int getMinPriority() {
		return MinPriority;
	}
	public void setMinPriority(int minPriority) {
		MinPriority = minPriority;
	}
	public int getMaxPriority() {
		return MaxPriority;
	}
	public void setMaxPriority(int maxPriority) {
		MaxPriority = maxPriority;
	}
	public int getActiveDownloads() {
		return ActiveDownloads;
	}
	public void setActiveDownloads(int activeDownloads) {
		ActiveDownloads = activeDownloads;
	}
}

