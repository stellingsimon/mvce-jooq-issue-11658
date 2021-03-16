package org.jooq.mcve.test.kotlin

import org.jooq.conf.StatementType
import org.jooq.mcve.kotlin.tables.Test.Companion.TEST
import org.jooq.mcve.test.java.AbstractTest
import org.junit.Test

class KotlinTest : AbstractTest() {

    @Test
    fun mcveTestWorking() {
        ctx.settings().withStatementType(StatementType.STATIC_STATEMENT)
        ctx.truncate(TEST).execute()
        ctx
            .insertInto(TEST)
            .columns(TEST.ID, TEST.VALUE)
            .values(1, arrayOf("AB")) // stored as "AB", as expected.
            .execute()
    }

    @Test
    fun mcveTestFailing() {
        ctx.settings().withStatementType(StatementType.PREPARED_STATEMENT)
        ctx.truncate(TEST).execute()
        ctx
                .insertInto(TEST)
                .columns(TEST.ID, TEST.VALUE)
                .values(2, arrayOf("AB")) // stored as "A "!
                .execute()
    }
}