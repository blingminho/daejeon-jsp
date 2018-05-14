package mvc;
/**
 * ClassLoad.java
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
public class ClassLoad {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		//Target 클래스 //new연산자
		String targetString = "Target";
		Target target = new Target();
		
		Class<TargetInterface> targetClass = (Class<TargetInterface>)Class.forName("mvc.Target");
		TargetInterface dynamicTarget = targetClass.newInstance();
		
		Class<TargetInterface> otherTargetClass = (Class<TargetInterface>)Class.forName("mvc.OtherTarget");
		TargetInterface dynamicOtherTarget = otherTargetClass.newInstance();
		
		
		System.out.println("dynamicTarget process : " + dynamicTarget.process());
		System.out.println("dynamicOtherTarget process : " + dynamicOtherTarget.process());
		
		
	}
}
