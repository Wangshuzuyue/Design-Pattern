package com.hzw.pattern.singleton.register;

/**
 * @Auther: huangzuwang
 * @Date: 2019/3/10 15:31
 * @Description:
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
