package cn.bmob.sdkdemo.file;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

public class Song extends BmobObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String artist;
	
	private BmobFile mp3;
	private BmobFile lrc;
	
    public Song(){
	}
	
	public Song(String name, String artist, BmobFile mp3, BmobFile lrc){
		this.name =name;
		this.artist =artist;
		this.mp3 =mp3;
		this.lrc = lrc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public BmobFile getMp3() {
		return mp3;
	}
	public void setMp3(BmobFile mp3) {
		this.mp3 = mp3;
	}
	public BmobFile getLrc() {
		return lrc;
	}
	public void setLrc(BmobFile lrc) {
		this.lrc = lrc;
	}
}
