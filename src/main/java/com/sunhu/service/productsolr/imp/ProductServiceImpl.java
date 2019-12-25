package com.sunhu.service.productsolr.imp;

import com.sunhu.service.productsolr.ProductService;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by Administrator on 2019/12/25.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private SolrServer solrServer;

    @Override
    public void addProduct() throws IOException, SolrServerException {
        SolrInputDocument pDocument = new SolrInputDocument();
        pDocument.addField("id", UUID.randomUUID().toString().replaceAll("-",""));
        pDocument.addField("product_name","打底裤");
        pDocument.addField("product_catalog_name","加绒打底裤");
        pDocument.addField("product_price","60.45");
        pDocument.addField("product_description","穿上不热不冷，特别暖和，就是好好好");
        pDocument.addField("product_picture","暂无");
        solrServer.add(pDocument);
        solrServer.commit();
    }
}
