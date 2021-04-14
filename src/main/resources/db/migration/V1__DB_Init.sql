
create sequence hibernate_sequence start 1 increment 1;
create table category
(
    id         int8 not null,
    image      varchar(999999),
    local_date date,
    name       varchar(255),
    slug       varchar(255),
    primary key (id)
);
create table category_sub_categories
(
    category_id       int8 not null,
    sub_categories_id int8 not null
);
create table news
(
    id          int8 not null,
    filename    varchar(2000000),
    information varchar(255),
    local_date  date,
    title       varchar(255),
    primary key (id)
);
create table product
(
    id                  int8   not null,
    filename            varchar(999999),
    local_date          date,
    price               float8 not null,
    product_color       varchar(255),
    product_description varchar(2048),
    product_name        varchar(255),
    quantity            varchar(255),
    slug                varchar(255),
    primary key (id)
);
create table subcategory
(
    id                     int8 not null,
    image                  varchar(999999),
    local_date             date,
    sub_category_name      varchar(255),
    sub_category_name_slug varchar(255),
    primary key (id)
);
create table subcategory_products
(
    sub_category_id int8 not null,
    products_id     int8 not null
);
create table user_role
(
    user_id int8 not null,
    roles   varchar(255)
);
create table usr
(
    id       int8 not null,
    password varchar(255),
    username varchar(255),
    primary key (id)
);
alter table if exists category_sub_categories add constraint UK_bvsvfpcbk584cpyecc213hl3m unique (sub_categories_id)
  ;
alter table if exists subcategory_products add constraint UK_n6bw6ka1l8g1w2da33xh7oosf unique (products_id)
    ;
alter table if exists category_sub_categories add constraint FKd7pj6xa72x9yjiaexdp8ktx3u foreign key (sub_categories_id) references subcategory
   ;
alter table if exists category_sub_categories add constraint FKaibc0jhojq2mftuvidt462xsd foreign key (category_id) references category
   ;
alter table if exists subcategory_products add constraint FK5w4ymbb28xggdgmg9qqu919pg foreign key (products_id) references product
;
alter table if exists subcategory_products add constraint FK3yp8gcfxh61d05cdh10dfts5d foreign key (sub_category_id) references subcategory
;
alter table if exists user_role add constraint FKfpm8swft53ulq2hl11yplpr5 foreign key (user_id) references usr;