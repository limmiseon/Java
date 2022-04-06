import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java009_A2 {
	 public static void main(String[] args) {
	      List<String> list = new ArrayList<String>();
	      list.add("Mike 89");
	      list.add("Jay 88");
	      list.add("Kim 92");
	      list.add("Lee 85");
	      list.add("Park 90");
	      Integer[] numList = new Integer[list.size()];
	      List<String> name = new ArrayList<String>();

	      for (int i = 0; i < list.size(); i++) {
	         numList[i] = (Integer.parseInt(list.get(i).substring(list.get(i).length() - 2)));
	      }
	      
	      Arrays.sort(numList, Collections.reverseOrder());

	    for (int i = 0; i < numList.length; i++) {
	         for (int j = 0; j < numList.length; j++) {
	            if (list.get(j).contains(Integer.toString(numList[i]))) {
	               name.add(list.get(j).substring(0, list.get(j).length() - 3));
	            }
	         }
	      }
	    System.out.println("#Rank");
	    System.out.println(name);
	 }
}
