package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

import hust.soict.hedspi.aims.PlayerException;
import java.util.Iterator;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	ArrayList<Track> tracks = new ArrayList<Track>();
	

	public CompactDisc() {
		
	}
	
	public CompactDisc(String artist, ArrayList<Track> tracks,String title, String category, float cost,int id) {
		super(title,category,cost,id);
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public String  getArtist() {
		return artist;
	}
	
	public void addTrack(Track track ) {
		if(tracks.contains(track)) {
			System.out.println("Can't add Track!!! This track has been added");
		}
		else {
			tracks.add(track);
			System.out.println("Add track");
		}
	}
	
	public void removeTrack(Track track ) {
		if(tracks.contains(track)) {
			System.out.println("Remove Track!!! ");
			tracks.remove(track);
		}
		else {
			System.out.println("Error!!! Not Found Track");
		}
	}
	
	public int getLength() {
		int Length=0;
		for(int i=0;i<tracks.size();i++) {
			Length = Length + tracks.get(i).getLength();
		}
		return Length;
	}
	
	@Override
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			//System.out.println("Playing CD: " + this.getTitle());
			//System.out.println("CD length: " + this.getLength());
			Iterator iter = tracks.iterator();
			Track nextTrack;
			while(iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				} catch (Exception e) {
					// TODO: handle exception
					throw e;
				}
			}
		} else {
			throw new PlayerException("ERROR: CD length is non-positive");
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		CompactDisc CD = (CompactDisc) obj;
		if(CD == null) {
			System.out.println("CD is null");
			return -2;
		}
		else {
			if(this.tracks.size() == CD.tracks.size()) {
				if(this.getLength() == CD.getLength()) {
					int k = this.getTitle().compareTo(CD.getTitle());
					if(k < 0) return -1;
					else if(k == 0) return 0;
					else return 1;
				}
				else if(this.getLength() > CD.getLength())
					return 1;
				else
					return -1;
			}
			else if(this.tracks.size() > CD.tracks.size()) 
				return 1;
			else
				return -1;
		}
	}
	

}
