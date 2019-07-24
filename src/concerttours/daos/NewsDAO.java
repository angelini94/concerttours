package concerttours.daos;
import concerttours.model.NewsModel;

import java.util.Date;
import java.util.List;

public interface NewsDAO
{
    List<NewsModel> getNewsOfTheDay(Date date);
}