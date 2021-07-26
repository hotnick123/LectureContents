<template>
    <div>
        <p>{{ students }}</p>
        <ul v-for="(sa, idx) in students_details" :key="idx"> <!-- :key="idx"로 설정해서 idx를 인식하여 포문을 돌게한다 (중복날때 에러가 안남) -->
            <li v-if="sa.grade == students[0]">
                학생이름: {{ students[1] }} 성적" {{ students[0] }}<br>
                {{ sa.text }}
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
                { grade: '75', text: "평균보다 높습니다!" },
                { grade: '68', text: "정확히 평균입니다!" },
                { grade: '44', text: "평균보다 낮습니다!" },
            ],
            students: []
        }
    },
    created: function() {
        EventBus.$on('averageStudent', (payload) => {
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