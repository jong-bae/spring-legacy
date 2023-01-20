package com.sample.sample.vo.response;

import java.util.List;

import com.sample.common.util.PagingUtil;

import lombok.Data;

public class SamplePagingVO extends PagingUtil {

	private List<SampleDataResponseVO> list;	// 리스트 데이터

	public List<SampleDataResponseVO> getList() {
		return list;
	}

	public void setList(List<SampleDataResponseVO> list) {
		this.list = list;
	}
	
}
