package net.deechael.framework.database;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Database base class
 */
public interface Database {

    /**
     * Create table, table name will be the name of the data class
     * @param dataClass data class
     * @return table creator
     * @param <T> data holder
     */
    @NotNull
    <T extends DataHolder> DataTableCreator<T> initializeTable(@NotNull Class<T> dataClass);

    /**
     * Find the table, return null if not exists
     * @param dataClass data class
     * @return table or null
     * @param <T> data holder
     */
    @Nullable
    <T extends DataHolder> DataTable<T> findTable(@NotNull Class<T> dataClass);

    /**
     * Find table whose name equals to the name of the data class
     * @param dataClass data class
     * @return if the table exists
     * @param <T> data holder
     */
    <T extends DataHolder> boolean hasTable(@NotNull Class<T> dataClass);

    /**
     * Get java sql connection
     * @return java sql connection
     */
    Connection connection();

    /**
     * Create statement
     * @return statement
     */
    Statement statement();

    /**
     * Create prepared statement
     * @return prepared statement
     */
    PreparedStatement preparedStatement();

}
