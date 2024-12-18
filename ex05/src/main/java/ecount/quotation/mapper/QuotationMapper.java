package ecount.quotation.mapper;

import java.util.List;

import ecount.quotation.domain.QuotationDTO;

public interface QuotationMapper {

	List<QuotationDTO> findAllQuot(); // 다중 조회

	QuotationDTO findQuotByAccNum(); // 단일 조회

	int insertQuot(QuotationDTO quot);

	int updateQuot(QuotationDTO quot);

	int deleteQuot(Long accNum);
}
