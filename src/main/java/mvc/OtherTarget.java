package mvc;
/**
 * OtherTarget.java
 *
 * @author "K.S.J"
 * @since 2018. 5. 14.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 * 수정일 수정자 수정내용
 * ---------- ------ ------------------------
 * 2018. 5. 14. "K.S.J" 최초 생성
 *
 * </pre>
 */
public class OtherTarget implements TargetInterface{
	private String path;

	public OtherTarget(){
		path = "defaultPath";
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * Method : process
	 * 최초작성일 : 2018. 5. 14.
	 * 작성자 : "K.S.J"
	 * 변경이력 :
	 * @return
	 * Method 설명 :
	 */
	@Override
	public String process() {
		return getPath();
	}
}
