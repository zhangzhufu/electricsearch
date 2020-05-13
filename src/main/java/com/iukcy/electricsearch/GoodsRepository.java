package com.iukcy.electricsearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * @Description: TODO
 * @ProjectName electricsearch
 * @Author zhangzhufu
 * @date 2020/5/13 15:42
 */

@Component
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {

    /**
     * 根据价格区间查询
     * @param price1
     * @param price2
     * @return
     */
    List<Goods> findByPriceBetween(double price1, double price2);

    Goods findByTitle(String title);

    List<Goods> findByTitleContaining(String name);
}
