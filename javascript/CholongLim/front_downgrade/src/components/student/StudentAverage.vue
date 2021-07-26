<template>
    <div>
        <p> {{ students }} </p>
        <ul v-for="(sd,idx) in students_details" :key="idx">
            <li v-if="sd.grade == students[0]">
                평균 : {{ sd.text }}
            </li>
        </ul>
    </div>
</template>

<script>

import EventBus from '@/eventBus.js'

export default {
    data() {
        return {
            students_details: [
                {grade: '0', text: "평균 점수보다 낮습니다." },
                {grade: '1', text: "평균 점수와 동일합니다." },
                {grade: '2', text: "평균 점수보다 높습니다." }
            ],
            students: []
        }
    },
    created: function() {
        EventBus.$on('measureGrade', (payload) => {
            this.students = payload
        })
    }
}
</script>

<style scoped>


div {
    background:lightsalmon;
    color:red;
    padding: 10px;
    font-weight: bold;
}

ul {
    list-style: none;
}
</style>