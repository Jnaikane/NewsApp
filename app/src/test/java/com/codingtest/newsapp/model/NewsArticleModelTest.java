package com.codingtest.newsapp.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NewsArticleModelTest
{
    private static NewsArticleModel title ,author,description,url,publishedAt,content;
    private static NewsArticleModel instance;

     @BeforeClass
     public static void init(){
         instance = mock(NewsArticleModel.class);
         title = new NewsArticleModel();
         author = new NewsArticleModel();
         description = new NewsArticleModel();
         publishedAt = new NewsArticleModel();
         url = new NewsArticleModel();
         content = new NewsArticleModel();

         title.setTitle("Oppo Find N2 Flip debuts globally");
         author.setAuthor("Govind Choudhary");
         description.setDescription("Previous outbreaks and sporadic cases have been reported in other parts of Africa");
         publishedAt.setPublishedAt("2023-02-16T04:29:06Z");
         url.setUrl("https://www.livemint.com/technology/gadgets/oppo-find-n2-flip-debuts-globally-how-it-compares-samsung-galaxy-z-flip-4-11676516853009.html");
         content.setContent("Chinese technology giant Oppo launched its Oppo");

         when(instance.getTitle()).thenReturn(String.valueOf(title));
         when(instance.getAuthor()).thenReturn(String.valueOf(author));
         when(instance.getDescription()).thenReturn(String.valueOf(description));
         when(instance.getPublishedAt()).thenReturn(String.valueOf(publishedAt));
         when(instance.getUrl()).thenReturn(String.valueOf(url));
         when(instance.getContent()).thenReturn(String.valueOf(content));
     }

     @Test
     public void getNewsArticleTestData()
    {
        String  titlet =String.valueOf(title) ;
        String t_title = instance.getTitle();
        assertNotNull(t_title);
        assertEquals(titlet, t_title);

        String  authr =String.valueOf(author) ;
        String auther = instance.getAuthor();
        assertNotNull(auther);
        assertEquals(authr, auther);

        String  desc =String.valueOf(description) ;
        String descript = instance.getDescription();
        assertNotNull(descript);
        assertEquals(desc, descript);

        String  publishedat =String.valueOf(publishedAt) ;
        String publish = instance.getPublishedAt();
        assertNotNull(publish);
        assertEquals(publishedat, publish);

        String  urlr =String.valueOf(url) ;
        String Url = instance.getUrl();
        assertNotNull(Url);
        assertEquals(urlr, Url);

        String  Content =String.valueOf(content) ;
        String contents = instance.getContent();
        assertNotNull(contents);
        assertEquals(Content, contents);

    }
}
