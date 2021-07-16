import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Test from '../views/Test.vue'
import Todo from '../views/Todo.vue'
import Homework from '../views/Homework.vue'

// board 그리고 @는 src 폴더 자체를 의미 함
import BoardListPage from '@/views/BoardListPage.vue'
import BoardRegisterPage from '@/views/BoardRegisterPage.vue'

// member
import MemberSignupPage from '@/views/MemberSignupPage.vue'
import MemberRegisterPage from '@/views/MemberRegisterPage.vue'

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
    path: '/homework',
    name: 'Homework',
    component: Homework
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
      default: BoardRegisterPage
    }
  },
  {
    path: '/member',
    name: 'MemberSignupPage',
    components: {
      default: MemberSignupPage
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