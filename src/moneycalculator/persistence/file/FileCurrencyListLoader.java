
package moneycalculator.persistence.file;

import moneycalculator.persistence.CurrencyListLoader;
import moneycalculator.model.Currency;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCurrencyListLoader implements CurrencyListLoader{

    private final String fileName;

    public FileCurrencyListLoader(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public List<Currency> load() {
        List<Currency> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))){
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                String[] split = line.split(",");
                result.add(new Currency(split[0], split[1], split[2]));
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return result;
    }
}
