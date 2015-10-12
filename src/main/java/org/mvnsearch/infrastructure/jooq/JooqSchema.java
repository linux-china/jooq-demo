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
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JooqSchema extends SchemaImpl {

	private static final long serialVersionUID = -1445972834;

	/**
	 * The reference instance of <code>jooq</code>
	 */
	public static final JooqSchema JOOQ = new JooqSchema();

	/**
	 * No further instances allowed
	 */
	private JooqSchema() {
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
