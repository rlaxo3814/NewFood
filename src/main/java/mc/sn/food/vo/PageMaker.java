package mc.sn.food.vo;

public class PageMaker {

	private Criteria cri;
	private int totalCount; // 총 게시글의 수
	private int startPage; // 시작 페이지 번호
	private int endPage; // 마지막 페이지 번호
	private boolean prev;
	private boolean next;
	private int displayPageNum = 5; // 화면에 보여질 페이지 번호의 개수

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}

	private void calcData() {
		// 끝 페이지 번호 = [현재 페이지 번호 / 화면에 보여질 페이지 번호의 개수] * 화면에 보여질 페이지 번호의 개수
		// Math.ceil은 가우스 함수
		endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);

		// 시작 페이지 번호 = (끝 페이지 번호 - 화면에 보여질 페이지 번호의 개수) + 1
		startPage = (endPage - displayPageNum) + 1;
		if (startPage <= 0)
			startPage = 1;

		// 마지막 페이지 번호 = 총 게시글 수 / 한 페이지에 게시하는 글의 수
		int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));
		if (endPage > tempEndPage) {
			endPage = tempEndPage;
		}

		// 이전 버튼 생성 여부 판단
		// 시작 페이지 번호가 1이 아니면 생성
		if (startPage == 1) {
			prev = false;
		} else {
			prev = true;
		}

		// 다음 버튼 생성 여부 판단
		// (끝 페이지 번호 * 한 페이지에 게시할 글의 수 < 총 게시글의 수)면 생성
		if (endPage * cri.getPerPageNum() < totalCount) {
			next = true;
		} else {
			next = false;
		}
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getDisplayPageNum() {
		return displayPageNum;
	}

	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
}