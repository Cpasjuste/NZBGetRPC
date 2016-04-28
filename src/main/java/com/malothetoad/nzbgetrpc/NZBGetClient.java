package com.malothetoad.nzbgetrpc;

import java.util.ArrayList;

import org.alexd.jsonrpc.JSONRPCClient;
import org.alexd.jsonrpc.JSONRPCException;
import org.alexd.jsonrpc.JSONRPCParams.Versions;
import org.json.JSONArray;
import org.json.JSONException;

public class NZBGetClient 
{
	String host;
	String port;
	String user;
	String pass;
	
	JSONRPCClient rpc;
	
	public NZBGetClient( String _host, String _port, String _user, String _pass )
	{
		host = _host;
		port = _port;
		user = _user;
		pass = _pass;
		
		rpc = JSONRPCClient.create( 
				"http://"+host+":"+port+"/jsonrpc/", Versions.VERSION_2, user, pass );
		
		//rpc.setDebug( true );
		rpc.setConnectionTimeout( 2000 );
		rpc.setSoTimeout( 2000 );
	}

	
	
	public boolean pause()
	{
		try 
		{
			return rpc.callBoolean( "pause" );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean pause2()
	{
		try 
		{
			return rpc.callBoolean( "pause2" );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean resume()
	{
		try 
		{
			return rpc.callBoolean( "resume" );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean resume2()
	{
		try 
		{
			return rpc.callBoolean( "resume" );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean shutdown()
	{
		try 
		{
			return rpc.callBoolean( "shutdown" );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public String getVersion()
	{
		try 
		{
			return rpc.callString( "version" );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Status getStatus()
	{
		try 
		{
			Status s = new Status( rpc.callJSONObject( "status" ) );
			s.setGroups( getGroups() );
			return s;
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean setRate( int limit )
	{
		try 
		{
			return rpc.callBoolean( "rate", limit );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<Log> getLogs( int from, int count )
	{
		try 
		{
			JSONArray array = rpc.callJSONArray( "log", from, count );
			if( array != null )
			{
				ArrayList<Log> logs = new ArrayList<Log>();
				for( int i=0; i<array.length(); i++ )
					logs.add( new Log( array.getJSONObject( i ) ) );
				return logs;
			}
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		catch ( JSONException e )
		{
			e.printStackTrace();
		}
		return null;
	}
	
	private ArrayList<Group> getGroups()
	{
		try 
		{
			JSONArray array = rpc.callJSONArray( "listgroups" );
			if( array != null )
			{
				ArrayList<Group> groups = new ArrayList<Group>();
				for( int i=0; i<array.length(); i++ )
					groups.add( new Group( array.getJSONObject( i ) ) );
				return groups;
			}
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		catch ( JSONException e )
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<File> getFiles( int from, int to, int nzbid )
	{
		try 
		{
			JSONArray array = rpc.callJSONArray( "listfiles" );
			if( array != null )
			{
				ArrayList<File> files = new ArrayList<File>();
				for( int i=0; i<array.length(); i++ )
					files.add( new File( array.getJSONObject( i ) ) );
				return files;
			}
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		catch ( JSONException e )
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean groupPause( Group group )
	{
		try 
		{
			return rpc.callBoolean( "editqueue", "GroupPause", 0, "", group.getLastID() );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean groupResume( Group group )
	{
		try 
		{
			return rpc.callBoolean( "editqueue", "GroupResume", 0, "", group.getLastID() );
		}
		catch( JSONRPCException e )
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
