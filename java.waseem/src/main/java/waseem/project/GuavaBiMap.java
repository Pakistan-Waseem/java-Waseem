/**
 * 
 */
package waseem.project;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
/**
 * @author waseem
 *
 */
public class GuavaBiMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiMap<Integer, String> empIDNameMap = HashBiMap.create();
	      empIDNameMap.put(new Integer(101), "Zahid");
	      empIDNameMap.put(new Integer(102), "Rene");
	      empIDNameMap.put(new Integer(103), "Jaiky");
	      empIDNameMap.put(new Integer(102),  "" );
	      System.out.println(empIDNameMap.size());
	      Set<String> Names= empIDNameMap.values();
	      System.out.println(Names.toString());
        BiMap<String, Integer> inverseMap=empIDNameMap.inverse();
	      System.out.println(inverseMap.get("Rene"));
	      System.out.println(inverseMap.size());
	}

}

