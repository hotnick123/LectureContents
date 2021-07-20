import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Test from '../views/Test.vue'
import Todo from '../views/Todo.vue'
import Quiz from '../views/Quiz.vue'

// Monster
import MonsterSignupPage from '../views/MonsterSignupPage.vue'

// Board
import BoardListPage from '@/views/board/BoardListPage.vue'
import BoardRegisterPage from '@/views/board/BoardRegisterPage.vue'
import BoardReadPage from '@/views/board/BoardReadPage'
import BoardModifyPage from '@/views/board/BoardModifyPage'

// Product
import ProductListPage from '@/views/product/ProductListPage'
import ProductRegisterPage from '@/views/product/ProductRegisterPage'
import ProductReadPage from '@/views/product/ProductReadPage'

// 삼목
import Concave from '@/views/Concave'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    // path: 실제 url 맵핑 경로
    path: '/test',
    // 보편적으로 name과 component는 같은 이름을 사용,
    // 눈에 보여질 페이지가 배치(보통 views 폴더에 생성)
    name: 'Test',
    component: Test
  },

// Todo
  {
    path: '/todo',
    name: 'Todo',
    component: Todo
  },

// Monster
  {
    path: '/quiz',
    name: 'Quiz',
    component: Quiz
  },
  {
    path: '/quiz/signup',
    name: 'MonsterSignupPage',
    components: {
      default: MonsterSignupPage
    }
  },
// Board
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
    path: '/board/:boardNo',
    name: 'BoardReadPage',
    components: {
      default: BoardReadPage
    },
    props: {
      default: true
    } 
  },
  {
    path: '/board/:boardNo/edit',
    name: 'BoardModifyPage',
    components: {
      default: BoardModifyPage
    },
    // 라우터 파라미터를 props에 자동으로 설정하게 서포트
    props: {
      default: true
    } 
  },

// Product
  {
    path: '/quiz/product',
    name: 'ProductListPage',
    components: {
      default: ProductListPage
    } 
  },
  {
    path: '/quiz/product/create',
    name: 'ProductRegisterPage',
    components: {
      default: ProductRegisterPage
    } 
  },
  {
    path: '/quiz/product/:productNo',
    name: 'ProductReadPage',
    components: {
      default: ProductReadPage
    },
    props: {
      default: true
    } 
  },

// 삼목
  {
    path: '/concave',
    name: 'Concave',
    components: {
      default: Concave
    }
  }

  
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
