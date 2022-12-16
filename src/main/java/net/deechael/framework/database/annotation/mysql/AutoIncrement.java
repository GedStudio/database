package net.deechael.framework.database.annotation.mysql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The field annotated with this annotation will be auto increment</br>
 * Example: id INT AUTO_INCREMENT -> @MysqlObject(type = MySqlType.INT) @AutoIncrement public int id;
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoIncrement {
}
