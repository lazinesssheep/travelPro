// 菜单配置
// headerMenuConfig：头部导航配置
// asideMenuConfig：侧边导航配置

const headerMenuConfig = [
  {
    name: '首页',
    path: '/',
    icon: 'home',
  }
];

const asideMenuConfig = [
  {
    name: '首页',
    path: '/dashboard',
    icon: 'home',
    children: [
      {
        name: '监控页',
        path: '/dashboard/monitor',
      },
    ],
  },
  {
    name: '商品管理',
    path: '/post',
    icon: 'copy',
    children: [
      { name: '商品列表', path: '/post/list' },
      { name: '添加商品', path: '/post/create' },
    ],
  },
  {
    name: '用户管理',
    path: '/cate',
    icon: 'cascades',
    children: [
      { name: '用户列表', path: '/cate/list' },
      { name: '添加用户', path: '/cate/create' },
    ],
  },
  {
    name: '评论管理',
    path: '/tag',
    icon: 'pin',
    children: [
      { name: '评论列表', path: '/tag/list' },
      { name: '添加评论', path: '/tag/create' },
    ],
  },
  {
    name: '订单管理',
    path: '/tag',
    icon: 'pin',
    children: [
      { name: '订单列表', path: '/tag/list' },
    ],
  },
  {
    name: '管理员管理',
    path: '/users',
    icon: 'yonghu',
    children: [
      { name: '用户列表', path: '/users/list' },
      { name: '添加用户', path: '/users/create' },
      { name: '修改密码', path: '/users/pwd' },
    ],
  },
  {
    name: '通用设置',
    path: '/setting',
    icon: 'shezhi',
    children: [
      { name: '基础设置', path: '/setting/basic' },
      {
        name: '菜单设置',
        path: '/setting/navigation',
      },
    ],
  },
];

export { headerMenuConfig, asideMenuConfig };
