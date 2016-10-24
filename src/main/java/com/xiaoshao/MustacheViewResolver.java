package com.xiaoshao;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractTemplateViewResolver;

import java.util.Locale;

public class MustacheViewResolver extends AbstractTemplateViewResolver{

    @Override
    protected View loadView(String viewName, Locale locale) throws Exception {
        return super.loadView(viewName, locale);
    }
}
