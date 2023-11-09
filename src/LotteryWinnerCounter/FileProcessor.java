package LotteryWinnerCounter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Collections.sort;

public class FileProcessor {

    private String FILENAME;

    FileProcessor(String fileName) throws FileNotFoundException {
        FILENAME = fileName;
    }

    List<byte[]> prepareTicketList(String fileName) {
        BufferedReader reader;
        List<byte[]> preparedTicketList = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(FILENAME));
            String line = reader.readLine();
            byte[] ticketAsByteArray = new byte[Validator.DRAW_COUNT];
            while (line != null) {
                String[] ticketAsStringArray = line.split(" ");
                //Ez a kétszeres átalakítás sem túl hatékony. Hogyan lehetne egyszerűbben byte tömböet kapni a String sorokból?
                int i = 0;
                for (String number : ticketAsStringArray) {
                    ticketAsByteArray[i++] = Byte.parseByte(number);
                }
                preparedTicketList.add(ticketAsByteArray);
                //Ki kell ürtsem a byte tömböt a köv. iteráció előtt?
                //TODO hibaellenőrzés (pl. mi van, ha 5nél kevesebb vagy több elem volt az adott sorban?) + logolás
            }
        } catch (IOException e) {
            //TODO log
        }
        Validator.validate(preparedTicketList);
        System.out.println("READY");
        return preparedTicketList;
    }


}
