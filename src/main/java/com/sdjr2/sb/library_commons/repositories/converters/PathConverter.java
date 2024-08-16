package com.sdjr2.sb.library_commons.repositories.converters;

import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

/**
 * {@link PathConverter} class.
 * <p>
 * <strong>Repository (DAO)</strong> - Represents a class which converts a path to string.
 *
 * @author Jacinto R^2
 * @version 1.0
 * @category Repository (DAO)
 * @upgrade 24/08/12
 * @since 24/08/12
 */
@Converter
public class PathConverter implements AttributeConverter<Path, String> {

    @Override
    public String convertToDatabaseColumn(Path path) {
        return path.toString();
    }

    @Override
    public Path convertToEntityAttribute(String path) {
        return Paths.get(path);
    }
}
