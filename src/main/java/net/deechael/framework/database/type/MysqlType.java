package net.deechael.framework.database.type;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum MysqlType {

    TINYINT(Long.class, Integer.class, Short.class, Byte.class),
    SMALLINT(Long.class, Integer.class, Short.class),
    MEDIUMINT(Long.class, Integer.class),
    INT(Long.class, Integer.class),
    BIGINT(Long.class),
    DECIMAL(Double.class, Float.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BIT(Long.class, Integer.class, Short.class, Byte.class),

    DATE(Date.class),
    TIME(Time.class),
    DATETIME(java.util.Date.class),
    TIMESTAMP(Timestamp.class),
    YEAR(Year.class),

    CHAR,
    VARCHAR,
    BINARY,
    VARBINARY,
    BLOB(Blob.class),
    TEXT,
    ENUM,
    SET,

    GEOMETRY,
    POINT,
    LINESTRING,
    POLYGON,

    MULTIPOINT,
    MULTILINESTRING,
    MULTIPOLYGON,
    GEOMETRYCOLLECTION,

    JSON;

    private final List<Class<?>> supported = new ArrayList<>();

    MysqlType(Class<?>... supportClasses) {
        Collections.addAll(this.supported, supportClasses);
    }

    public boolean isSupport(Class<?> clazz) {
        return this.supported.contains(clazz) || clazz == String.class;
    }


}
