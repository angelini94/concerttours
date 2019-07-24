package concerttours.service;
import concerttours.model.NewsModel;

import java.util.Date;
import java.util.List;

public interface NewsService
{
    List<NewsModel> getNewsOfTheDay(Date date);
}