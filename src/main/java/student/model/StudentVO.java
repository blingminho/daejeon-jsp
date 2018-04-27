package student.model;
/**
 * StudentVO.java
 *
 * @author "K.S.J"
 * @since 2018. 4. 18.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 4. 18. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class StudentVO {
	
	private String stud_name;
	private String stud_no;
	private String stud_alias;
	
	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_alias() {
		return stud_alias;
	}

	public void setStud_alias(String stud_alias) {
		this.stud_alias = stud_alias;
	}

	public void setStud_no(String stud_no) {
		this.stud_no = stud_no;
	}

	public String getStud_no() {
		return stud_no;
	}

	public StudentVO(String stud_name, String stud_no, String stud_alias) {
		super();
		this.stud_name = stud_name;
		this.stud_no = stud_no;
		this.stud_alias = stud_alias;
	}

	public StudentVO() {
		super();
	}

	@Override
	public String toString() {
		return "StudentVO [stud_name=" + stud_name + ", stud_no=" + stud_no
				+ ", stud_alias=" + stud_alias + "]";
	}
	
	public StudentVO(String stud_no, String stud_name){
		this.stud_no = stud_no;
		this.stud_name = stud_name;
	}

}
