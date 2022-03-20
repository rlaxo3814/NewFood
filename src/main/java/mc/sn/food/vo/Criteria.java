package mc.sn.food.vo;

public class Criteria {

	private int page; // 현재 페이지 번호
	private int perPageNum; // 한 페이지에 게시할 글의 수
	private String wField = "wField";
	private String target;
	private String writerOrder = "order by reviewRate desc";
	// 특정 페이지의 게시글 시작 번호, 게시글 시작 행 번호
	// 현재 페이지의 게시글 시작 번호 = (현재 페이지 번호 - 1) * 페이지 당 게시할 글의 수
	public int getPageStart() {
		return (this.page - 1) * perPageNum;
	}

	public Criteria() {
		this.page = 1;
		this.perPageNum = 8;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		// 페이지가 음수가 되면 1페이지를 나타냄
		if (page <= 0) {
			this.page = 1;
		} else {
			this.page = page;
		}
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		this.perPageNum = perPageNum;
	}

	public String getwField() {
		return wField;
	}

	public void setwField(String wField) {
		this.wField = wField;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getWriterOrder() {
		return writerOrder;
	}

	public void setWriterOrder(String writerOrder) {
		this.writerOrder = writerOrder;
	}

	

	

	
	

}