package com.malothetoad.nzbgetrpc;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

public class Status 
{
	ArrayList<Group> groups = new ArrayList<Group>();

	int remainingSizeLo; //Remaining size of all entries in download queue, in bytes. This field contains the low 32-bits of 64-bit value
	int remainingSizeHi; //Remaining size of all entries in download queue, in bytes. This field contains the high 32-bits of 64-bit value
	int remainingSizeMB; //Remaining size of all entries in download queue, in megabytes.
	int downloadedSizeLo; //Amount of data downloaded since server start, in bytes. This field contains the low 32-bits of 64-bit value
	int downloadedSizeHi; //Amount of data downloaded since server start, in bytes. This field contains the high 32-bits of 64-bit value
	int downloadedSizeMB; //Amount of data downloaded since server start, in megabytes.
	int downloadRate; //Current download speed, in Bytes per Second.
	int averageDownloadRate; //Average download speed since server start, in Bytes pro Second.
	int downloadLimit; //Current download limit, in Bytes pro Second. The limit can be changed via method "rate". Be aware of different scales used by the method rate (Kilobytes) and this field (Bytes).
	int threadCount; //Number of threads running. It includes all threads, created by the program, not only download-threads.
	int parJobCount; //Number of ParJobs in Par-Checker queue (including current file). NOTE: deprecated, use PostJobCount instead.
	int postJobCount; //Number of Par-Jobs or Post-processing script jobs in the post-processing queue (including current file).
	int urlCount; //Number of URLs in the URL-queue (including current file).
	int upTimeSec; //Server uptime in seconds.
	int downloadTimeSec; //Server download time in seconds.
	boolean serverStandBy; //	"False" - there are currently downloads running, "True" - no downloads in progress (server paused or all jobs completed).
	boolean serverPaused; //"True" if server is currently in paused-state. NOTE: deprecated, use DownloadPaused instead.
	boolean downloadPaused; //"True" if download queue is paused via first pause register (soft-pause).
	boolean download2Paused	; //"True" if download queue is paused via second pause register (manual pause)
	boolean postPaused; //"True" if post-processor queue is currently in paused-state.
	boolean scanPaused; //"True" if the scanning of incoming nzb-directory is currently in paused-state.
	
	
	public Status( JSONObject obj )
	{
		try 
		{
			remainingSizeLo = obj.getInt( "RemainingSizeLo" );
			remainingSizeHi = obj.getInt( "RemainingSizeHi" );
			remainingSizeMB = obj.getInt( "RemainingSizeMB" );
			downloadedSizeLo = obj.getInt( "DownloadedSizeLo" );
			downloadedSizeHi = obj.getInt( "DownloadedSizeHi" );
			downloadedSizeMB = obj.getInt( "DownloadedSizeMB" );
			downloadRate = obj.getInt( "DownloadRate" );
			averageDownloadRate = obj.getInt( "AverageDownloadRate" );
			downloadLimit = obj.getInt( "DownloadLimit" );
			threadCount = obj.getInt( "ThreadCount" );
			parJobCount = obj.getInt( "ParJobCount" );
			postJobCount = obj.getInt( "PostJobCount" );
			urlCount = obj.getInt( "UrlCount" );
			upTimeSec = obj.getInt( "UpTimeSec" );
			downloadTimeSec = obj.getInt( "DownloadTimeSec" );
			serverStandBy = obj.getBoolean( "ServerStandBy" );
			serverPaused = obj.getBoolean( "ServerPaused" );
			downloadPaused = obj.getBoolean( "DownloadPaused" );
			download2Paused = obj.getBoolean( "Download2Paused" );
			postPaused = obj.getBoolean( "PostPaused" );
			scanPaused = obj.getBoolean( "ScanPaused" );
		} 
		catch (JSONException e) 
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Group> getGroups() {
		return this.groups;
	}
	public void setGroups(  ArrayList<Group> g ) {
		this.groups = g;
	}
	
	public int getRemainingSizeLo() {
		return remainingSizeLo;
	}
	public void setRemainingSizeLo(int remainingSizeLo) {
		this.remainingSizeLo = remainingSizeLo;
	}
	public int getRemainingSizeHi() {
		return remainingSizeHi;
	}
	public void setRemainingSizeHi(int remainingSizeHi) {
		this.remainingSizeHi = remainingSizeHi;
	}
	public int getRemainingSizeMB() {
		return remainingSizeMB;
	}
	public void setRemainingSizeMB(int remainingSizeMB) {
		this.remainingSizeMB = remainingSizeMB;
	}
	public int getDownloadedSizeLo() {
		return downloadedSizeLo;
	}
	public void setDownloadedSizeLo(int downloadedSizeLo) {
		this.downloadedSizeLo = downloadedSizeLo;
	}
	public int getDownloadedSizeHi() {
		return downloadedSizeHi;
	}
	public void setDownloadedSizeHi(int downloadedSizeHi) {
		this.downloadedSizeHi = downloadedSizeHi;
	}
	public int getDownloadedSizeMB() {
		return downloadedSizeMB;
	}
	public void setDownloadedSizeMB(int downloadedSizeMB) {
		this.downloadedSizeMB = downloadedSizeMB;
	}
	public int getDownloadRate() {
		return downloadRate;
	}
	public void setDownloadRate(int downloadRate) {
		this.downloadRate = downloadRate;
	}
	public int getAverageDownloadRate() {
		return averageDownloadRate;
	}
	public void setAverageDownloadRate(int averageDownloadRate) {
		this.averageDownloadRate = averageDownloadRate;
	}
	public int getDownloadLimit() {
		return downloadLimit;
	}
	public void setDownloadLimit(int downloadLimit) {
		this.downloadLimit = downloadLimit;
	}
	public int getThreadCount() {
		return threadCount;
	}
	public void setThreadCount(int threadCount) {
		this.threadCount = threadCount;
	}
	public int getParJobCount() {
		return parJobCount;
	}
	public void setParJobCount(int parJobCount) {
		this.parJobCount = parJobCount;
	}
	public int getPostJobCount() {
		return postJobCount;
	}
	public void setPostJobCount(int postJobCount) {
		this.postJobCount = postJobCount;
	}
	public int getUrlCount() {
		return urlCount;
	}
	public void setUrlCount(int urlCount) {
		this.urlCount = urlCount;
	}
	public int getUpTimeSec() {
		return upTimeSec;
	}
	public void setUpTimeSec(int upTimeSec) {
		this.upTimeSec = upTimeSec;
	}
	public int getDownloadTimeSec() {
		return downloadTimeSec;
	}
	public void setDownloadTimeSec(int downloadTimeSec) {
		this.downloadTimeSec = downloadTimeSec;
	}
	public boolean isServerStandBy() {
		return serverStandBy;
	}
	public void setServerStandBy(boolean serverStandBy) {
		this.serverStandBy = serverStandBy;
	}
	public boolean isServerPaused() {
		return serverPaused;
	}
	public void setServerPaused(boolean serverPaused) {
		this.serverPaused = serverPaused;
	}
	public boolean isDownloadPaused() {
		return downloadPaused;
	}
	public void setDownloadPaused(boolean downloadPaused) {
		this.downloadPaused = downloadPaused;
	}
	public boolean isDownload2Paused() {
		return download2Paused;
	}
	public void setDownload2Paused(boolean download2Paused) {
		this.download2Paused = download2Paused;
	}
	public boolean isPostPaused() {
		return postPaused;
	}
	public void setPostPaused(boolean postPaused) {
		this.postPaused = postPaused;
	}
	public boolean isScanPaused() {
		return scanPaused;
	}
	public void setScanPaused(boolean scanPaused) {
		this.scanPaused = scanPaused;
	}
}
