#创建数据库
create database travel;

#用户表
create table `t_user` (
  `id` bigint(20) not null auto_increment comment '主键',
  `username` varchar(128) default null comment '用户名',
  `password` varchar(128) default null comment '密码',
  `email` varchar(256) default null comment '邮箱',
  `state` char(1) default '1' comment '启用状态 0-停用 1-启用',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='用户表';

#管理员表
create table `t_manager` (
  `id` bigint(20) not null auto_increment comment '主键',
  `username` varchar(128) default null comment '用户名',
  `password` varchar(128) default null comment '密码',
  `state` char(1) default '1' comment '启用状态 0-停用 1-启用',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='用户表';

#商品表-主表
create table `t_good` (
  `id` bigint(20) not null auto_increment comment '主键',
  `title` varchar(128) default null comment '商品名称',
  `desc` varchar(256) default null comment '商品描述',
  `address` varchar(256) default null comment '商品描述',
  `starting_point` varchar(256) default null comment '起点',
  `ending_point` varchar(256) default null comment '终点',
  `duration` varchar(256) default null comment '时长',
  `highlights` text default null comment '',
  `state` char(1) default '1' comment '启用状态 0-停用 1-启用',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表';

#商品表-画廊
create table `t_gallery` (
  `id` bigint(20) not null auto_increment comment '主键',
  `good_id` bigint(20) not null comment '商品id',
  `gallery_url` varchar(256) default null comment '图片地址',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表-画廊';

#商品表-行程
create table `t_itinerary` (
  `id` bigint(20) not null auto_increment comment '主键',
  `good_id` bigint(20) not null comment '商品id',
  `duration` varchar(256) default null comment '持续时间',
  `countries` varchar(256) default null comment '地址',
  `ages` varchar(256) default null comment '年龄段',
  `starting_point` varchar(256) default null comment '起点',
  `ending_point` varchar(256) default null comment '终点',
  `introduction` varchar(256) default null comment '介绍',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表-行程';

#商品表-行程-日程
create table `t_itinerary_day` (
  `id` bigint(20) not null auto_increment comment '主键',
  `itinerary_id` bigint(20) not null comment '行程id',
  `accommodation_id` bigint(20) not null comment '酒店id',
  `content` varchar(256) default null comment '内容',
  `starting_time` varchar(256) default null comment '开始时间',
  `ending_time` varchar(256) default null comment '结束时间',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表-行程-日程';

#商品表-包含服务表
create table `t_good_included` (
  `id` bigint(20) not null auto_increment comment '主键',
  `good_id` bigint(20) not null comment '商品id',
  `title` varchar(256) default null comment '服务名称',
  `desc` text default null comment '服务介绍',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表-包含服务表';

#商品表-订单
create table `t_good_order` (
  `id` bigint(20) not null auto_increment comment '主键',
  `good_id` bigint(20) not null comment '商品id',
  `starting_time` varchar(256) default null comment '开始时间',
  `starting_week` varchar(256) default null comment '开始星期',
  `ending_time` varchar(256) default null comment '结束时间',
  `ending_week` varchar(256) default null comment '结束星期',
  `total` varchar(125) default null comment '总票数',
  `residue` varchar(125) default null comment '余票',
  `price` varchar(125) default null comment '价格',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表-订单';

#商品表-点评
create table `t_good_reviews` (
  `id` bigint(20) not null auto_increment comment '主键',
  `good_id` bigint(20) not null comment '商品id',
  `content` text default null comment '内容',
  `review_time` text default null comment '时间',
  `support_num` varchar(128) default '0' comment '赞',
  `un_support_num` varchar(128) default '0' comment '踩',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='商品表-点评';

#订单表
create table `t_order` (
  `id` bigint(20) not null auto_increment comment '主键',
  `good_id` bigint(20) not null comment '商品id',
  `good_order_id` bigint(20) not null comment '商品订单id',
  `order_no` varchar(256) not null comment '订单号',
  `Address` varchar(256) not null comment '地址',
  `City` varchar(256) not null comment '市',
  `Postal` varchar(256) not null comment '邮政',
  `Province` varchar(256) not null comment '省',
  `order_time` varchar(256) not null comment '下单时间',
  `order_status` char(1) not null comment '订单状态',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='订单表';

#订单表-支付表
create table `t_order_payinfo` (
  `id` bigint(20) not null auto_increment comment '主键',
  `order_id` bigint(20) not null comment '订单id',
  `pay_name` varchar(256) not null comment '支付方式',
  `pay_amount` varchar(256) not null comment '支付金额',
  `pay_time` varchar(256) not null comment '支付时间',
  `pay_status` char(1) not null comment '支付状态',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='订单表-支付表';

#订单表-旅客
create table `t_order_traveller` (
  `id` bigint(20) not null auto_increment comment '主键',
  `order_id` bigint(20) not null comment '订单id',
  `surname` varchar(128) not null comment '姓',
  `name` varchar(128) not null comment '名字',
  `sex` char(1) not null comment '性别',
  `age` varchar(128) not null comment '年龄',
  `email` varchar(128) not null comment '邮箱',
  `phone` varchar(128) not null comment '手机',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='订单表-旅客';

#酒店表
create table `t_accommodation` (
  `id` bigint(20) not null auto_increment comment '主键',
  `name` varchar(256) default null comment '酒店名称',
  `url` varchar(256) default null comment '图片',
  `status` char(1) default '1' comment '状态',
  `create_time` datetime default null comment '创建时间',
  `create_userid` varchar(128) default null comment '创建人',
  `update_time` datetime default null on update current_timestamp comment '修改时间',
  `update_userid` varchar(128) default null comment '更新人',
  primary key (`id`)
) engine=innodb default charset=utf8 row_format=compact comment='酒店表';


