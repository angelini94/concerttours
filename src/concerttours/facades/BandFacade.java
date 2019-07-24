package concerttours.facades;
import concerttours.data.BandData;

import java.util.List;

public interface BandFacade
{
    BandData getBand(String name);

    List<BandData> getBands();
}