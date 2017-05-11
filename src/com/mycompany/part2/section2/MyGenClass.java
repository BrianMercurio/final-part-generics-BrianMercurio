package com.mycompany.part2.section2;


public class MyGenClass<K, V> implements MyGenInterface <K, V>
{
	K key;
	V value;
	

	
	public MyGenClass(K _key, V _value)
	{
		key = _key;
		value = _value;
	}



	public K getKey() {
		
		return key;
	}



	@Override
	public V getValue() {
		return value;
	}
	

}

