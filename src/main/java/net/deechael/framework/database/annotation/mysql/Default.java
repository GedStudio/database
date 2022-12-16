package net.deechael.framework.database.annotation.mysql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Set the default value of the column</br>
 * Example: name TEXT DEFAULT 'dummy' -> @MysqlObject(type = MySqlType.TEXT) @Default(“'dummy'”) public String name;
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

    /**
     * String should be quoted with "" or '' by hand
     * @return The default value of this column
     */
    String value();

}
