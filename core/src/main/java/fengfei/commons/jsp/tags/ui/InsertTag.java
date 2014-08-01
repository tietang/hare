 
package fengfei.commons.jsp.tags.ui;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class InsertTag extends SimpleTagSupport {
	private String name;
//    @Override
//    public int doStartTag() throws JspException {
//        ServletRequest request = pageContext.getRequest();
//        DefineTag tag = (DefineTag) request.getAttribute(DefineTag.CONTEXT_KEY + name);
//        if (tag != null) {
//            try {
//                tag.invoke(pageContext.getOut());
//            } catch (IOException e) {
//                try {
//                    pageContext.getResponse().getWriter().write(e.getClass() + ": " + e);
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                }
//                throw new JspException(e.getMessage(), e);
//
//            }
//        }
//        return SKIP_BODY;
//    }

	@Override
	public void doTag() throws JspException, IOException {
		PageContext pageContext = (PageContext) getJspContext();
		ServletRequest request = pageContext.getRequest();
        String  bodyContent = (String) request.getAttribute(DefineTag.CONTEXT_KEY + name);
        if (bodyContent != null) {
//            System.out.println("----------insert");
//            System.out.print(name);
//            System.out.print(": ");
//            System.out.println(bodyContent );
            getJspContext().getOut().write(bodyContent);
//            bodyContent.writeOut(getJspContext().getOut());
        }
		super.doTag();
	}

	public String getName() {
		return name;
	}

	public void setName(
		String name) {
		this.name = name;
	}
}
