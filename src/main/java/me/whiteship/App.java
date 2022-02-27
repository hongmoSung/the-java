package me.whiteship;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static net.bytebuddy.matcher.ElementMatchers.named;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        final Class<?> bookClass = Class.forName("me.whiteship.Book");
        final Constructor<?> constructor = bookClass.getConstructor(null);

        final Book book = (Book) constructor.newInstance();
        final Method f = Book.class.getDeclaredMethod("f");
        f.setAccessible(true);
        f.invoke(book);
    }
}
