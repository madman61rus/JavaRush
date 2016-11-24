package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by vkompaniec on 23.11.16.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes type)
    {
        switch (type) {
            case JPG:
                return new JpgReader();
            case BMP:
                return new BmpReader();
            case PNG:
                return new PngReader();
        }

        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
