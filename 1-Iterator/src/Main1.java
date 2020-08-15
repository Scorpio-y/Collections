import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// 迭代器的使用
public class Main1 {
	public static void main(String[] args) {
		Main1 test = new Main1();
		test.hashMapIterator();
		test.arrayListIterator();
		test.hashSetIterator();
	}
	
	// HashMap迭代器，存储无序
	public void hashMapIterator() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(0, 1);
		map.put(3, 6);
		map.put(2, 4);
		System.out.println(map.remove(0));
		Iterator<Map.Entry<Integer, Integer>> ite = map.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, Integer> entry = ite.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
	
	// ArrayList迭代器，存储有序
	public void arrayListIterator() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(2);
		list.add(4);
		
		int[] list2arr = list.stream().mapToInt(Integer::valueOf).toArray();
		
		System.out.println(list.remove(1));	// 删除索引为1的元素，返回索引为1的值
		System.out.println(list.remove(Integer.valueOf(4)));	// 删除4这个元素
		
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	
	// HashSet迭代器，存储无序
	public void hashSetIterator() {
		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("Abc");
		set.add("acb");
		set.add("bcas");
		set.add("abcd");
		set.remove("Abc");
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}