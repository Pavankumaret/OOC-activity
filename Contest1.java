import java.util.ArrayList;
import java.util.List;

public class Contest1 {
   public static List<String> splitString(String mainstr, char esc_char) {
      List<String> res = new ArrayList<String>();

	String str = "";
	for(char ch: mainstr.toCharArray()) {
	   if(ch == esc_char) {
	      res.add(str);
		str = "";
		continue;
	   }
			str+=ch;
	}

	if(!(str.equals(""))) {
		res.add(str);
	}

	return res;
  }

  public static void main(String[] args) {
	String str = "My name is 'PAVAN KUMAR E T' Im not working ";
      List<String> result = splitString(str, '\'');
      for (String ch : result) {
		System.out.println(ch);
	}
  }
}
