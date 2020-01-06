package org.sperri.mvc.example.firstApp;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jie zhao
 * @date 2020/1/4 15:23
 */
public class MyController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", "Hello Spring MVC!");
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
        return modelAndView;
    }
}
