package example.com.nestedClass;

public class MemberOuterClassChild extends MemberOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberOuterClass aa = new MemberOuterClass();
		MemberOuterClass.MemberInnerClass aaaaa =aa.new MemberInnerClass();
		aaaaa.DisplayMessage();

	}

}
