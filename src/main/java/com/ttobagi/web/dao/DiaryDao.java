package com.ttobagi.web.dao;

import java.util.List;

import com.ttobagi.web.entity.Diary;
import com.ttobagi.web.entity.DiaryView;

public interface DiaryDao {
	//-----------------------------------리스트 불러오기
		List<Diary> getList();
		List<DiaryView> getViewList();

		
		//-----------------------------------데이터 조작
		int insert(Diary diary);
		int delete(int id);
		
		
		
		
		
		//-----------------------------------페이지 전환
		Diary getPrev(int id);
		Diary getNext(int id);
}
