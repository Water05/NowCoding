package cn.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayTest {
	/*
	 * public static int[] findElement(int[][] mat, int n, int m, int x) { //
	 * write code here
	 * 
	 * int nIndex=0; int mIndex=0; for(int i=0;i<n;i++){ if(mat[i][m-1]>=x){
	 * for(int j=0;j<m;j++){ if(mat[i][j]==x){ nIndex=i; mIndex=j; break; } } }
	 * if(mat[nIndex][mIndex]==x){ break; } } int []rtn={nIndex,mIndex}; return
	 * rtn; } public static void main(String[] args) {
	 * int[][]testArr={{1,2,3},{4,5,6}}; int
	 * []result=findElement(testArr,2,3,6);
	 * System.out.println(result[0]+":"+result[1]);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		HashMap map = new HashMap();
		Map<String[], List<Integer>> dataProcess = new HashMap<String[], List<Integer>>();
		String[] str = { "1", "2" };
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		dataProcess.put(str, list);
		Set set1;
		set1 = dataProcess.entrySet();
		for (Iterator iter = set1.iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();

			String[] key = (String[]) entry.getKey();
			List<Integer> value = (List<Integer>) entry.getValue();
			System.out.println(key + " :" + value);
		}
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");

		Set set = map.entrySet();

		for (Iterator iter = set.iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();

			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			 System.out.println(key +" :" + value);
		}
	}
}
