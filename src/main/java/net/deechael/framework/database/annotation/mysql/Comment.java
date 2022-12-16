package net.deechael.framework.database.annotation.mysql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Add comment to a column</br>
 * Example: name TEXT COMMENT -> 'the name of the user' @MysqlObject(type = MySqlType.TEXT) @Comment(“the name of the user”) public String name;
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Comment {

    /**
     * @return The content of the comment
     */
    String value();

}
