package mc.sn.food.vo;

import org.springframework.stereotype.Component;

@Component("coachVO")
public class WriterVO {

	private int writerNO;
	private String writer;
	private String wField;
	private String wImg;
	private String wTitle;
	private String wContents;

	public WriterVO() {

	}

	public WriterVO(int writerNO, String writer, String wField, String wImg, String wTitle, String wContents) {
		super();
		this.writerNO = writerNO;
		this.writer = writer;
		this.wField = wField;
		this.wImg = wImg;
		this.wTitle = wTitle;
		this.wContents = wContents;
	}

	public int getWriterNO() {
		return writerNO;
	}

	public void setWriterNO(int writerNO) {
		this.writerNO = writerNO;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getwField() {
		return wField;
	}

	public void setwField(String wField) {
		this.wField = wField;
	}

	public String getwImg() {
		return wImg;
	}

	public void setwImg(String wImg) {
		this.wImg = wImg;
	}

	public String getwTitle() {
		return wTitle;
	}

	public void setwTitle(String wTitle) {
		this.wTitle = wTitle;
	}

	public String getwContents() {
		return wContents;
	}

	public void setwContents(String wContents) {
		this.wContents = wContents;
	}

	
}