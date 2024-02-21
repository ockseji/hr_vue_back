package kr.co.seoulit.erp.hr.attendance.dao;

import kr.co.seoulit.erp.hr.attendance.to.MonthAttdMgtTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface MonthAttdMgtDAO {
	public HashMap<String, Object> batchMonthAttdMgtProcess(HashMap<String, Object> map);

	public void updateMonthAttdMgtList(MonthAttdMgtTO monthAttdMgt);

	public void cancelMonthAttdMgtList(MonthAttdMgtTO monthAttdMgt);
}
