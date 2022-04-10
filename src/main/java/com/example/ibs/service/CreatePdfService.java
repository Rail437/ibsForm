package com.example.ibs.service;

import com.lowagie.text.DocumentException;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import org.xhtmlrenderer.layout.SharedContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;
import java.nio.charset.StandardCharsets;

@Service
public class CreatePdfService {

    private final String CHARSET = StandardCharsets.UTF_8.name();


    /**
     * Метод, подготавливащий PDF документ.
     */
    public byte[] performPdfDocument(String path) {
        Document doc = null;
        File file = new File(path);
        try {
            //doc = Jsoup.parse(new File(path), CHARSET);
            doc = Jsoup.parse(file, CHARSET);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Получаем HTML код страницы
        assert doc != null;
        String html = doc.outerHtml();
        try {
            // Буффер, в котором будет лежать отформатированный HTML код
            ByteArrayOutputStream out = new ByteArrayOutputStream();

            // Форматирование HTML кода
            HtmlCleaner cleaner = new HtmlCleaner();
            CleanerProperties props = cleaner.getProperties();
            props.setCharset(CHARSET);
            TagNode node = cleaner.clean(html);
            new PrettyXmlSerializer(props).writeToStream(node, out);

            // Создаем PDF из подготовленного HTML кода
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(out.toString(CHARSET));
            renderer.layout();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            renderer.createPDF(outputStream);

            renderer.finishPDF();
            out.flush();
            out.close();

            byte[] result = outputStream.toByteArray();
            outputStream.close();
            return result;
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
