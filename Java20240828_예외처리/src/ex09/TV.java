package ex09;

public class TV {

	private String model;
	private int size;
	private int channel;
	
	TV(){}
	TV(String model,int size,int channel){
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channelUp() {this.channel=channel+1; if(this.channel>10) {this.channel=1;}}
	public void channelDown() {this.channel=channel-1; if(this.channel<1) {this.channel=10;}}
	
	public void play() {}
	public void sale() {}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}
