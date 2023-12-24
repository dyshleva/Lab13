package com.example.OneMoreTask;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PDLRead {
    @SneakyThrows
    public Company parse(String url) {

        Document doc = Jsoup.connect(url).get();
        String name = doc.title();
        Elements description = doc.select("meta[name=description]");

        String mylogo = doc.select("link[rel$=icon]").attr("href");
        if (mylogo.startsWith("/")) {
            mylogo = url + mylogo;
        }

        return new Company(name, description.attr("content"), mylogo);
    }
}
