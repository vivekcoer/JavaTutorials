package generics.templatefunctions;

public class Util {
	public static <K,V> boolean compare(Pair <K,V> p1, Pair <K,V> p2) {
        return p1.getKey()==p2.getKey() && p1.getValue() == p2.getValue();
	}
}
