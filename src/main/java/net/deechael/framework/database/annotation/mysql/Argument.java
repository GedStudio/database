package net.deechael.framework.database.annotation.mysql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The field annotated with this annotation will fill arguments while creating table</br>
 * Example: money DECIMAL(5,3) -> @MysqlObject(type = MySqlType.DECIMAL) @Argument({"5", "3"}) public double money;
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Argument {

    /**
     * String should be quoted with "" or '' by hand
     * @return arguments
     */
    String[] value();

}
