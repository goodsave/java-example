package com.goodsave.basic.xml;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

/**
 * XmlA
 * Created by Joker on 2017/9/4.
 */
public class XmlA {

    @Test
    public void test() throws JDOMException, IOException {
        SAXBuilder jdomBuilder = new SAXBuilder();
        Document jdomDocument = jdomBuilder.build(new StringReader(xmlValue.trim()));

        XPathExpression<Element> expr = XPathFactory.instance().compile("DataInfo", Filters.element());
        for (Element element : expr.evaluate(jdomDocument)){
           if ("200".equalsIgnoreCase(element.getChildText("Result"))) {
                return;
            }
        }
        System.out.println("sds");

    }


    private final static String xmlValue="<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<DataInfo> \n" +
            "\t<BrxxList>\n" +
            "\t  <Brxx>\n" +
            "\t\t<Zyhm>00775571</Zyhm>\n" +
            "\t\t<Brxm>曾德业</Brxm>\n" +
            "\t\t<Brxb>男</Brxb>\n" +
            "\t\t<csny>1970/1/2 0:00:00</csny>\n" +
            "\t\t<Brnl>47岁                </Brnl>\n" +
            "\t\t<Rycs>1</Rycs>\n" +
            "\t\t<Bqdm>6530</Bqdm>\n" +
            "\t\t<xzdz>广东省深圳市宝安区福永福海工业区</xzdz>\n" +
            "\t\t<jtdh>13724241279</jtdh>\n" +
            "\t\t<sfzh>432624197001028118</sfzh>\n" +
            "\t\t<Ksdm>6530</Ksdm>\n" +
            "\t\t<Ksmc>肿瘤放疗科</Ksmc>\n" +
            "\t\t<Brch>15</Brch>\n" +
            "\t\t<Ryrq>2017-07-10 09:00:00</Ryrq>\n" +
            "\t\t<Rkrq>2017-07-10 09:03:40</Rkrq>\n" +
            "\t\t<Zzys>2363</Zzys>\n" +
            "\t\t<Ysxm>徐钢</Ysxm>\n" +
            "\t\t<Zdmc />\n" +
            "\t\t<Zyh>1247531</Zyh>\n" +
            "\t  </Brxx>\n" +
            "\t  <Brxx>\n" +
            "\t\t<Zyhm>00750727</Zyhm>\n" +
            "\t\t<Brxm>陈秀华</Brxm>\n" +
            "\t\t<Brxb>女</Brxb>\n" +
            "\t\t<csny>1967/12/1 0:00:00</csny>\n" +
            "\t\t<Brnl>49岁                </Brnl>\n" +
            "\t\t<Rycs>12</Rycs>\n" +
            "\t\t<Bqdm>6530</Bqdm>\n" +
            "\t\t<xzdz>广东省深圳市龙岗区@杭梓人民西路148号</xzdz>\n" +
            "\t\t<jtdh>13537506358</jtdh>\n" +
            "\t\t<sfzh>510921196712012826</sfzh>\n" +
            "\t\t<Ksdm>6530</Ksdm>\n" +
            "\t\t<Ksmc>肿瘤放疗科</Ksmc>\n" +
            "\t\t<Brch>78</Brch>\n" +
            "\t\t<Ryrq>2017-09-04 08:45:00</Ryrq>\n" +
            "\t\t<Rkrq>2017-09-04 08:48:05</Rkrq>\n" +
            "\t\t<Zzys>2940</Zzys>\n" +
            "\t\t<Ysxm>龚龙</Ysxm>\n" +
            "\t\t<Zdmc />\n" +
            "\t\t<Zyh>1266244</Zyh>\n" +
            "\t  </Brxx>\n" +
            "\t</BrxxList>\n" +
            "\t<Result>200</Result>\n" +
            "\t<ErrorMsg>dsadsadasd</ErrorMsg>\n" +
            "</DataInfo>";
}
