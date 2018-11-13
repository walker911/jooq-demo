/*
 * This file is generated by jOOQ.
 */
package com.walker.jooq.jooqdemo.model;


import com.walker.jooq.jooqdemo.model.tables.AdminUser;
import com.walker.jooq.jooqdemo.model.tables.Authority;
import com.walker.jooq.jooqdemo.model.tables.AuthorityUser;
import com.walker.jooq.jooqdemo.model.tables.ExchangeLog;
import com.walker.jooq.jooqdemo.model.tables.ExchangeRecord;
import com.walker.jooq.jooqdemo.model.tables.ExchangeUser;
import com.walker.jooq.jooqdemo.model.tables.MoneyStatus;
import com.walker.jooq.jooqdemo.model.tables.OilCard;
import com.walker.jooq.jooqdemo.model.tables.Phone;
import com.walker.jooq.jooqdemo.model.tables.RecodeDetail;
import com.walker.jooq.jooqdemo.model.tables.UserWhite;
import com.walker.jooq.jooqdemo.model.tables.WxExchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Exchange extends SchemaImpl {

    private static final long serialVersionUID = 1320538454;

    /**
     * The reference instance of <code>exchange</code>
     */
    public static final Exchange EXCHANGE = new Exchange();

    /**
     * The table <code>exchange.admin_user</code>.
     */
    public final AdminUser ADMIN_USER = com.walker.jooq.jooqdemo.model.tables.AdminUser.ADMIN_USER;

    /**
     * The table <code>exchange.authority</code>.
     */
    public final Authority AUTHORITY = com.walker.jooq.jooqdemo.model.tables.Authority.AUTHORITY;

    /**
     * The table <code>exchange.authority_user</code>.
     */
    public final AuthorityUser AUTHORITY_USER = com.walker.jooq.jooqdemo.model.tables.AuthorityUser.AUTHORITY_USER;

    /**
     * 日志表
     */
    public final ExchangeLog EXCHANGE_LOG = com.walker.jooq.jooqdemo.model.tables.ExchangeLog.EXCHANGE_LOG;

    /**
     * 兑换记录
     */
    public final ExchangeRecord EXCHANGE_RECORD = com.walker.jooq.jooqdemo.model.tables.ExchangeRecord.EXCHANGE_RECORD;

    /**
     * 兑换人兑换信息关联表
     */
    public final ExchangeUser EXCHANGE_USER = com.walker.jooq.jooqdemo.model.tables.ExchangeUser.EXCHANGE_USER;

    /**
     * 面值余量提醒
     */
    public final MoneyStatus MONEY_STATUS = com.walker.jooq.jooqdemo.model.tables.MoneyStatus.MONEY_STATUS;

    /**
     * 油卡
     */
    public final OilCard OIL_CARD = com.walker.jooq.jooqdemo.model.tables.OilCard.OIL_CARD;

    /**
     * The table <code>exchange.phone</code>.
     */
    public final Phone PHONE = com.walker.jooq.jooqdemo.model.tables.Phone.PHONE;

    /**
     * 兑换记录详情 包含油卡和微信记录
     */
    public final RecodeDetail RECODE_DETAIL = com.walker.jooq.jooqdemo.model.tables.RecodeDetail.RECODE_DETAIL;

    /**
     * 领卡人白名单
     */
    public final UserWhite USER_WHITE = com.walker.jooq.jooqdemo.model.tables.UserWhite.USER_WHITE;

    /**
     * 微信提现表
     */
    public final WxExchange WX_EXCHANGE = com.walker.jooq.jooqdemo.model.tables.WxExchange.WX_EXCHANGE;

    /**
     * No further instances allowed
     */
    private Exchange() {
        super("exchange", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AdminUser.ADMIN_USER,
            Authority.AUTHORITY,
            AuthorityUser.AUTHORITY_USER,
            ExchangeLog.EXCHANGE_LOG,
            ExchangeRecord.EXCHANGE_RECORD,
            ExchangeUser.EXCHANGE_USER,
            MoneyStatus.MONEY_STATUS,
            OilCard.OIL_CARD,
            Phone.PHONE,
            RecodeDetail.RECODE_DETAIL,
            UserWhite.USER_WHITE,
            WxExchange.WX_EXCHANGE);
    }
}