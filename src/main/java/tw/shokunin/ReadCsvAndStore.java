package tw.shokunin;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by sethur on 9/05/2016.
 */
public class ReadCsvAndStore {

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(ReadCsvAndStore.class.getResource("/testdataset.csv").getFile()));

            StoreInDb storeInDb = new StoreInDb();

            for (String line : lines) {
                String[] split = line.split(",");
                storeInDb.store(split);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
