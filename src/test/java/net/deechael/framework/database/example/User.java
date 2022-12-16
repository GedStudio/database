package net.deechael.framework.database.example;

import net.deechael.framework.database.DataHolder;
import net.deechael.framework.database.DataProperty;
import net.deechael.framework.database.annotation.mysql.*;
import net.deechael.framework.database.type.MysqlType;

public class User implements DataHolder {

    @MySqlObject(type = MysqlType.INT)
    @PrimaryKey
    @Default("0")
    @AutoIncrement
    @Immutable
    @NotNull
    @Comment("The id of the user")
    public DataProperty<Integer> id;

    @MySqlObject(type = MysqlType.TEXT)
    public DataProperty<String> name;

    @MySqlObject(type = MysqlType.DECIMAL)
    @Argument({"5", "2"})
    public DataProperty<Double> money;

    @MySqlObject(type = MysqlType.VARCHAR)
    @Argument("10")
    public DataProperty<String> idk;

    @MySqlObject(type = MysqlType.ENUM)
    @ReflectJavaEnum(MysqlType.class)
    public DataProperty<MysqlType> type;

}
