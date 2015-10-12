/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.mvnsearch.infrastructure.jooq.Jooq;
import org.mvnsearch.infrastructure.jooq.Keys;
import org.mvnsearch.infrastructure.jooq.tables.records.BookToBookStoreRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStoreTable extends TableImpl<BookToBookStoreRecord> {

	private static final long serialVersionUID = -1002250766;

	/**
	 * The reference instance of <code>jooq.book_to_book_store</code>
	 */
	public static final BookToBookStoreTable BOOK_TO_BOOK_STORE = new BookToBookStoreTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<BookToBookStoreRecord> getRecordType() {
		return BookToBookStoreRecord.class;
	}

	/**
	 * The column <code>jooq.book_to_book_store.name</code>.
	 */
	public final TableField<BookToBookStoreRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>jooq.book_to_book_store.book_id</code>.
	 */
	public final TableField<BookToBookStoreRecord, Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>jooq.book_to_book_store.stock</code>.
	 */
	public final TableField<BookToBookStoreRecord, Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>jooq.book_to_book_store</code> table reference
	 */
	public BookToBookStoreTable() {
		this("book_to_book_store", null);
	}

	/**
	 * Create an aliased <code>jooq.book_to_book_store</code> table reference
	 */
	public BookToBookStoreTable(String alias) {
		this(alias, BOOK_TO_BOOK_STORE);
	}

	private BookToBookStoreTable(String alias, Table<BookToBookStoreRecord> aliased) {
		this(alias, aliased, null);
	}

	private BookToBookStoreTable(String alias, Table<BookToBookStoreRecord> aliased, Field<?>[] parameters) {
		super(alias, Jooq.JOOQ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<BookToBookStoreRecord> getPrimaryKey() {
		return Keys.KEY_BOOK_TO_BOOK_STORE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<BookToBookStoreRecord>> getKeys() {
		return Arrays.<UniqueKey<BookToBookStoreRecord>>asList(Keys.KEY_BOOK_TO_BOOK_STORE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookToBookStoreTable as(String alias) {
		return new BookToBookStoreTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public BookToBookStoreTable rename(String name) {
		return new BookToBookStoreTable(name, null);
	}
}
