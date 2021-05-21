package simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class ConverterData {
    public static void main(String[] args) {

        Date data = new Date();

        SimpleDateFormat converter = new SimpleDateFormat("dd/MM/yy - HH:mm:ss");

        String dataConvertida = converter.format(data);

        System.out.println(dataConvertida);

    }

}
