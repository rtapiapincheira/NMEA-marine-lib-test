import net.sf.marineapi.nmea.parser.SentenceFactory;
import net.sf.marineapi.nmea.sentence.GLLSentence;
import net.sf.marineapi.nmea.sentence.TalkerId;
import net.sf.marineapi.nmea.util.DataStatus;
import net.sf.marineapi.nmea.util.Position;
import net.sf.marineapi.nmea.util.Time;

public class Main {

    public static void main(String[] args) {
        SentenceFactory sf = SentenceFactory.getInstance();
        GLLSentence gll = (GLLSentence) sf.createParser(TalkerId.GP, "GLL");

        gll.setPosition(new Position(-33.448066, -70.641499));
        gll.setStatus(DataStatus.ACTIVE);
        gll.setTime(new Time(0, 0, 30));

        System.out.println(gll.toSentence());
        // Outputs: $GPGLL,3326.884,S,07038.490,W,000030.000,A*39
    }

}