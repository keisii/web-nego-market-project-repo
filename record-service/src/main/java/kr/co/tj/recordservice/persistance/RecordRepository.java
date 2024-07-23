package kr.co.tj.recordservice.persistance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecordRepository extends JpaRepository<RecordEntity, Long>{

	Optional<RecordEntity> findFirstByBoardid(Long bid);

	@Query("SELECT obj FROM RecordEntity obj WHERE obj.seller = :param OR obj.buyer = :param")
	List<RecordEntity> findBySellerOrBuyer(@Param("param") String param);


}
