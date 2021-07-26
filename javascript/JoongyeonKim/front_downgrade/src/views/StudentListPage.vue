<template>
    <div id="board">
        <h2>학생들의 성적을 알아보자</h2>
        <student-list :students="students"/>
        <class-average></class-average> 
    </div>
</template>

<script>
import StudentList from '@/components/student/StudentList.vue'
import ClassAverage from '../components/student/ClassAverage.vue'

import { mapState, mapActions } from 'vuex'

export default {
    name: 'StudentListPage',
    components: {
        StudentList,
        ClassAverage
    },
    computed: {
        ...mapState(['students'])
    },
    mounted () {
        this.studentAverageTest()
    },
    methods: {
        ...mapActions(['studentAverageTest'])
    }
}
</script> 