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
import com.walker.jooq.jooqdemo.model.tables.records.AdminUserRecord;
import com.walker.jooq.jooqdemo.model.tables.records.AuthorityRecord;
import com.walker.jooq.jooqdemo.model.tables.records.AuthorityUserRecord;
import com.walker.jooq.jooqdemo.model.tables.records.ExchangeLogRecord;
import com.walker.jooq.jooqdemo.model.tables.records.ExchangeRecordRecord;
import com.walker.jooq.jooqdemo.model.tables.records.ExchangeUserRecord;
import com.walker.jooq.jooqdemo.model.tables.records.MoneyStatusRecord;
import com.walker.jooq.jooqdemo.model.tables.records.OilCardRecord;
import com.walker.jooq.jooqdemo.model.tables.records.PhoneRecord;
import com.walker.jooq.jooqdemo.model.tables.records.RecodeDetailRecord;
import com.walker.jooq.jooqdemo.model.tables.records.UserWhiteRecord;
import com.walker.jooq.jooqdemo.model.tables.records.WxExchangeRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>exchange</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AdminUserRecord> KEY_ADMIN_USER_PRIMARY = UniqueKeys0.KEY_ADMIN_USER_PRIMARY;
    public static final UniqueKey<AuthorityRecord> KEY_AUTHORITY_PRIMARY = UniqueKeys0.KEY_AUTHORITY_PRIMARY;
    public static final UniqueKey<AuthorityUserRecord> KEY_AUTHORITY_USER_PRIMARY = UniqueKeys0.KEY_AUTHORITY_USER_PRIMARY;
    public static final UniqueKey<ExchangeLogRecord> KEY_EXCHANGE_LOG_PRIMARY = UniqueKeys0.KEY_EXCHANGE_LOG_PRIMARY;
    public static final UniqueKey<ExchangeRecordRecord> KEY_EXCHANGE_RECORD_PRIMARY = UniqueKeys0.KEY_EXCHANGE_RECORD_PRIMARY;
    public static final UniqueKey<ExchangeUserRecord> KEY_EXCHANGE_USER_PRIMARY = UniqueKeys0.KEY_EXCHANGE_USER_PRIMARY;
    public static final UniqueKey<MoneyStatusRecord> KEY_MONEY_STATUS_PRIMARY = UniqueKeys0.KEY_MONEY_STATUS_PRIMARY;
    public static final UniqueKey<OilCardRecord> KEY_OIL_CARD_PRIMARY = UniqueKeys0.KEY_OIL_CARD_PRIMARY;
    public static final UniqueKey<PhoneRecord> KEY_PHONE_PRIMARY = UniqueKeys0.KEY_PHONE_PRIMARY;
    public static final UniqueKey<RecodeDetailRecord> KEY_RECODE_DETAIL_PRIMARY = UniqueKeys0.KEY_RECODE_DETAIL_PRIMARY;
    public static final UniqueKey<UserWhiteRecord> KEY_USER_WHITE_PRIMARY = UniqueKeys0.KEY_USER_WHITE_PRIMARY;
    public static final UniqueKey<WxExchangeRecord> KEY_WX_EXCHANGE_PRIMARY = UniqueKeys0.KEY_WX_EXCHANGE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AdminUserRecord> KEY_ADMIN_USER_PRIMARY = Internal.createUniqueKey(AdminUser.ADMIN_USER, "KEY_admin_user_PRIMARY", AdminUser.ADMIN_USER.ID);
        public static final UniqueKey<AuthorityRecord> KEY_AUTHORITY_PRIMARY = Internal.createUniqueKey(Authority.AUTHORITY, "KEY_authority_PRIMARY", Authority.AUTHORITY.ID);
        public static final UniqueKey<AuthorityUserRecord> KEY_AUTHORITY_USER_PRIMARY = Internal.createUniqueKey(AuthorityUser.AUTHORITY_USER, "KEY_authority_user_PRIMARY", AuthorityUser.AUTHORITY_USER.ID);
        public static final UniqueKey<ExchangeLogRecord> KEY_EXCHANGE_LOG_PRIMARY = Internal.createUniqueKey(ExchangeLog.EXCHANGE_LOG, "KEY_exchange_log_PRIMARY", ExchangeLog.EXCHANGE_LOG.ID);
        public static final UniqueKey<ExchangeRecordRecord> KEY_EXCHANGE_RECORD_PRIMARY = Internal.createUniqueKey(ExchangeRecord.EXCHANGE_RECORD, "KEY_exchange_record_PRIMARY", ExchangeRecord.EXCHANGE_RECORD.ID);
        public static final UniqueKey<ExchangeUserRecord> KEY_EXCHANGE_USER_PRIMARY = Internal.createUniqueKey(ExchangeUser.EXCHANGE_USER, "KEY_exchange_user_PRIMARY", ExchangeUser.EXCHANGE_USER.ID);
        public static final UniqueKey<MoneyStatusRecord> KEY_MONEY_STATUS_PRIMARY = Internal.createUniqueKey(MoneyStatus.MONEY_STATUS, "KEY_money_status_PRIMARY", MoneyStatus.MONEY_STATUS.ID);
        public static final UniqueKey<OilCardRecord> KEY_OIL_CARD_PRIMARY = Internal.createUniqueKey(OilCard.OIL_CARD, "KEY_oil_card_PRIMARY", OilCard.OIL_CARD.ID);
        public static final UniqueKey<PhoneRecord> KEY_PHONE_PRIMARY = Internal.createUniqueKey(Phone.PHONE, "KEY_phone_PRIMARY", Phone.PHONE.ID);
        public static final UniqueKey<RecodeDetailRecord> KEY_RECODE_DETAIL_PRIMARY = Internal.createUniqueKey(RecodeDetail.RECODE_DETAIL, "KEY_recode_detail_PRIMARY", RecodeDetail.RECODE_DETAIL.ID);
        public static final UniqueKey<UserWhiteRecord> KEY_USER_WHITE_PRIMARY = Internal.createUniqueKey(UserWhite.USER_WHITE, "KEY_user_white_PRIMARY", UserWhite.USER_WHITE.ID);
        public static final UniqueKey<WxExchangeRecord> KEY_WX_EXCHANGE_PRIMARY = Internal.createUniqueKey(WxExchange.WX_EXCHANGE, "KEY_wx_exchange_PRIMARY", WxExchange.WX_EXCHANGE.ID);
    }
}
