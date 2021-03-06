package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {

    private FileOutputStream fileOutputStream;

    public AdapterFileOutputStream(FileOutputStream fileOutputStream)
    {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException
    {
        fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException
    {
        byte[] charArray = s.getBytes();

        fileOutputStream.write( charArray);
    }

    @Override
    public void close() throws IOException
    {
        fileOutputStream.close();
    }
}

