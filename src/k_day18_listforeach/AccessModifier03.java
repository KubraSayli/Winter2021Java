package k_day18_listforeach;

import k_day21_accessmodifierstringbuilder.AccessModifier01;

public class AccessModifier03 extends AccessModifier01{
public static void main(String[] args) {
	AccessModifier03 obj1 = new AccessModifier03();
	System.out.println(obj1.protectedString);
	obj1.protectedMethod();
	System.out.println(obj1.publicString);
	obj1.protectedMethod();
}

}
