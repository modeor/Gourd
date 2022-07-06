import Vue from 'vue'
import VueRouter from 'vue-router'
/* Layout */
import Layout from '@/layout'

Vue.use(VueRouter)
const routes = [
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard'
  }
]

const router = new VueRouter({
  routes
})

export default router
