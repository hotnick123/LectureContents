<template>
    <div align="center">
        <h3>학생 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">학생번호</th>
                <th align="center" width="350">이름</th>
                <th align="center" width="240">학년</th>
                <th align="center" width="240">성적</th>
            </tr>
            <tr v-if="!students || (Array.isArray(students) && students.length === 0)">
                <td colspan="4">
                학생 리스트 불러오기에 실패했습니다!
                </td>
            </tr>
            <tr v-else v-for="(student, idx) in students" :key="idx">
                <td align="center">{{ student.studentNo }}</td>
                <td align="center" v-on:click="averageStudent(student.grade, $event )">
                    {{ student.name }}</td>
                <td align="center">{{ student.schoolYear }}</td>
                <td align="center">{{ student.grade }}</td>
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
        averageStudent(grade, $event) {
            const payload = [ grade, $event.target.innerHTML ]
            
            EventBus.$emit('averageStudent', payload)
        }
    }
}
</script>