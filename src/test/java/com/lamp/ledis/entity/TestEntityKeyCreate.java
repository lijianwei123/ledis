package com.lamp.ledis.entity;

import java.nio.Buffer;

import com.lamp.ledis.create.AbstractKeyCreate;

public class TestEntityKeyCreate extends AbstractKeyCreate<TestEntity> {

	public TestEntityKeyCreate(String key) {
		super(key);
	}

	@Override
	public String getKeySuffix(TestEntity t) {
		return getKey(t.getId());
	}

	@Override
	public Buffer getKeySuffixByteAarry ( TestEntity t ) {
		// TODO 自动生成的方法存根
		return null ;
	}
}
