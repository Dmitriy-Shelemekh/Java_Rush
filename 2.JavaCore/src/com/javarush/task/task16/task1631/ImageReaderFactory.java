package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Dmitriy Shelemekh on 30.07.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes imageType) {
        if (imageType == ImageTypes.JPG) return new JpgReader();
        if (imageType == ImageTypes.BMP) return new BmpReader();
        if (imageType == ImageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
