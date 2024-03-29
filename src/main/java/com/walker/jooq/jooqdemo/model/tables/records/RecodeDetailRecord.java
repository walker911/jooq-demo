/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model.tables.records;


import com.walker.jooq.jooqdemo.model.tables.RecodeDetail;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 兑换记录详情 包含油卡和微信记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RecodeDetailRecord extends UpdatableRecordImpl<RecodeDetailRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 531552679;

    /**
     * Setter for <code>exchange.recode_detail.id</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>exchange.recode_detail.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>exchange.recode_detail.recode_id</code>. 兑换记录id
     */
    public void setRecodeId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>exchange.recode_detail.recode_id</code>. 兑换记录id
     */
    public String getRecodeId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>exchange.recode_detail.exchange_id</code>. 油卡或者微信交易记录id
     */
    public void setExchangeId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>exchange.recode_detail.exchange_id</code>. 油卡或者微信交易记录id
     */
    public String getExchangeId() {
        return (String) get(2);
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
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RecodeDetail.RECODE_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RecodeDetail.RECODE_DETAIL.RECODE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RecodeDetail.RECODE_DETAIL.EXCHANGE_ID;
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
        return getRecodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getExchangeId();
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
        return getRecodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getExchangeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecodeDetailRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecodeDetailRecord value2(String value) {
        setRecodeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecodeDetailRecord value3(String value) {
        setExchangeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecodeDetailRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RecodeDetailRecord
     */
    public RecodeDetailRecord() {
        super(RecodeDetail.RECODE_DETAIL);
    }

    /**
     * Create a detached, initialised RecodeDetailRecord
     */
    public RecodeDetailRecord(String id, String recodeId, String exchangeId) {
        super(RecodeDetail.RECODE_DETAIL);

        set(0, id);
        set(1, recodeId);
        set(2, exchangeId);
    }
}
