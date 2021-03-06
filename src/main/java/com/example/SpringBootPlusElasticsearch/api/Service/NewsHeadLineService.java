package com.example.SpringBootPlusElasticsearch.api.Service;

import com.example.SpringBootPlusElasticsearch.api.Daos.NewsHeadLineDao;
import com.example.SpringBootPlusElasticsearch.api.Models.NewsHeadLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    Each function in this class is redirected to its Dao class which
    will handle required database operations.
*/
@Service
public class NewsHeadLineService {

    private NewsHeadLineDao newsHeadLineDao;
    
    @Autowired
    public NewsHeadLineService(NewsHeadLineDao newsHeadLineDao)
    {
        this.newsHeadLineDao = newsHeadLineDao;
    }

    public List<NewsHeadLine> getAllDoc() {
        return newsHeadLineDao.getAllDoc();
    }
}
