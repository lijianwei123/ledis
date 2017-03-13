package com.lamp.ledis.create;

import java.nio.Buffer;

import com.alibaba.fastjson.TypeReference;

public interface KeyCreate<T> {
	
	
	public String getKeyPrefix();
	
	/**
	 *  
	 * @param t
	 * @return
	 */
	//TODO
	public String getKeySuffix(T t);
	
	
	public Buffer getKeySuffixByteAarry(T t);
	
	public String getKey(T t);
	
	public String getKey(String t);
	
	public String getKey(long num);
	
	public Class< ? > getEntityClass();
	
	public TypeReference< ? > getTypeReferenceList();
	
	public TypeReference< ? >  getTypeReferenceSet();
	
	public TypeReference< ? >  getTypeReferenceMap();
	

}
