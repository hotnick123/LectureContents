<template>
    <div id="board">
        <h2>기말고사 성적표</h2>
        <student-score-list :students="students"/>
        <score-average-measure></score-average-measure>
    </div>
</template>

<script>

import StudentScoreList from '@/components/student/StudentScoreList.vue'
import ScoreAverageMeasure from '@/components/student/ScoreAverageMeasure.vue'
import { mapState, mapActions } from 'vuex'

export default {
    name: 'StudentScoreListPage',
    components: {
        StudentScoreList,
        ScoreAverageMeasure
    },
    computed: {
        ...mapState(['students'])
    },
    mounted () {
        this.fetchStudentScoreList()
    },
    methods: {
        ...mapActions(['fetchStudentScoreList'])
    }
}
</script>

