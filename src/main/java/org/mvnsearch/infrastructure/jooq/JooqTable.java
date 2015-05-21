/**
 * This class is generated by jOOQ
 */
package org.mvnsearch.infrastructure.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

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
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqTable extends SchemaImpl {

	private static final long serialVersionUID = 1628501118;

	/**
	 * The reference instance of <code>jooq</code>
	 */
	public static final JooqTable JOOQ = new JooqTable();

	/**
	 * No further instances allowed
	 */
	private JooqTable() {
		super("jooq");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			AuthorTable.AUTHOR,
			BookTable.BOOK,
			BookStoreTable.BOOK_STORE,
			BookToBookStoreTable.BOOK_TO_BOOK_STORE,
			LanguageTable.LANGUAGE);
	}
}
