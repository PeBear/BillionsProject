/*
 * This file is generated by jOOQ.
 */
package vn.team.system.repository.model.tables;


import vn.team.system.repository.model.Indexes;
import vn.team.system.repository.model.Keys;
import vn.team.system.repository.model.Personel;
import vn.team.system.repository.model.tables.records.StaffRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Staff extends TableImpl<StaffRecord> {

    private static final long serialVersionUID = 85277344;

    /**
     * The reference instance of <code>Personel.Staff</code>
     */
    public static final Staff STAFF = new Staff();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffRecord> getRecordType() {
        return StaffRecord.class;
    }

    /**
     * The column <code>Personel.Staff.Id</code>.
     */
    public final TableField<StaffRecord, String> ID = createField(DSL.name("Id"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Name</code>.
     */
    public final TableField<StaffRecord, String> NAME = createField(DSL.name("Name"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Gender</code>.
     */
    public final TableField<StaffRecord, Boolean> GENDER = createField(DSL.name("Gender"), org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Birthday</code>.
     */
    public final TableField<StaffRecord, LocalDate> BIRTHDAY = createField(DSL.name("Birthday"), org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Photo</code>.
     */
    public final TableField<StaffRecord, String> PHOTO = createField(DSL.name("Photo"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Email</code>.
     */
    public final TableField<StaffRecord, String> EMAIL = createField(DSL.name("Email"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Phone</code>.
     */
    public final TableField<StaffRecord, String> PHONE = createField(DSL.name("Phone"), org.jooq.impl.SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Salary</code>.
     */
    public final TableField<StaffRecord, Double> SALARY = createField(DSL.name("Salary"), org.jooq.impl.SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>Personel.Staff.Notes</code>.
     */
    public final TableField<StaffRecord, String> NOTES = createField(DSL.name("Notes"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>Personel.Staff.DepartId</code>.
     */
    public final TableField<StaffRecord, String> DEPARTID = createField(DSL.name("DepartId"), org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * Create a <code>Personel.Staff</code> table reference
     */
    public Staff() {
        this(DSL.name("Staff"), null);
    }

    /**
     * Create an aliased <code>Personel.Staff</code> table reference
     */
    public Staff(String alias) {
        this(DSL.name(alias), STAFF);
    }

    /**
     * Create an aliased <code>Personel.Staff</code> table reference
     */
    public Staff(Name alias) {
        this(alias, STAFF);
    }

    private Staff(Name alias, Table<StaffRecord> aliased) {
        this(alias, aliased, null);
    }

    private Staff(Name alias, Table<StaffRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Staff(Table<O> child, ForeignKey<O, StaffRecord> key) {
        super(child, key, STAFF);
    }

    @Override
    public Schema getSchema() {
        return Personel.PERSONEL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STAFF_DEPARTID);
    }

    @Override
    public UniqueKey<StaffRecord> getPrimaryKey() {
        return Keys.KEY_STAFF_PRIMARY;
    }

    @Override
    public List<UniqueKey<StaffRecord>> getKeys() {
        return Arrays.<UniqueKey<StaffRecord>>asList(Keys.KEY_STAFF_PRIMARY);
    }

    @Override
    public List<ForeignKey<StaffRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StaffRecord, ?>>asList(Keys.STAFF_IBFK_1);
    }

    public Depart depart() {
        return new Depart(this, Keys.STAFF_IBFK_1);
    }

    @Override
    public Staff as(String alias) {
        return new Staff(DSL.name(alias), this);
    }

    @Override
    public Staff as(Name alias) {
        return new Staff(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Staff rename(String name) {
        return new Staff(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Staff rename(Name name) {
        return new Staff(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, Boolean, LocalDate, String, String, String, Double, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
