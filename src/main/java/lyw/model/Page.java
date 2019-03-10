package lyw.model;

public class Page {
	private int start = 0; //记录每页的起始值
	private int end;//记录最后一页的起始值 用与尾页查询
	private int page_count = 3;//每一页的value数量
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getPage_count() {
		return page_count;
	}
	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}
	
	public void calc(int count) {
		if(count%page_count==0) end = (count/page_count-1)*page_count;
		else end = count/page_count*page_count;
	}
	
}
