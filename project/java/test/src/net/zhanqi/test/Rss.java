package net.zhanqi.test;

import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class Rss {

    /**
     * @param args
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        Document doc = DocumentHelper.createDocument();
        doc.setXMLEncoding("utf-8");
        Element root = doc.addElement("rss");
        root.addAttribute("version", "2.0");
        root.addNamespace("content", "http://purl.org/rss/1.0/modules/content/");
        root.addNamespace("wfw", "http://wellformedweb.org/CommentAPI/");
        root.addNamespace("dc", "http://purl.org/dc/elements/1.1/");
        root.addNamespace("atom", "http://www.w3.org/2005/Atom");
        root.addNamespace("sy", "http://purl.org/rss/1.0/modules/syndication/");
        root.addNamespace("slash", "http://purl.org/rss/1.0/modules/slash/");
        
        Element author1 = root.addElement("channel").addAttribute("name", "James")
                .addAttribute("location", "UK").addText("James Strachan");
        
        author1.addElement("channel").addAttribute("name", "James")
        .addAttribute("location", "UK").addText("James Strachan");

        Element author2 = root.addElement("author").addAttribute("name", "Bob")
                .addAttribute("location", "US").addText("Bob McWhirter");
        
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setIndentSize(4);
        XMLWriter writer = new XMLWriter(format);
        writer.write(doc);
       // System.out.println(writer);
    }

}
