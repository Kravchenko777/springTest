CREATE TABLE sys_users
(
    unique_id          BIGSERIAL                NOT NULL, -- Идентификатор записи. Первичный ключ
    name               character varying, -- Мнемоника
    is_active_login    boolean, -- Является ли авторизация по логину активной
    snils              character varying, -- СНИЛС
    created_timestamp  timestamp with time zone NOT NULL DEFAULT statement_timestamp(), -- Дата и время создания записи
    is_deleted         boolean                           DEFAULT false, -- Признак удалённой записи
    is_relevant        boolean DEFAULT true, -- Признак активности записи
    reason_to_create   character varying, -- Причина создания
    CONSTRAINT sys_users_pkey PRIMARY KEY (unique_id))
    WITH (
        OIDS = FALSE
    );
ALTER TABLE sys_users
    OWNER TO postgres;
COMMENT ON TABLE sys_users
    IS 'Таблица, содержащая атрибуты объекта - пользователи системы';