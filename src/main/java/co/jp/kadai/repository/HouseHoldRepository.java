package co.jp.kadai.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import co.jp.kadai.dto.HouseHoldListDto;
import co.jp.kadai.entity.HouseHold;

@Mapper
public interface HouseHoldRepository {

	List<HouseHoldListDto> findAllByYearMonth();

	List<HouseHold> getDetails(int year, int month);

	Integer getDetailTotal(int year, int month);

	void saveHouseHold(HouseHold household);

	void updateHouseHold(HouseHold household);

	HouseHold getById(int id);

}
