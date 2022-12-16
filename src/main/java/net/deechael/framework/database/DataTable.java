package net.deechael.framework.database;

import org.jetbrains.annotations.NotNull;

/**
 * Table in the database
 * @param <T> data holder
 */
public interface DataTable<T extends DataHolder> {

    /**
     * Create a new data holder which won't be added to database automatically
     * @return An empty data holder
     */
    T create();

    /**
     * Store data</br>
     * Replace:</br>
     * - true -> update if exists, or else insert</br>
     * - false -> insert</br>
     * @param t data holder
     * @param replace mode
     * @return re-lookup data
     */
    T store(@NotNull T t, boolean replace);

    /**
     * Delete the data
     * @param t data holder
     */
    void delete(@NotNull T t);

    /**
     * Trying to lookup datas
     * @return lookuper
     */
    DataLookup<T> lookup();

    /**
     * @return the owner of the table
     */
    Database database();

}
