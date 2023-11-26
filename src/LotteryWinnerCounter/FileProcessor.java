package LotteryWinnerCounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class FileProcessor {

    private String filename;

    FileProcessor(String filename) {
        this.filename = filename;
        //TODO már itt kéne ellenőrizni, hogy valid file-ról van-e szó
        // ekkor exceptiont is dobhat - lehet konstruktorban exception dobás?
    }

    List<Set<Byte>> prepareTicketList() throws IOException {
        List<Set<Byte>> preparedTicketList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            Set<Byte> ticket = new TreeSet<>();
            while (line != null) {
                ticket = Transformer.fromStringToByteSet(line);
                if (Validator.isValidTicket(ticket)) {
                    preparedTicketList.add(ticket);
                    line = reader.readLine();
                }
            }
            return preparedTicketList;
        }
    }


}
