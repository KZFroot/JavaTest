package com.oriented;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;

public class LocaleList {
    public static void main(String[] args) {
        //返回Java所支持的全部国家和语言的数组
        Locale[] locales = Locale.getAvailableLocales();
        //遍历数组的每一个元素，依次获取所支持的国家和语言
        for (int i = 0; i < locales.length; i++) {
            //输出所支持的国家和语言
            System.out.println(locales[i].getDisplayCountry() + "="
                    + locales[i].getCountry() + "="
                    + locales[i].getDisplayLanguage()
                    + "=" + locales[i].getLanguage());
        }
    }
}
