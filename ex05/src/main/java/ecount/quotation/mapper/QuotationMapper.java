package ecount.quotation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ecount.quotation.domain.QuotationDTO;

@Mapper
public interface QuotationMapper {

	List<QuotationDTO> findAllQuot(); // 다중 조회

	QuotationDTO findQuotByAccNum(int acc_number); // 단일 조회

	int insertQuot(QuotationDTO quot);

	int updateQuot(QuotationDTO quot);

	int deleteQuot(QuotationDTO quot); // 데이터를 삭제하지 않고 deleted_at 부여
}
