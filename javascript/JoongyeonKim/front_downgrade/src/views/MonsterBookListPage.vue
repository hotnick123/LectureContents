<template>
    <div id="monster">
        <h2>Vue + Spring 몬스터게시판 구현</h2>
        <router-link :to="{ name: 'MonsterBookRegisterPage' }">
            게시물 작성
        </router-link>
        <monster-book-list :monsters="monsters"/>
    </div>
</template>

<script>

import MonsterBookList from '@/components/monster/MonsterBookList.vue'
import { mapState, mapActions } from 'vuex'

export default {
    name: 'MonsterBookListPage',
    components: {
        MonsterBookList
    },
    computed: {
        ...mapState(['monsters'])
    },
    mounted () {
        this.fetchMonsterList()
    },
    methods: {
        ...mapActions(['fetchMonsterList'])
    }
}

</script>