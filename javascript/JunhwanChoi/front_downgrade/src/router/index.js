import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Test from '../views/Test.vue'
import Todo from '../views/Todo.vue'
import Homework from '../views/Homework.vue'

// board
import BoardListPage from '@/views/BoardListPage.vue'
import BoardRegisterPage from '@/views/BoardRegisterPage.vue'
import BoardReadPage from '@/views/BoardReadPage.vue'
import BoardModifyPage from '@/views/BoardModifyPage.vue'

// game
import GameMemberRegisterPage from '@/views/GameMemberRegisterPage.vue'

// 삼목
import Concave from '@/views/Concave.vue'


// monster
import MonsterListPage from '@/views/MonsterListPage.vue'
import MonsterRegisterPage from '@/views/MonsterRegisterPage.vue'
import MonsterReadPage from '@/views/MonsterReadPage.vue'
import MonsterModifyPage from '@/views/MonsterModifyPage.vue'

// EventBus
import EventBusTestPage from '@/views/EventBusTestPage.vue'

// 던전
import DungeonListPage from '@/views/DungeonListPage.vue'

// 학생
import StudentListPage from '@/views/StudentListPage.vue'



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
    props: {
      // 라우팅 파라미터를 props에 자동으로 설정하게 서포트함
      default: true
    }
  },
  {
    path: '/member/create',
    name: 'GameMemberRegisterPage',
    components: {
      default: GameMemberRegisterPage
    }
  },
  {
    path: '/concave',
    name: 'Concave',
    components: {
      default: Concave
    }
  },
  
  {
    path: '/monster',
    name: 'MonsterListPage',
    components: {
      default: MonsterListPage
    }
  },
  {
    path: '/monster/create',
    name: 'MonsterRegisterPage',
    components: {
      default: MonsterRegisterPage
    }
  },
  {
    path: '/monster/:monsterNo',
    name: 'MonsterReadPage',
    components: {
      default: MonsterReadPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/monster/:monsterNo/edit',
    name: 'MonsterModifyPage',
    components: {
      default: MonsterModifyPage
    },
    props: {
      default: true
    }
  },
  {
    path: '/eventbusTest',
    name: 'EventBusTestPage',
    components: {
      default: EventBusTestPage
    }
  },
  {
    path: '/dungeon',
    name: 'DungeonListPage',
    components: {
      default: DungeonListPage
    }
  },
  {
    path: '/student',
    name: 'StudentListPage',
    components: {
      default: StudentListPage
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router