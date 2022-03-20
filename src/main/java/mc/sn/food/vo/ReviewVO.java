package mc.sn.food.vo;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component("reviewVO")
public class ReviewVO {
	private int reviewNO;
	private String reader;
	private String target;
	private int rate;
	private String review;
	private Timestamp reDate;

	public ReviewVO() {

	}

	public ReviewVO(int reviewNO, String reader, String target, int rate, String review, Timestamp rDate) {
		super();
		this.reviewNO = reviewNO;
		this.reader = reader;
		this.target = target;
		this.rate = rate;
		this.review = review;
		this.reDate = reDate;
	}

	public int getReviewNO() {
		return reviewNO;
	}

	public void setReviewNO(int reviewNO) {
		this.reviewNO = reviewNO;
	}

	public String getReader() {
		return reader;
	}

	public void setReader(String reader) {
		this.reader = reader;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Timestamp getreDate() {
		return reDate;
	}

	public void setreDate(Timestamp reDate) {
		this.reDate = reDate;
	}

	
}