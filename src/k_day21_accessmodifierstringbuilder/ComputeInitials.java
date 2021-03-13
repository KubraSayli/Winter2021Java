package k_day21_accessmodifierstringbuilder;
//Write a program that computes your initials from your full name and displays them.
public class ComputeInitials {
	public static void main(String[] args) {
        String myName = "Fred F. Flintstone";
        StringBuffer myInitials = new StringBuffer();
        int length = myName.length();

        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                myInitials.append(myName.charAt(i));
            }
        }
        System.out.println("My initials are: " + myInitials);
    }
}
