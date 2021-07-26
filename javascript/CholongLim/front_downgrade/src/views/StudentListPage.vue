<template>
    <div id="student">
        <h2>학생 성적 관리표</h2>
        <student-list :students="students"/>
        <student-average></student-average>
    </div>
</template>

<script>
import StudentList from '@/components/student/StudentList.vue'
import StudentAverage from '@/components/student/StudentAverage.vue'
import { mapState, mapActions } from 'vuex'
export default {
    name: 'StudentListPage',
    components: {
        StudentList,
        StudentAverage
    },
    computed: {
        ...mapState(['students'])
    },
    mounted () {
        this.averageStudentList()
    },
    methods: {
        ...mapActions(['averageStudentList'])
    }
}
</script>