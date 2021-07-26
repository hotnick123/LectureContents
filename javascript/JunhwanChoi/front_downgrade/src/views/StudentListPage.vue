<template>
    <div id="board">
        <h2>매번 새롭게 갱신되는 학생들 ㅋㅋ!</h2>
        <student-list :students="students"/>
        <student-grade-measure></student-grade-measure>
    </div>
</template>

<script>
import StudentList from '@/components/student/StudentList.vue'
import StudentGradeMeasure from '@/components/student/StudentGradeMeasure.vue'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'StudentListPage',
    components: {
        StudentList,
        StudentGradeMeasure
    },
    computed: {
        ...mapState(['students'])
    },
    mounted () {
        this.randomStudentList()
    },
    methods: {
        ...mapActions(['randomStudentList'])
    }
}
</script>