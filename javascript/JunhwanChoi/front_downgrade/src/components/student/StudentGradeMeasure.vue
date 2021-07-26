<template>
    <div>
        <p>{{ students }}</p>
        <ul v-for="(sd, idx) in students_details" :key="idx">
            <li v-if="sd.studentGrade == students[0]">
                학생이름: {{ students[1] }}, 성적: {{ students[0] }}<br>
                {{ sd.grade }}
            </li>
        </ul>
    </div>
</template>

<script>
import EventBus from '@/eventBus.js'
export default {
    data () {
        return {
            students_details: [
                { studentGrade: '1', grade: "바보" },
                { studentGrade: '2', grade: "공부좀해" },
                { studentGrade: '3', grade: "공부좀더해" },
                { studentGrade: '4', grade: "좋아" },   
            ],
            students: []
        }
    },
    created: function() {
        EventBus.$on('measureStudentGrade', (payload) => {
            this.students = payload
        })
    }
}
</script>

<style scoped>
div {
    background: #ff4081;
    color: white;
    padding: 10px;
    font-weight: bold;
}
ul {
    list-style: none;
}
</style>