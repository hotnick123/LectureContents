import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Test from '../views/Test.vue'
import Todo from '../views/Todo.vue'
import Prob82 from '../views/Prob82.vue'

import BoardRegisterPage from '@/views/BoardRegisterPage.vue'
import BoardListPage from '@/views/BoardListPage.vue'

import MemberRegisterPage from '@/views/MemberRegisterPage.vue'
import MemberListPage from '@/views/MemberListPage.vue'
//@는 src, ..는 상위

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/test',
    name: 'Test',
    component: Test
  },
  {
    path: '/todo',
    name: 'Todo',
    component: Todo
  },
  {
    path: '/prob82',
    name: 'Prob82',
    component: Prob82
  },
  {
    path: '/board',
    name: 'BoardListPage',
    components: {
      default: BoardListPage
    }
  },
  {
    path: '/board/create',
    name: 'BoardRegisterPage',
    components: {
      default: BoardRegisterPage //components { default }이거 뭐지?
    }
  },
  {
    path: '/member',
    name: 'MemberListPage',
    components: {
      default: MemberListPage
    }
  },
  {
    path: '/member/create',
    name: 'MemberRegisterPage',
    components: {
      default: MemberRegisterPage 
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
