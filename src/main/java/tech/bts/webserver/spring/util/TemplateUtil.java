package tech.bts.webserver.spring.util;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.io.StringWriter;

public class TemplateUtil {

    public static String createHtml (String templateFile, Object object) throws Exception {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(templateFile);
        StringWriter writer = new StringWriter();
        IOUtils.copy(inputStream, writer, "UTF-8");
        String html = writer.toString();

        /* String html1 = html.replace("PRODUCT_HERE", hTMLProducts); */

        Handlebars handlebars = new Handlebars();
        Template template = handlebars.compileInline(html);
        html = template.apply(object);

        return html;
    }
}
