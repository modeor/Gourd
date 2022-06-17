import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import LoginView from '../views/LoginView.vue'
import AboutView from '../views/AboutView.vue'



const routes = [
    {
        path: '/',
        name: '首页',
        component: HomeView
    },
    {
        path: '/login',
        name: '登录',
        component: LoginView
    },
    {
        path: '/about',
        name: 'About',
        component: AboutView
    }
]

const router = createRouter({
    routes,
    history: createWebHashHistory()
})

router.beforeEach((to, form, next) => {
    //登录界面登录成功后，会把用户信息保存在会话
    //存在时间为会话生命周期，页面关闭即失效。
    let user = sessionStorage.getItem('user');
    if (to.path == '/login') {
        //如果是访问登录界面，用户会话信息已存在，代表已登录，跳转到主页
        if (user) {
            next({ path: '/' })
        } else {
            next()
        }
    } else {
        //如果访问非登录页面,且用户会话不存在，代表未登录，跳转到登录页面
        if (!user) {
            next({ path: '/login' })
        } else {
            next()
        }
    }
}
)
export default router
