<template>
    <div id="board">
        <h2>공지사항</h2>
        <router-link :to="{ name: 'NoticeBoardRegisterPage' }">
            글쓰기
        </router-link>
        <board-list :boards="boards"/>
    </div>
</template>

<script>
import BoardList from '@/components/board/notice/BoardList.vue'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'BoardListPage',
    components: {
        BoardList
    },
    computed: {
        ...mapState(['boards'])
    },
    mounted () {
        this.fetchBoardList()
    },
    methods: {
        ...mapActions(['fetchBoardList'])
    }
}
</script>