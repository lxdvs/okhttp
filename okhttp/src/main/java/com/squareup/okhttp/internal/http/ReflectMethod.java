package com.squareup.okhttp.internal.http;

public interface ReflectMethod {
    public void setMethodReflect(String method) throws SecurityException, NoSuchFieldException;
}