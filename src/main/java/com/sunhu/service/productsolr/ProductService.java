package com.sunhu.service.productsolr;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

/**
 * Created by Administrator on 2019/12/25.
 */
public interface ProductService {
    void addProduct() throws IOException, SolrServerException;
}
