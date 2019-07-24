package concerttours.attributehandlers;
import concerttours.model.ConcertModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Component
public class ConcertDaysUntilAttributeHandler extends AbstractDynamicAttributeHandler<Long, ConcertModel>
{
    @Override
    public Long get(final ConcertModel model)
    {
        if (model.getDate() == null)
        {
            return null;
        }
        final ZonedDateTime concertDate = model.getDate().toInstant().atZone(ZoneId.systemDefault());
        final ZonedDateTime now = ZonedDateTime.now();
        if (concertDate.isBefore(now))
        {
            return Long.valueOf(0L);
        }
        final Duration duration = Duration.between(now, concertDate);
        return Long.valueOf(duration.toDays());
    }
}