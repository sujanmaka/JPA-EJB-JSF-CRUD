package DAOTry;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class Helper {

    private static final Calendar CALENDAR = GregorianCalendar.getInstance();
    public static final transient String[] NAMES = {"Djokovic", "Federer", "Murray", "Nadal", "Ferrer", "Berdych", "Del Potro", "Tsonga", "Tipsarevic", "Gasquet"};
    public static final transient String[] SURNAMES = {"Novak", "Roger", "Andy", "Rafael", "David", "Tomas", "Juan Martin", "Jo-Wilfried", "Janko", "Richard"};
    public static final transient int[] AGES = {25, 31, 25, 26, 30, 27, 24, 27, 28, 26};
    public static final transient Date[] BIRTHS = new Date[10];
    public static final transient String[] BIRTHPLACES = {"Belgrade, Serbia", "Basel, Switzerland", "Dunblane, Scotland", "Manacor, Mallorca, Spain", "Javea, Spain", "Valasske Mezirici, Czech", "Tandil, Argentina", "Le Mans, France", "Belgrade, Serbia", "Beziers, France"};
    public static final transient String[] RESIDENCES = {"Monte Carlo, Monaco", "Bottmingen, Switzerland", "London, England", "Manacor, Mallorca, Spain", "Valencia, Spain", "Monte Carlo, Monaco", "Tandil, Argentina", "Gingins, Switzerland", "Belgrade, Serbia", "Neuchatel, Switzerland"};
    public static final transient String[] HEIGHTS = {"188 cm", "185 cm", "190 cm", "185 cm", "175 cm", "196 cm", "198 cm", "188 cm", "180 cm", "185 cm"};
    public static final transient String[] WEIGHTS = {"176 lbs (80 kg)", "187 lbs (85 kg)", "185 lbs (84 kg)", "188 lbs (85 kg)", "160 lbs (73 kg)", "200 lbs (91 kg)", "214 lbs (97 kg)", "200 lbs (91 kg)", "176 lbs (80 kg)", "165 lbs (75 kg)"};
    public static final transient String[] PLAYS = {"Right-handed", "Right-handed", "Right-handed", "Left-handed", "Right-handed", "Right-handed", "Right-handed", "Right-handed", "Right-handed", "Right-handed"};
    public static final transient int[] TURNEDPRO = {2003, 1998, 2005, 2001, 2000, 2002, 2005, 2004, 2002, 2002};
    public static final transient String[] COACHS = {"Marian Vajda", "Paul Annacone", "Ivan Lendl", "Toni Nadal", "Javier Piles", "Tomas Krupa", "Franco Davin", "Roger Rasheed", "none", "Piatti, Grosjean"};
    public static final transient String[] WEBSITES = {"http://www.novakdjokovic.com", "http://www.rogerfederer.com", "http://www.andymurray.com", "http://www.rafaelnadal.com", "http://www.davidferrer.com", "http://tomasberdych.cz", "none", "none", "http://www.jtipsarevic.com", "http://richardgasquet.net"};
    public static final transient int[] RANKINGS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static final transient String[] PRIZES = {"$45,686,497", "$76,014,777", "$24,934,421", "$50,061,827", "$17,178,869", "$13,139,293", "$10,853,349", "$10,676,927", "$6,600,238", "$7,540,613"};
    public static final transient String[] RACQUETS = {"Head YOUTEK Graphene Speed Pro", "Wilson BLX Pro Staff", " Head YOUTEK IG Radical Pro", "Babolat AeroPro Drive 2013", "Prince EXO3 Tour 100", "Head YOUTEK Graphene Instinct MP", "Wilson Juice Pro BLX", "Babolat AeroPro Drive 2013", "Tecnifibre TFight 325 VO2 Max", "Head YOUTEK IG Extreme Pro 2.0"};
    public static final transient String[][] PHOTOS = {{"novak_1.png", "novak_2.png", "novak_3.png"}, {"federer_1.png", "federer_2.png"}, {"murray_1.png", "murray_2.png", "murray_3.png", "murray_4.png"},
    {"nadal_1.png", "nadal_2.png", "nadal_3.png", "nadal_4.png"}, {"ferrer_1.png", "ferrer_2.png"}, {"berdych_1.png", "berdych_2.png", "berdych_3.png"}, {"delpotro_1.png", "delpotro_2.png", "delpotro_3.png", "delpotro_4.png"},
    {"tsonga_1.png", "tsonga_2.png"}, {"tipsarevic_1.png", "tipsarevic_2.png", "tipsarevic_3.png"}, {"gasquet_1.png", "gasquet_2.png", "gasquet_3.png", "gasquet_4.png"}};
    public static final transient String[][] FANS = {{"Novak Message 1 ...", "Novak Message 2 ...", "Novak Message 3 ..."},
    {"Federer Message 1 ...", "Federer Message 2 ..."},
    {"Andy Message 1 ...", "Andy Message 2 ..."},
    {"Nadal Message 1 ...", "Nadal Message 2 ...", "Nadal Message 3 ...", "Nadal Message 4 ..."},
    {"Ferrer Message 1 ...", "Ferrer Message 2 ...", "Frrer Message 3 ..."},
    {"Berdych Message 1 ...", "Berdych Message 2 ...", "Berdych Message 3 ..."},
    {"Del Potro Message 1 ...", "Del Potro Message 2 ..."},
    {"Tsonga Message 1 ...", "Tsonga Message 2 ..."},
    {"Tipsarevic Message 1 ...", "Tipsarevic Message 2 ...", "Tipsarevic Message 3 ..."},
    {"Gasquet Message 1 ...", "Gasquet Message 2 ...", "Gasquet Message 3 ...", "Gasquet Message 4 ..."}};

    static {
        CALENDAR.clear();
        CALENDAR.set(1987, Calendar.MAY, 22); //22.05.1987
        BIRTHS[0] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1981, Calendar.AUGUST, 8); //08.08.1981
        BIRTHS[1] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1987, Calendar.MAY, 15); //15.05.1987
        BIRTHS[2] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1986, Calendar.JUNE, 3); //03.06.1986
        BIRTHS[3] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1982, Calendar.APRIL, 2); //02.04.1982
        BIRTHS[4] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1985, Calendar.SEPTEMBER, 17); //17.09.1985
        BIRTHS[5] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1988, Calendar.SEPTEMBER, 23); //23.09.1988
        BIRTHS[6] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1985, Calendar.APRIL, 17); //17.04.1985
        BIRTHS[7] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1984, Calendar.JUNE, 22); //22.06.1984
        BIRTHS[8] = CALENDAR.getTime();
        CALENDAR.clear();
        CALENDAR.set(1986, Calendar.JUNE, 18); //18.06.1986
        BIRTHS[9] = CALENDAR.getTime();
        CALENDAR.clear();
    }
}
