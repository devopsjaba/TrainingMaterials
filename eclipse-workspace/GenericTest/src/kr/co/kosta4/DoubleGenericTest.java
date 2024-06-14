package kr.co.kosta4;

class KeyValue<K, V> {
	private K key;
	private V value;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class DoubleGenericTest {
	public static void main(String[] args) {
		//제네릭 타입 변수 K, V가 각각 Integer, String 타입으로 결정 
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setKey("참외");
		kv1.setValue(10000);
		String key1 = kv1.getKey();
		int value1 = kv1.getValue();
		System.out.println("key: " +key1+ ", value: " + value1);
		
		//제네릭 타입 변수 K, V가 각각 String, Integer 타입으로 결정 
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(200);
		kv2.setValue("요청이 성공했음을 나타내는 성공 응답 상태 코드입니다");
		int key2 = kv2.getKey();
		String value2 = kv2.getValue();
		System.out.println("key2: " +key2+ ", value2: " + value2);
	}
}



















