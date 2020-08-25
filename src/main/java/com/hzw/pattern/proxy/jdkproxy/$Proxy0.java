package com.hzw.pattern.proxy.jdkproxy;

import java.lang.reflect.*;

public class $Proxy0 implements com.hzw.pattern.proxy.jdkproxy.Singer {
    MyInvocationHandler h;

    public $Proxy0(MyInvocationHandler h) {
        this.h = h;
    }

    @Override
    public int sing(java.lang.String arg0) {
        try {
            Method m = com.hzw.pattern.proxy.jdkproxy.Singer.class.getMethod("sing", new Class[]{java.lang.String.class});
            return ((java.lang.Integer) this.h.invoke(this, m, new Object[]{arg0})).intValue();
        } catch (Error _ex) {
        } catch (Throwable e) {
            throw new UndeclaredThrowableException(e);
        }
        return 0;
    }
}
