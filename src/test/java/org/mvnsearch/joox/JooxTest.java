package org.mvnsearch.joox;

import org.joox.Match;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import static org.joox.JOOX.$;

public class JooxTest {

    @Test
    public void testJoox() throws Exception {
        Document document = $(this.getClass().getResourceAsStream("/logback-test.xml")).document();
        Match elements = $(document).xpath("//appender");
        elements.forEach(element -> {
            System.out.println(element.getAttribute("class"));
        });
    }
}
