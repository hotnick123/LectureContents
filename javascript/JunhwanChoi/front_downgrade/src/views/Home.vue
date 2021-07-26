<template>
    <div class="home">
        <div id="header">
            <router-link :to="{ name: 'Home' }"
                    class="nav-link"
                    active-class="active">
                Home
            </router-link><br><br>
            <router-link :to="{ name: 'Test' }"
                    class="nav-link"
                    active-class="active">
                Test
            </router-link><br><br>
            <router-link :to="{ name: 'Todo' }"
                    class="nav-link"
                    active-class="active">
                Todo
            </router-link><br><br>
            <router-link :to="{ name: 'Homework' }"
                    class="nav-link"
                    active-class="active">
                Homework
            </router-link><br><br>
            <router-link :to="{ name: 'BoardListPage' }"
                    class="nav-link"
                    active-class="active">
                BoardListPage
            </router-link><br><br>
            <router-link :to="{ name: 'GameMemberRegisterPage' }"
                    class="nav-link"
                    active-class="active">
                GameMemberRegisterPage
            </router-link><br><br>
            <router-link :to="{ name: 'Concave' }"
                    class="nav-link"
                    active-class="active">
                Concave
            </router-link><br><br>
            <router-link :to="{ name: 'MonsterListPage' }"
                    class="nav-link"
                    active-class="active">
                몬스터 도감
            </router-link><br><br>
            <router-link :to="{ name: 'EventBusTestPage' }"
                    class="nav-link"
                    active-class="active">
                EventBusTestPage
            </router-link><br><br>
              <router-link :to="{ name: 'DungeonListPage' }"
                    class="nav-link"
                    active-class="active">
                Dungeon 테스트
            </router-link><br><br>
             <router-link :to="{ name: 'StudentListPage' }"
                    class="nav-link"
                    active-class="active">
                StudentListPage
            </router-link><br><br>


            

            
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