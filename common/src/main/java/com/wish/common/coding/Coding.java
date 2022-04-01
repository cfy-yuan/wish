package com.wish.common.coding;

/**
 * @Classname Coding
 * @Description :
 * @Date 2021/3/9 11:20
 * @Author cfy
 */
public enum Coding {
    /**
     * Unicode
     */
    UNICODE("Unicode"),
    /**
     * GBK
     */
    GBK("GBK"),
    /**
     * UTF-8
     */
    UTF8("UTF-8"),
    /**
     * UTF-16
     */
    UTF16("UTF-16");
    private String coding;

    Coding(String coding) {
        this.coding = coding;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }
}
