package com.cdac.generics;

public class CustomMap<K,V> {
	K key;
	V value;
	
	public void putEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public V get(K key){
		return value;
	}
	
	public K getKey(){
		return key;
	}
	
	public V getValue(){
		return value;
	}
}