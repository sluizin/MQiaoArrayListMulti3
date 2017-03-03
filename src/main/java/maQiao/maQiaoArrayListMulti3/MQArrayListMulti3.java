/**
 * 
 */
package maQiao.maQiaoArrayListMulti3;

import java.util.ArrayList;
import java.util.List;

/**
 * 3个泛型的检索，仿list
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
public class MQArrayListMulti3<T, V, E> {
	List<Unit<T, V, E>> list = new ArrayList<Unit<T, V, E>>(2);

	public void add(T t, V v, E e) {
		Unit<T, V, E> u = new Unit<T, V, E>(t, v, e);
		list.add(u);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.size() > 0;
	}

	boolean contains(Object... arrays) {
		return indexOf(arrays) != -1;
	}

	boolean contains(T t, V v, E e) {

		return false;
	}

	int indexOf(Object... arrays) {
		if (arrays == null || arrays.length == 0) return -1;
		for (int i = 0, arrlen = arrays.length, len = list.size(); i < len; i++) {
			Unit<T, V, E> e = list.get(i);
			if (e.t.equals((arrays[0]))) {
				if (arrlen > 1) {
					if (e.v.equals((arrays[1]))) {
						if (arrlen > 2) {
							if (e.e.equals((arrays[2]))) { return i; }
						} else {
							return i;
						}
					}
				} else {
					return i;
				}
			}
		}
		return -1;
	}

	int indexOf(T t, V v, E e) {
		if (t == null && v == null && e == null) return -1;
		Unit<T, V, E> u;
		for (int i = 0, len = list.size(); i < len; i++)
			if ((u = list.get(i)).equals0(t) && u.equals1(v) && u.equals2(e)) return i;
		return -1;
	}

	int indexOf0(T t) {
		if (t == null) return -1;
		for (int i = 0, len = list.size(); i < len; i++)
			if (list.get(i).equals0(t)) return i;
		return -1;
	}

	int indexOf1(V v) {
		if (v == null) return -1;
		for (int i = 0, len = list.size(); i < len; i++)
			if (list.get(i).equals1(v)) return i;
		return -1;
	}

	int indexOf2(E e) {
		if (e == null) return -1;
		for (int i = 0, len = list.size(); i < len; i++)
			if (list.get(i).equals2(e)) return i;
		return -1;
	}

	V[] toArray1(V[] v) {
		return toList1().toArray(v);
	}

	List<V> toList1() {
		int len = list.size();
		List<V> nList = new ArrayList<V>(len);
		for (int i = 0; i < len; i++)
			nList.add(list.get(i).v);
		return nList;
	}
	T[] toArray0(T[] t) {
		return toList0().toArray(t);
	}

	List<T> toList0() {
		int len = list.size();
		List<T> nList = new ArrayList<T>(len);
		for (int i = 0; i < len; i++)
			nList.add(list.get(i).t);
		return nList;
	}

	Object get(int index, int i) {
		if (index < 0 || index >= list.size() || i < 0 || i > 2) return null;
		switch (i) {
		case 0:
			return list.get(index).t;
		case 1:
			return list.get(index).v;
		default:
			return list.get(index).e;
		}
	}

	T get0(int index) {
		if (index < 0 || index >= list.size()) return null;
		return list.get(index).t;
	}

	V get1(int index) {
		if (index < 0 || index >= list.size()) return null;
		return list.get(index).v;
	}

	E get2(int index) {
		if (index < 0 || index >= list.size()) return null;
		return list.get(index).e;
	}

	static class Unit<T, V, E> {
		T t;
		V v;
		E e;

		Unit(T t, V v, E e) {
			this.t = t;
			this.v = v;
			this.e = e;
		}

		boolean equals0(T t) {
			if (this.t == null) return false;
			if (this.t == t || this.t.equals(t)) return true;
			return false;
		}

		boolean equals1(V v) {
			if (this.v == null) return false;
			if (this.v == v || this.v.equals(v)) return true;
			return false;
		}

		boolean equals2(E e) {
			if (this.e == null) return false;
			if (this.e == e || this.e.equals(e)) return true;
			return false;
		}
	}
}
