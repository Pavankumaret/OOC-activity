import java.util.ArrayList;
import java.util.List;

public class Contest1 {
   public static List<String> splitString(String str, char esc) {
      List<String> res = new ArrayList<String>();

		// Your Logic goes here

	String st = "";
	for(char ch: str.toCharArray()) {
	   if(ch == esc) {
	      res.add(st);
		st = "";
		continue;
	   }
			st+=ch;
	}

	if(!(st.equals(""))) {
		res.add(st);
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
