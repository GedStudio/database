package net.deechael.framework.database.annotation.mysql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Example: type ENUM(A,B,C) -> @MysqlObject(type = MySqlType.ENUM) @ReflectJavaEnum(Type.class) public Type type;</br>
 * public enum Type {</br>
 *     A, B, C;</br>
 * }</br>
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ReflectJavaEnum {

    /**
     * @return The enum class to be reflected
     */
    Class<? extends Enum<?>> value();

}
