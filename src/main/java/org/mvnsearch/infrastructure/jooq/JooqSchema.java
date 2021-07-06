/*
 * This file is generated by jOOQ.
 */
package org.mvnsearch.infrastructure.jooq;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.mvnsearch.infrastructure.jooq.tables.AuthorTable;
import org.mvnsearch.infrastructure.jooq.tables.BookStoreTable;
import org.mvnsearch.infrastructure.jooq.tables.BookTable;
import org.mvnsearch.infrastructure.jooq.tables.BookToBookStoreTable;
import org.mvnsearch.infrastructure.jooq.tables.LanguageTable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq</code>
     */
    public static final JooqSchema JOOQ = new JooqSchema();

    /**
     * The table <code>jooq.author</code>.
     */
    public final AuthorTable AUTHOR = AuthorTable.AUTHOR;

    /**
     * The table <code>jooq.book</code>.
     */
    public final BookTable BOOK = BookTable.BOOK;

    /**
     * The table <code>jooq.book_store</code>.
     */
    public final BookStoreTable BOOK_STORE = BookStoreTable.BOOK_STORE;

    /**
     * The table <code>jooq.book_to_book_store</code>.
     */
    public final BookToBookStoreTable BOOK_TO_BOOK_STORE = BookToBookStoreTable.BOOK_TO_BOOK_STORE;

    /**
     * The table <code>jooq.language</code>.
     */
    public final LanguageTable LANGUAGE = LanguageTable.LANGUAGE;

    /**
     * No further instances allowed
     */
    private JooqSchema() {
        super("jooq", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            AuthorTable.AUTHOR,
            BookTable.BOOK,
            BookStoreTable.BOOK_STORE,
            BookToBookStoreTable.BOOK_TO_BOOK_STORE,
            LanguageTable.LANGUAGE
        );
    }
}
