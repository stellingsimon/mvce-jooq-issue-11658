/*
 * This file is generated by jOOQ.
 */
package org.jooq.mcve.kotlin.tables.records


import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.mcve.kotlin.tables.Test


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TestRecord() : UpdatableRecordImpl<TestRecord>(Test.TEST), Record2<Int?, Array<String?>> {

    var id: Int?
        set(value) = set(0, value)
        get() = get(0) as Int?

    var value: Array<String?>?
        set(value) = set(1, value)
        get() = get(1) as Array<String?>?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row2<Int?, Array<String?>> = super.fieldsRow() as Row2<Int?, Array<String?>>
    override fun valuesRow(): Row2<Int?, Array<String?>> = super.valuesRow() as Row2<Int?, Array<String?>>
    override fun field1(): Field<Int?> = Test.TEST.ID
    override fun field2(): Field<Array<String?>?> = Test.TEST.VALUE
    override fun component1(): Int? = id
    override fun component2(): Array<String?>? = value
    override fun value1(): Int? = id
    override fun value2(): Array<String?>? = value

    override fun value1(value: Int?): TestRecord {
        this.id = value
        return this
    }

    override fun value2(value: Array<String?>?): TestRecord {
        this.value = value
        return this
    }

    override fun values(value1: Int?, value2: Array<String?>?): TestRecord {
        this.value1(value1)
        this.value2(value2)
        return this
    }

    /**
     * Create a detached, initialised TestRecord
     */
    constructor(id: Int? = null, value: Array<String?>? = null): this() {
        this.id = id
        this.value = value
    }
}
