<template>
    <div class="home">
        <div id="header">
            <router-link :to="{ name: 'Home' }"
                    class="nav-link"
                    active-class="active">
                Home
            </router-link>
            <router-link :to="{ name: 'Test' }"
                    class="nav-link"
                    active-class="active">
                Test
            </router-link>
            <router-link :to="{ name: 'Todo' }"
                    class="nav-link"
                    active-class="active">
                Todo
            </router-link>
            <router-link :to="{ name: 'Homework' }"
                    class="nav-link"
                    active-class="active">
                Homework
            </router-link>
            <router-link :to="{ name: 'BoardListPage' }"
                    class="nav-link"
                    active-class="active">
                BoardListPage
            </router-link>
            <router-link :to="{ name: 'MemberListPage' }"
                    class="nav-link"
                    active-class="active">
                MemberListPage
            </router-link>
            <router-link :to="{ name: 'ProductListPage' }"
                    class="nav-link"
                    active-class="active">
                ProductListPage
            </router-link>
            <router-link :to="{ name: 'MonsterBookListPage' }"
                    class="nav-link"
                    active-class="active">
                MonsterBookListPage
            </router-link>
            <router-link :to="{ name: 'Concave' }"
                    class="nav-link"
                    active-class="active">
                Concave
            </router-link>
            <router-link :to="{ name: 'EventBusTestPage' }"
                    class="nav-link"
                    active-class="active">
                EventBusTestPage
            </router-link>
            <router-link :to="{ name: 'DungeonListPage' }"
                    class="nav-link"
                    active-class="active">
                Dungeon 테스트
            </router-link>
            <router-link :to="{ name: 'ScoreManagerPage' }"
                    class="nav-link"
                    active-class="active">
                성적관리 테스트
            </router-link>
            <router-link :to="{ name: 'TriangleWidthPage' }"
                    class="nav-link"
                    active-class="active">
                TriangleWidth 테스트
            </router-link>
            <router-link :to="{ name: 'TriangleAreaSpringPage' }"
                    class="nav-link"
                    active-class="active">
                TriangleAreaSpringPage 테스트
            </router-link>
            <router-link :to="{ name: 'DaumNewsCrawlerPage' }"
                    class="nav-link"
                    active-class="active">
                다음 뉴스 크롤러
            </router-link>
        </div>
    </div>
</template>

<script>
  export default {
    name: 'Home',
    components: {
    },
  }
</script>
