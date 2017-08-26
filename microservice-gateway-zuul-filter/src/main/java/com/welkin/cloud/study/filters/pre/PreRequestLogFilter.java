package com.welkin.cloud.study.filters.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * User: 章华隽
 * E-mail: nefeed@163.com
 * Desc:
 * Date: 2017-08-26
 * Time: 19:56
 */
public class PreRequestLogFilter extends ZuulFilter {
    protected static final String TAG = "PreRequestLogFilter";
    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        PreRequestLogFilter.LOGGER.info(String.format(String.format("send %s request to %s", request.getMethod(), request.getRequestURL().toString())));
        return null;
    }
}
