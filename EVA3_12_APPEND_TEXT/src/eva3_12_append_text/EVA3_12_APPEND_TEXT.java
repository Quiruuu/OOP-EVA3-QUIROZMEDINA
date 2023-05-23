package eva3_12_append_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_12_APPEND_TEXT {
    public static void main(String[] args) {
        try {
            String ruta = "C:\\archivos\\";
            writeUsingBufferedWriter(ruta, "Prueba de APPEND!!!");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APPEND_TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException {
        File file = new File(ruta + "archivosBufferedWriter.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {//escribimos 10 lineas al archivo
            bufWriter.write((i + 1) + " " + datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
}
}