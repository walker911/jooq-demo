/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables.records;


import com.walker.jooq.jooqdemo.model.tables.MoneyStatus;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 面值余量提醒
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MoneyStatusRecord extends UpdatableRecordImpl<MoneyStatusRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = -1339272471;

    /**
     * Setter for <code>exchange.money_status.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>exchange.money_status.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>exchange.money_status.money</code>. 面值  50-200张 100-100张
     */
    public void setMoney(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>exchange.money_status.money</code>. 面值  50-200张 100-100张
     */
    public String getMoney() {
        return (String) get(1);
    }

    /**
     * Setter for <code>exchange.money_status.status</code>. 面值余量状态 0不足  1充足
     */
    public void setStatus(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>exchange.money_status.status</code>. 面值余量状态 0不足  1充足
     */
    public Integer getStatus() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MoneyStatus.MONEY_STATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MoneyStatus.MONEY_STATUS.MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return MoneyStatus.MONEY_STATUS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoneyStatusRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoneyStatusRecord value2(String value) {
        setMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoneyStatusRecord value3(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MoneyStatusRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MoneyStatusRecord
     */
    public MoneyStatusRecord() {
        super(MoneyStatus.MONEY_STATUS);
    }

    /**
     * Create a detached, initialised MoneyStatusRecord
     */
    public MoneyStatusRecord(String id, String money, Integer status) {
        super(MoneyStatus.MONEY_STATUS);

        set(0, id);
        set(1, money);
        set(2, status);
    }
}