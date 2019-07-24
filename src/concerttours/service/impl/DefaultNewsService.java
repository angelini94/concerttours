package concerttours.service.impl;
import concerttours.daos.NewsDAO;
import concerttours.model.NewsModel;
import concerttours.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class DefaultNewsService implements NewsService
{
    @Autowired
    private NewsDAO newsDAO;


    public void setNewsDAO(final NewsDAO newsDAO)
    {
        this.newsDAO = newsDAO;
    }

    @Override
    public List<NewsModel> getNewsOfTheDay(final Date date)
    {
        return newsDAO.getNewsOfTheDay(date);
    }
}