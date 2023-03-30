package jp.co.internos.ecsite.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.internos.ecsite.model.entity.Goods;

public interface GoodsRepository extends JpaRepository<Goods, Long>{
	

}
