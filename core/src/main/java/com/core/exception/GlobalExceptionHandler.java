package com.core.exception;

import com.core.response.ResponseJSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {
    public static  final  String ERROR_VIEW="error";
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @org.springframework.web.bind.annotation.ExceptionHandler(value=Exception.class)
    public Object errorHandler(HttpServletRequest request,
                               HttpServletResponse response,Exception e){
        logger.error("classname:{},msg:{}",e.getClass().getName(),e.getMessage());
        if(isAjax(request)){
            return ResponseJSONResult.errorException(e.getMessage());
        }else{
            ModelAndView mav=new ModelAndView();
            mav.addObject("exception",e);
            mav.addObject("url",request.getRequestURL());
            mav.setViewName(ERROR_VIEW);
            return mav;
        }

    }

    public  boolean  isAjax(HttpServletRequest httprequest){
        return  httprequest.getHeader("X-Requested-With")!=null && "XMLHttpRequest"
                .equals(httprequest.getHeader("X-Requested-With").toString());
    }
}