import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import gonggaoLaoshi from '@/views/modules/gonggaoLaoshi/list'
    import gonggaoQiye from '@/views/modules/gonggaoQiye/list'
    import jiuye from '@/views/modules/jiuye/list'
    import laoshi from '@/views/modules/laoshi/list'
    import qiye from '@/views/modules/qiye/list'
    import shixi from '@/views/modules/shixi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryGonggaoLaoshi from '@/views/modules/dictionaryGonggaoLaoshi/list'
    import dictionaryGonggaoQiye from '@/views/modules/dictionaryGonggaoQiye/list'
    import dictionaryQiye from '@/views/modules/dictionaryQiye/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShixi from '@/views/modules/dictionaryShixi/list'
    import dictionaryShixiJieguo from '@/views/modules/dictionaryShixiJieguo/list'
    import dictionaryYuanxi from '@/views/modules/dictionaryYuanxi/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryBanji',
        name: '班级',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryGonggaoLaoshi',
        name: '公告类型',
        component: dictionaryGonggaoLaoshi
    }
    ,{
        path: '/dictionaryGonggaoQiye',
        name: '公告类型',
        component: dictionaryGonggaoQiye
    }
    ,{
        path: '/dictionaryQiye',
        name: '行业',
        component: dictionaryQiye
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShixi',
        name: '实习信息类型',
        component: dictionaryShixi
    }
    ,{
        path: '/dictionaryShixiJieguo',
        name: '实习结果',
        component: dictionaryShixiJieguo
    }
    ,{
        path: '/dictionaryYuanxi',
        name: '院系',
        component: dictionaryYuanxi
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/gonggaoLaoshi',
        name: '老师发布的公告',
        component: gonggaoLaoshi
      }
    ,{
        path: '/gonggaoQiye',
        name: '企业发布的公告',
        component: gonggaoQiye
      }
    ,{
        path: '/jiuye',
        name: '就业信息',
        component: jiuye
      }
    ,{
        path: '/laoshi',
        name: '老师',
        component: laoshi
      }
    ,{
        path: '/qiye',
        name: '企业',
        component: qiye
      }
    ,{
        path: '/shixi',
        name: '实习信息',
        component: shixi
      }
    ,{
        path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
