package com.pnw.locale;

import java.util.Locale; 

import org.springframework.stereotype.Component; 

import com.hcl.hmtp.application.client.service.LocaleService;

import com.hcl.hmtp.common.client.exceptions.HMTPException; 

@Component
public class LocaleServiceImpl implements LocaleService { 

            @Override

            public Locale getUserLocale(String arg0, String arg1) throws HMTPException {

                        // TODO Auto-generated method stub

                        return new Locale("en", "US");

            } 

}