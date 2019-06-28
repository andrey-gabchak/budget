CREATE TABLE currency
(
    id               SERIAL      NOT NULL PRIMARY KEY,
    name             VARCHAR(50) NOT NULL,
    is_main_currency BOOLEAN     NOT NULL,
    exchange_rate    NUMERIC(4, 2)
);

CREATE TABLE wallet
(
    id                          SERIAL       NOT NULL PRIMARY KEY,
    name                        VARCHAR(100) NOT NULL,
    balance                     INT          NOT NULL,
    is_income                   BOOLEAN      NOT NULL,
    is_count_in_general_balance BOOLEAN      NOT NULL,
    fk_currency_id              INT,
    FOREIGN KEY (fk_currency_id) REFERENCES currency (id)
);

CREATE TABLE category
(
    id          SERIAL       NOT NULL PRIMARY KEY,
    name        VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255),
    is_income   BOOLEAN      NOT NULL
);

CREATE TABLE record
(
    id             SERIAL  NOT NULL PRIMARY KEY,
    fk_wallet_id   INT     NOT NULL,
    fk_category_id INT     NOT NULL,
    is_income      BOOLEAN NOT NULL,
    date           DATE    NOT NULL,
    comment        VARCHAR(255),
    FOREIGN KEY (fk_wallet_id) REFERENCES wallet (id),
    FOREIGN KEY (fk_category_id) REFERENCES category (id)
);

CREATE TABLE transaction_between_wallets
(
    id                    SERIAL     NOT NULL PRIMARY KEY,
    fk_income_wallet      INT        NOT NULL,
    fk_expenditure_wallet INT        NOT NULL,
    income_sum            NUMERIC(2) NOT NULL,
    expenditure_sum       NUMERIC(2) NOT NULL,
    commission            NUMERIC(5, 2),
    comment               VARCHAR(255),
    FOREIGN KEY (fk_income_wallet) REFERENCES wallet (id),
    FOREIGN KEY (fk_expenditure_wallet) REFERENCES wallet (id)
);