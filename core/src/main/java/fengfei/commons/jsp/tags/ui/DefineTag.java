package fengfei.commons.jsp.tags.ui;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.*;

public class DefineTag extends BodyTagSupport {

    public final static String CONTEXT_KEY = "HARE_DEFINE_TAG_";
    private String name;


    @Override
    public int doStartTag() throws JspException {
//        try {
//            pageContext.getOut().clear();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("----------define start");
//        System.out.print(name);
//        System.out.print(": ");
//        System.out.println(bodyContent == null ? null : bodyContent.getString());
//        bodyContent = null;
        return EVAL_BODY_BUFFERED;
    }

    @Override
    public int doAfterBody() throws JspException {
//        System.out.println("----------define after");
//        System.out.print(name);
//        System.out.print(": ");
//        System.out.println(bodyContent == null ? null : bodyContent.getString());
        ServletRequest request = pageContext.getRequest();

        request.setAttribute(CONTEXT_KEY + name, bodyContent == null ? null : bodyContent.getString());


        return SKIP_BODY;
    }
//    @Override
//    public void doTag() throws JspException, IOException {
//        PageContext pageContext = (PageContext) getJspContext();
//        try {
//            pageContext.getOut().clear();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        ServletRequest request = pageContext.getRequest();
//        request.setAttribute(CONTEXT_KEY + name, this);
//
//    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    //    public void invoke(Writer out) throws IOException, JspException {
//        if (getJspBody() != null) {
//            getJspBody().invoke(out);
//        }
//
//    }

}
