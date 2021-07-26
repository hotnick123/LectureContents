<template>
    <div align="center">
        <h3>학생 성적 관리</h3>
        <table border="1">
            <tr>
                <th align="center" width="80">학생번호</th>
                <th align="center" width="150">학생명</th>
                <th align="center" width="300">성적</th>
            </tr>
            <tr v-if="!students || (Array.isArray(students) && students.length === 0)">
                <td colspan="3">
                    Error : 학생 정보가 존재하지 않습니다.
                </td>
            </tr>
            <tr v-else v-for="(student, idx) in students" :key="idx">
                <td align="center">{{ student.studentNo }}</td>
                <td align="center" v-on:click="measureGrade(student.grade, $event)">{{ student.name }}</td>
                <td align="right">{{ student.grade }}</td>
            </tr>
        </table>
    </div>
</template>

<script>

import EventBus from '@/eventBus.js'

export default {
    name: 'StudentList',
    props: {
        students: {
            type: Array
        }
    },
    methods: {
        measureGrade(grade, $event) {
            const payload = [grade, $event.target.innerHTML]
            EventBus.$emit('measureGrade', payload)
        }
    }
}
</script>